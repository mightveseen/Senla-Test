package com.senlainc.petushokvaliantsin.senlatest.task_5.sequence.implementation;

import com.senlainc.petushokvaliantsin.senlatest.task_5.sequence.IWorkWithSequence;

import java.util.Arrays;
import java.util.stream.IntStream;

import static com.senlainc.petushokvaliantsin.senlatest.menu.Menu.RESET_MENU_COLOR;
import static com.senlainc.petushokvaliantsin.senlatest.menu.Menu.SET_MENU_COLOR;

public class WorkWithSequence implements IWorkWithSequence {

    private int[] fillArray(int bufSizeSequence) {
        return IntStream.rangeClosed(1, bufSizeSequence).toArray();
    }

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
