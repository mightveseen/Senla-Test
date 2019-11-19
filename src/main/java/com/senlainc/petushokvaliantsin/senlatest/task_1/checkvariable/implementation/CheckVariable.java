package com.senlainc.petushokvaliantsin.senlatest.task_1.checkvariable.implementation;

import com.senlainc.petushokvaliantsin.senlatest.task_1.checkvariable.ICheckVariable;

import java.math.BigInteger;

import static com.senlainc.petushokvaliantsin.senlatest.menu.Menu.RESET_MENU_COLOR;
import static com.senlainc.petushokvaliantsin.senlatest.menu.Menu.SET_MENU_COLOR;

/** Task 1 */
public class CheckVariable implements ICheckVariable {
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
    /** Return result */
    @Override
    public String toString(Integer bufMainVariable) {
        return "You number: " + SET_MENU_COLOR + "'" + bufMainVariable + "'" + RESET_MENU_COLOR + ". It is " +
                SET_MENU_COLOR + "'" + isCompositeVariable(bufMainVariable) + "'" + RESET_MENU_COLOR + " and " +
                SET_MENU_COLOR + "'" + isOddVariable(bufMainVariable) + "'" + RESET_MENU_COLOR + " variable\n";
    }
}
