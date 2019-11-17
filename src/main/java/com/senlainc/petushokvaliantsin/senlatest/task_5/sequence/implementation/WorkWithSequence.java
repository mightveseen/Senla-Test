package com.senlainc.petushokvaliantsin.senlatest.task_5.sequence.implementation;

import com.senlainc.petushokvaliantsin.senlatest.task_5.sequence.IWorkWithSequence;
import static com.senlainc.petushokvaliantsin.senlatest.Main.RESET_MENU_COLOR;
import static com.senlainc.petushokvaliantsin.senlatest.Main.SET_MENU_COLOR;

import java.util.Arrays;
import java.util.stream.IntStream;

public class WorkWithSequence implements IWorkWithSequence {
    /** Fill array with N elements */
    private int[] fillArray(int bufSizeSequence) {
        int mainSequence[] = IntStream.rangeClosed(01, bufSizeSequence).toArray();
        return mainSequence;
    }
    /** Find palindrome */
    private int findPalindrome(int bufArrayVariable) {
        StringBuilder reverseVariable = new StringBuilder();
        reverseVariable.append(bufArrayVariable);
        return Integer.parseInt(reverseVariable.reverse().toString());
    }
    /** Return result */
    @Override
    public String toString(int bufSizeSequence, int bufArrayVariable) {
        if (Arrays.binarySearch(fillArray(bufSizeSequence), findPalindrome(bufArrayVariable)) >= 0) {
            return "For variable: " + SET_MENU_COLOR + "'" + bufArrayVariable + "'" + RESET_MENU_COLOR +
                    " palindrome from sequence is " + SET_MENU_COLOR + "'" + findPalindrome(bufArrayVariable) + "'\n" + RESET_MENU_COLOR;
        }
        return "";
    }
}
