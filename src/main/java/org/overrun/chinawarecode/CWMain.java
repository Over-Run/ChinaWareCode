package org.overrun.chinawarecode;

import org.objectweb.asm.ClassVisitor;
import org.overrun.chinawarecode.cnw.CnwParser;
import org.overrun.chinawarecode.cnw.GetClass;
import org.overrun.chinawarecode.cnw.annotation.CnwRegistry;
import org.parboiled.Parboiled;
import org.parboiled.common.StringUtils;
import org.parboiled.errors.ErrorUtils;
import org.parboiled.parserunners.ReportingParseRunner;
import org.parboiled.support.ParsingResult;

import java.util.Scanner;
import java.util.Set;

import static org.parboiled.support.ParseTreeUtils.printNodeTree;

public class CWMain {
    public static final Set<Class<?>> registry = GetClass.getClasses("org", CnwRegistry.class);
    public static void main(String[] args) {
        registry.addAll(GetClass.getClasses("io", CnwRegistry.class));
        registry.addAll(GetClass.getClasses("cn", CnwRegistry.class));
        for (Class<?> aClass : registry) {
            System.out.println(aClass);
        }

        CnwParser<Void> cnw  = Parboiled.createParser(CnwParser.class);
        while (true) {
            String in = new Scanner(System.in).nextLine();
            if (StringUtils.isEmpty(in)) break;
            ParsingResult<?> result = new ReportingParseRunner(cnw.CNW()).run(in);
            if (!result.parseErrors.isEmpty()) {
                System.out.println(ErrorUtils.printParseError(result.parseErrors.get(0)));
            } else {
                System.out.println(printNodeTree(result) + '\n');
            }
        }
    }
}
