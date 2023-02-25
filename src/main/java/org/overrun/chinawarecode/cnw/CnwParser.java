package org.overrun.chinawarecode.cnw;

import org.overrun.chinawarecode.cnw.annotation.CnwRegistry;
import org.parboiled.BaseParser;
import org.parboiled.Parboiled;
import org.parboiled.Rule;
import org.parboiled.annotations.BuildParseTree;
import org.parboiled.common.StringUtils;
import org.parboiled.errors.ErrorUtils;
import org.parboiled.parserunners.ReportingParseRunner;
import org.parboiled.support.ParsingResult;
import org.reflections.Reflections;
import org.reflections.util.ConfigurationBuilder;

import java.util.Scanner;
import java.util.Set;

import static org.parboiled.support.ParseTreeUtils.printNodeTree;

@SuppressWarnings("rawtypes")
@BuildParseTree
public class CnwParser extends BaseParser<Object> {

    public static void main(String[] args) {
        Set<Class<?>> classes = GetClass.getClasses("org", CnwRegistry.class);
        for (Class<?> aClass : classes) {
            System.out.println(aClass);
        }

        CnwParser cnw  = Parboiled.createParser(CnwParser.class);
        while (true) {
            String in = new Scanner(System.in).nextLine();
            if (StringUtils.isEmpty(in)) break;
            ParsingResult<?> result = new ReportingParseRunner(cnw.main()).run(in);
            if (!result.parseErrors.isEmpty()) {
                System.out.println(ErrorUtils.printParseError(result.parseErrors.get(0)));
            } else {
                System.out.println(printNodeTree(result) + '\n');
            }
        }
    }
    public Rule main() {
        return Sequence(
                Test(A(), 'c'),
                OneOrMore('a')
        );
    }
    public Rule A() {
        return Sequence('a', Optional(A()), 'b');
    }
    public Rule B() {
        return Sequence('b', Optional(B()), 'c');
    }


}
