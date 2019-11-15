package com.senlainc.petushokvaliantsin.senlatest.task_1.checkvariable.implementation;

import com.senlainc.petushokvaliantsin.senlatest.task_1.checkvariable.iCheckVariable;

import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Scanner;

/** Task 1 */
public class CheckVariable implements iCheckVariable {
    /** Variables: */
    private static final String SET_MENU_COLOR = "\u001b[33m", RESET_MENU_COLOR = "\u001b[0m";
    /** Check Composite or Prime */
    private String isCompositeVariable(Integer bufMainVariable) {
        BigInteger mainVariable = BigInteger.valueOf(bufMainVariable);
        if (bufMainVariable >= 0 && mainVariable.isProbablePrime((int)Math.log(bufMainVariable))) {
            return "Prime";
        }
        return "Composite";
    }
    /** Check Even or Odd */
    private String isOddVariable(Integer bufMainVariable) {
        if ((bufMainVariable & 1) == 0) {
            return "Even";
        }
        return "Odd";
    }
    /** Main method */
    public void checkVariableMethod() {
        System.out.printf("%sTask 1%s\nPlease enter variable: ", SET_MENU_COLOR, RESET_MENU_COLOR);
        try {
            Integer mainVariable = new Scanner(System.in).nextInt();
            System.out.printf("You number: %s'%d'%s. It is %s'%s'%s and %s'%s'%s variable\n", SET_MENU_COLOR, mainVariable, RESET_MENU_COLOR,
                    SET_MENU_COLOR, isCompositeVariable(mainVariable), RESET_MENU_COLOR,
                    SET_MENU_COLOR, isOddVariable(mainVariable), RESET_MENU_COLOR);
        } catch (InputMismatchException e) {
            System.err.printf("You entered wrong data\n");
        }
    }
}
