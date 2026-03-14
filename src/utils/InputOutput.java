package utils;

import arrays.IntegerArray;
import linkedlist.LinkedList;

import java.util.Arrays;

public class InputOutput {
    public static void printIntegerArray(IntegerArray integerArray) {
        java.lang.IO.println(Arrays.toString(integerArray.getArray()));
    }

    public static void printLinkedList(LinkedList linkedList) {
        java.lang.IO.println(linkedList.toString());
    }
}
