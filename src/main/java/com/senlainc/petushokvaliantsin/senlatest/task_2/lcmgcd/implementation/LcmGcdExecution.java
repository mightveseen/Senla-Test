package com.senlainc.petushokvaliantsin.senlatest.task_2.lcmgcd.implementation;

import com.senlainc.petushokvaliantsin.senlatest.task_2.lcmgcd.ILcmGcdExecution;

import java.util.Arrays;

import static com.senlainc.petushokvaliantsin.senlatest.menu.Menu.RESET_MENU_COLOR;
import static com.senlainc.petushokvaliantsin.senlatest.menu.Menu.SET_MENU_COLOR;

public class LcmGcdExecution implements ILcmGcdExecution {
    /** Find Greatest Common Divisor */
    private int gcdExecute(int firstVariable, int secondVariable) {
        return secondVariable == 0 ? firstVariable : gcdExecute(secondVariable, firstVariable % secondVariable);
    }
    /** Find Least Common Multiple */
    private int lcmExecute(int firstVariable, int secondVariable) {
        return firstVariable * secondVariable / gcdExecute(firstVariable, secondVariable);
    }
    /** Return result */
    public String toString(String[] mainVariables) {
        return "You numbers: " + SET_MENU_COLOR + "'" + Arrays.asList(mainVariables) + "'" + RESET_MENU_COLOR +
                ". GCD: " + SET_MENU_COLOR + "'" + gcdExecute(Integer.parseInt(mainVariables[0]), Integer.parseInt(mainVariables[1])) +
                "'" + RESET_MENU_COLOR + " and LCM: " + SET_MENU_COLOR + "'" +
                lcmExecute(Integer.parseInt(mainVariables[0]), Integer.parseInt(mainVariables[1])) + "'\n" + RESET_MENU_COLOR;
    }
}
