package com.sparta.jk;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestRemoveDuplicates {

    RemoveDuplicates removeDuplicates = new RemoveDuplicates();

    @Test
    public void testThatOneDuplicateStringIsRemoved() {
        String[] stringEquals = {"hi", "hello"};
        String[] stringCheck = {"hello", "hi", "hello"};
        Assertions.assertArrayEquals(stringEquals, removeDuplicates.removeDuplicates(stringCheck));
    }

    @Test
    public void testThatMultipleDuplicateStringsAreRemoved() {
        String[] stringEquals = {"hi", "hello"};
        String[] stringCheck = {"hello", "hello", "hi", "hello", "hello", "hello", "hello"};
        Assertions.assertArrayEquals(stringEquals, removeDuplicates.removeDuplicates(stringCheck));
    }

    @Test
    public void testThatMultipleDuplicateEmptyStringsAreRemoved() {
        String[] stringEquals = {"hi", "hello", ""};
        String[] stringCheck = {"", "hello", "hi", "", "hello", "", ""};
        Assertions.assertArrayEquals(stringEquals, removeDuplicates.removeDuplicates(stringCheck));
    }

    @Test
    public void testThatDuplicateIntegersAreRemoved() {
        Integer[] integerEquals = {2, 4, 5, 1, 3, 6, 7};
        Integer[] integerCheck = {1, 2, 3, 4, 5, 6, 7, 1, 3, 6, 7};
        Assertions.assertArrayEquals(integerEquals, removeDuplicates.removeDuplicates(integerCheck));
    }

    @Test
    public void testThatMixedTypeArrayRemovesDuplicates(){
        Object[] objectEquals = {3, 1, 2, "hello", "hi"};
        Object[] objectCheck = {"hi", 2, 3, 1, 2, "hello", "hi"};
        Assertions.assertArrayEquals(objectEquals, removeDuplicates.removeDuplicates(objectCheck));
    }

    @Test
    public void testThatSingleNullValuesAreNotRemoved(){
        Object[] objectEquals = {1, 3, 2, null};
        Object[] objectCheck = {1, 3, 2, null};
        Assertions.assertArrayEquals(objectEquals, removeDuplicates.removeDuplicates(objectCheck));
    }

    @Test
    public void testThatDuplicateNullValuesAreRemoved(){
        Object[] objectEquals = {1, 3, 2, null};
        Object[] objectCheck = {1, 3, 2, null, null, null};
        Assertions.assertArrayEquals(objectEquals, removeDuplicates.removeDuplicates(objectCheck));
    }

}
