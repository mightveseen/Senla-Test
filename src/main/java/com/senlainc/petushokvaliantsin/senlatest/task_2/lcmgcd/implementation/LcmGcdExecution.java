package com.senlainc.petushokvaliantsin.senlatest.task_2.lcmgcd.implementation;

import com.senlainc.petushokvaliantsin.senlatest.task_2.lcmgcd.iLcmGcdExecution;

import java.util.Arrays;
import java.util.Scanner;

public class LcmGcdExecution implements iLcmGcdExecution {
    /** Variables: */
    private String[] mainVariables = new String[2];
    private static final String SET_MENU_COLOR = "\u001b[33m", RESET_MENU_COLOR = "\u001b[0m", SET_ERROR_COLOR = "\u001b[31m";
    /** Find Greatest Common Divisor */
    private int gcdExecute(int firstVariable, int secondVariable) {
        return secondVariable == 0 ? firstVariable : gcdExecute(secondVariable, firstVariable % secondVariable);
    }
    /** Find Least Common Multiple */
    private int lcmExecute(int firstVariable, int secondVariable) {
        return firstVariable * secondVariable / gcdExecute(firstVariable, secondVariable) ;
    }
    /** Main method */
    public void lcmGcdExecutionMethod() {
        System.out.printf("%sTask 2%s\nPlease enter 2 variables separating by space: ", SET_MENU_COLOR, RESET_MENU_COLOR);
        try {
            mainVariables = new Scanner(System.in).nextLine().split(" ");
            System.out.printf("You numbers: %s'%s'%s. GCD: %s'%d'%s and LCM: %s'%d'%s\n", SET_MENU_COLOR, Arrays.asList(mainVariables), RESET_MENU_COLOR,
                    SET_MENU_COLOR, gcdExecute(Integer.parseInt(mainVariables[0]), Integer.parseInt(mainVariables[1])), RESET_MENU_COLOR,
                    SET_MENU_COLOR, lcmExecute(Integer.parseInt(mainVariables[0]), Integer.parseInt(mainVariables[1])), RESET_MENU_COLOR);
        } catch (NumberFormatException e) {
            System.out.printf("%sYou entered wrong data%s\n", SET_ERROR_COLOR, RESET_MENU_COLOR);
        }
    }
}
