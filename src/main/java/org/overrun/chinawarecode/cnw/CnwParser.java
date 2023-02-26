package org.overrun.chinawarecode.cnw;

import org.overrun.chinawarecode.cnw.annotation.CnwRegistry;
import org.parboiled.BaseParser;
import org.parboiled.Parboiled;
import org.parboiled.Rule;
import org.parboiled.annotations.BuildParseTree;
import org.parboiled.common.StringUtils;
import org.parboiled.common.Utils;
import org.parboiled.errors.ErrorUtils;
import org.parboiled.parserunners.ReportingParseRunner;
import org.parboiled.support.ParsingResult;

import java.util.Scanner;
import java.util.Set;

import static org.parboiled.support.ParseTreeUtils.printNodeTree;

@SuppressWarnings("rawtypes")
@BuildParseTree
public class CnwParser extends BaseParser<Object> {
    public Rule main() {
        return null;
    }
}
