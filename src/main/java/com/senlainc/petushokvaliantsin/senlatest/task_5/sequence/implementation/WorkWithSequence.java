package com.senlainc.petushokvaliantsin.senlatest.task_5.sequence.implementation;

import com.senlainc.petushokvaliantsin.senlatest.task_5.sequence.iWorkWithSequence;
import static com.senlainc.petushokvaliantsin.senlatest.Main.RESET_MENU_COLOR;
import static com.senlainc.petushokvaliantsin.senlatest.Main.SET_MENU_COLOR;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.stream.IntStream;

public class WorkWithSequence implements iWorkWithSequence {
    private int mainSequence[];
    /** Fill array with N elements */
    private void fillArray(int bufSizeSequence) {
        if (bufSizeSequence <= 100 && bufSizeSequence > 0) {
            mainSequence = IntStream.rangeClosed(01, bufSizeSequence).toArray();
        } else {
            System.out.printf("You entered: %s'%d'%s . You should entered variable less than 100 or more than 0\n", SET_MENU_COLOR, bufSizeSequence, RESET_MENU_COLOR);
        }
    }
    /** Find primitives */
    private void findPalindrome(int bufArrayVariable) {
        int reverseVariable = 0;
        int staticArrayVariable = bufArrayVariable;
        for (int i = 0; i <= bufArrayVariable; i++) {
            int remainVariable = bufArrayVariable % 10;
            bufArrayVariable = bufArrayVariable / 10;
            reverseVariable = reverseVariable * 10 + remainVariable;
        }
        if (Arrays.binarySearch(mainSequence, reverseVariable) >= 0) {
            System.out.printf("For variable: %s'%d'%s palindrome from sequence is %s'%d'%s\n", SET_MENU_COLOR, staticArrayVariable, RESET_MENU_COLOR,
                    SET_MENU_COLOR, reverseVariable, RESET_MENU_COLOR);
        }
    }
    /** Main method */
    public void workWithSequenceMethod() {
        System.out.printf("\n%sTask 5%s\nPlease enter size of sequence: ", SET_MENU_COLOR, RESET_MENU_COLOR);
        try {
            fillArray(new Scanner(System.in).nextInt());
            for(int i = 0; i < mainSequence.length; i++) {
                findPalindrome(mainSequence[i]);
            }
        } catch (InputMismatchException e) {
            System.err.printf("You entered wrong data\n");
        }
    }
}
