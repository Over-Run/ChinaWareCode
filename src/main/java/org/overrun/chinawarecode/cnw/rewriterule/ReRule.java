package org.overrun.chinawarecode.cnw.rewriterule;

import org.parboiled.Action;
import org.parboiled.Rule;
import org.parboiled.annotations.*;
import org.parboiled.common.Utils;
import org.parboiled.errors.GrammarException;
import org.parboiled.matchers.*;
import org.parboiled.support.Characters;
import org.parboiled.support.Checks;

import static org.parboiled.BaseParser.ANY;
import static org.parboiled.BaseParser.NOTHING;
import static org.parboiled.common.Preconditions.checkArgNotNull;
import static org.parboiled.common.Preconditions.checkArgument;

/**
 * @author parboiled, baka4n
 * @since 重新写入的rule
 */
public class ReRule {

    /**
     * @author baka4n
     * @return rule
     */
    public static Rule String() {

        return Sequence('"', ZeroOrMore(Sequence(TestNot(AnyOf("\r\n\"\\")), ANY)) , '"');
    }

    @DontLabel
    public static Rule AnyOf(String characters) {
        checkArgNotNull(characters, "characters");
        return AnyOf(characters.toCharArray());
    }

    @DontLabel
    public static Rule AnyOf(char[] characters) {
        checkArgNotNull(characters, "characters");
        checkArgument(characters.length > 0);
        return characters.length == 1 ? Ch(characters[0]) : AnyOf(Characters.of(characters));
    }

    @Cached
    @DontLabel
    public static Rule AnyOf(Characters characters) {
        checkArgNotNull(characters, "characters");
        if (!characters.isSubtractive() && characters.getChars().length == 1) {
            return Ch(characters.getChars()[0]);
        }
        if (characters.equals(Characters.NONE)) return NOTHING;
        return new AnyOfMatcher(characters);
    }

    @Cached
    @SuppressNode
    @DontLabel
    public static Rule TestNot(Object rule) {
        Rule subMatcher = toRule(rule);
        return new TestNotMatcher(subMatcher);
    }
    @DontLabel
    public static Rule TestNot(Object rule, Object rule2, Object... moreRules) {
        checkArgNotNull(moreRules, "moreRules");
        return TestNot(Sequence(rule, rule2, moreRules));
    }

    @Cached
    @DontLabel
    public static Rule ZeroOrMore(Object rule) {
        return new ZeroOrMoreMatcher(toRule(rule));
    }

    /**
     * Creates a new rule that tries repeated matches of the sequence of the given sub rules.
     * Succeeds always, even if the sub sequence doesn't match even once.
     * <p>Note: This methods provides caching, which means that multiple invocations with the same
     * arguments will yield the same rule instance.</p>
     *
     * @param rule      the first subrule
     * @param rule2     the second subrule
     * @param moreRules the other subrules
     * @return a new rule
     */
    @DontLabel
    public static Rule ZeroOrMore(Object rule, Object rule2, Object... moreRules) {
        checkArgNotNull(moreRules, "moreRules");
        return ZeroOrMore(Sequence(rule, rule2, moreRules));
    }



    @Cached
    @DontLabel
    public static Rule CharRange(char cLow, char cHigh) {
        return cLow == cHigh ? Ch(cLow) : new CharRangeMatcher(cLow, cHigh);
    }

    @Cached
    @DontLabel
    public static Rule FirstOf(Object[] rules) {
        checkArgNotNull(rules, "rules");
        if (rules.length == 1) {
            return toRule(rules[0]);
        }
        Rule[] convertedRules = toRules(rules);
        char[][] chars = new char[rules.length][];
        for (int i = 0, convertedRulesLength = convertedRules.length; i < convertedRulesLength; i++) {
            Object rule = convertedRules[i];
            if (rule instanceof StringMatcher) {
                chars[i] = ((StringMatcher) rule).characters;
            } else {
                return new FirstOfMatcher(convertedRules);
            }
        }
        return new FirstOfStringsMatcher(convertedRules, chars);
    }

    @DontLabel
    public static Rule FirstOf(Object rule, Object rule2, Object... moreRules) {
        checkArgNotNull(moreRules, "moreRules");
        return FirstOf(Utils.arrayOf(rule, rule2, moreRules));
    }

    @DontLabel
    public static Rule Sequence(Object rule, Object rule2, Object... moreRules) {
        checkArgNotNull(moreRules, "moreRules");
        return Sequence(Utils.arrayOf(rule, rule2, moreRules));
    }

    @Cached
    @DontLabel
    public static Rule Sequence(Object[] rules) {
        checkArgNotNull(rules, "rules");
        return rules.length == 1 ? toRule(rules[0]) : new SequenceMatcher(toRules(rules));
    }

    @DontExtend
    public static Rule[] toRules(Object... objects) {
        checkArgNotNull(objects, "objects");
        Rule[] rules = new Rule[objects.length];
        for (int i = 0; i < objects.length; i++) {
            rules[i] = toRule(objects[i]);
        }
        return rules;
    }
    @Cached
    @DontLabel
    public static Rule OneOrMore(Object rule) {
        return new OneOrMoreMatcher(toRule(rule));
    }

    @DontExtend
    public static Rule toRule(Object obj) {
        if (obj instanceof Rule) return (Rule) obj;
        if (obj instanceof Character) return fromCharLiteral((Character) obj);
        if (obj instanceof String) return fromStringLiteral((String) obj);
        if (obj instanceof char[]) return fromCharArray((char[]) obj);
        if (obj instanceof Action action) {
            return new ActionMatcher(action);
        }
        Checks.ensure(!(obj instanceof Boolean), "Rule specification contains an unwrapped Boolean value, " +
                "if you were trying to specify a parser action wrap the expression with ACTION(...)");

        throw new GrammarException("'" + obj + "' cannot be automatically converted to a parser Rule");
    }

    @DontExtend
    protected static Rule fromStringLiteral(String string) {
        checkArgNotNull(string, "string");
        return fromCharArray(string.toCharArray());
    }

    @Cached
    @SuppressSubnodes
    @DontLabel
    public static Rule String(char... characters) {
        if (characters.length == 1) return Ch(characters[0]); // optimize one-char strings
        Rule[] matchers = new Rule[characters.length];
        for (int i = 0; i < characters.length; i++) {
            matchers[i] = Ch(characters[i]);
        }
        return new StringMatcher(matchers, characters);
    }

    @DontExtend
    protected static Rule fromCharArray(char[] array) {
        checkArgNotNull(array, "array");
        return String(array);
    }

    @DontExtend
    protected static Rule fromCharLiteral(char c) {
        return Ch(c);
    }

    @Cached
    @DontLabel
    public static Rule Ch(char c) {
        return new CharMatcher(c);
    }
}
