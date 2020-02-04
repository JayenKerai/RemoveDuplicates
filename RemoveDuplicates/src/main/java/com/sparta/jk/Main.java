package com.sparta.jk;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        Object[] objArray = new Object[]{"hi", 2, 3, 1, 2, "hello", "hi"}; //should return [3, 1, 2, hello, hi]
        System.out.println(Arrays.toString(removeDuplicates.removeDuplicates(objArray)));
    }
}
