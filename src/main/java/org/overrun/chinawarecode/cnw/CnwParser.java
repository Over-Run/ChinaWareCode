package org.overrun.chinawarecode.cnw;

import javassist.compiler.ast.ASTList;
import org.overrun.chinawarecode.cnw.annotation.CnwRegistry;
import org.overrun.chinawarecode.cnw.rewriterule.ReRule;
import org.parboiled.BaseParser;
import org.parboiled.Parboiled;
import org.parboiled.Rule;
import org.parboiled.annotations.BuildParseTree;
import org.parboiled.annotations.Cached;
import org.parboiled.annotations.DontLabel;
import org.parboiled.common.StringUtils;
import org.parboiled.common.Utils;
import org.parboiled.errors.ErrorUtils;
import org.parboiled.matchers.OneOrMoreMatcher;
import org.parboiled.parserunners.ReportingParseRunner;
import org.parboiled.support.ParsingResult;

import java.util.Scanner;
import java.util.Set;

import static org.parboiled.support.ParseTreeUtils.printNodeTree;

/**
 * @author baka4n
 * @param <T> object or other
 */
@BuildParseTree
public class CnwParser<T> extends BaseParser<T> {
    public Rule CNW() {
        return ReRule.String();
    }


}
