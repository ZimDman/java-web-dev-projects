package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here

    @Test
    public void stringEmptyReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void singleBracketsBeforeOtherCharacters() {
        String testData = "[]launchCode";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result);
    }

    @Test
    public void entireWordInSingleBrackets() {
        String testData = "[launchCode]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result);
    }

    @Test
    public void partOfWordInSingleBrackets() {
        String testData = "launch[Code]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result);
    }

    @Test
    public void oneBracketUsedWithWord() {
        String testData = "[launchCode";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(result);
    }

    @Test
    public void bracketsInReverseOrder() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void bracketsInReverseOrderSurroundingWord() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void oneReverseBracketUsed() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void creatingNestedBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[ test ]]"));
    }

    @Test
    public void multiplePairsInBracketsInString() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[hi] [i am] [not] [lost]"));
    }

    @Test
    public void multipleNestedPairsInString() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[hi]] [[i am]] [[not]] [[lost]]"));
    }


}