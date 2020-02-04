package com.sparta.jk;

public class RemoveDuplicates {

    public Object[] removeDuplicates(Object[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if (array[i].equals(array[j])) {
                    array[j] = null;
                }
            }
        }
        Object[] newArray = new Object[array.length - nullValueCounter(array)];
        int newArrayCount = 0;
        for (Object o : array) {
            if (o != null) {
                newArray[newArrayCount] = o;
                newArrayCount++;
            }
        }
        return newArray;
    }

    private int nullValueCounter(Object[] array) {
        int counter = 0;
        for (Object o : array) {
            if (o == null) {
                counter++;
            }
        }
        return counter;
    }
}
