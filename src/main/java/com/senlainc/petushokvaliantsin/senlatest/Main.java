package com.senlainc.petushokvaliantsin.senlatest;

import com.senlainc.petushokvaliantsin.senlatest.task_1.checkvariable.implementation.CheckVariable;
import com.senlainc.petushokvaliantsin.senlatest.task_2.lcmgcd.implementation.LcmGcdExecution;
import com.senlainc.petushokvaliantsin.senlatest.task_3.sentence.implementation.WorkWithSentence;
import com.senlainc.petushokvaliantsin.senlatest.task_4.text.implementation.WorkWithText;
import com.senlainc.petushokvaliantsin.senlatest.task_5.sequence.implementation.WorkWithSequence;
import com.senlainc.petushokvaliantsin.senlatest.task_6.backpack.implementation.WorkWithBag;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main
{
    /** Variables */
    private static final String SET_MENU_COLOR = "\u001b[33m", RESET_MENU_COLOR = "\u001b[0m", SET_ERROR_COLOR = "\u001b[31m";
    /** Enum */
    enum Menu {
        TASK_1("Task 1 - Check variable"),
        TASK_2("Task 2 - Find LCM and GCD"),
        TASK_3("Task 3 - Work with sentence"),
        TASK_4("Task 4 - Work with text"),
        TASK_5("Task 5 - Work with sequence"),
        TASK_6("Task 6 - Work wih backpack");
        private String menuName;
        Menu(String bufMenuName){
            this.menuName = bufMenuName;
        }
        private String getMenuName() {
            return menuName;
        }
    }
    /** App menu */
    private static void mainMenu() {
        Menu[] enumMenu = Menu.values(); /* Enum values for Switch */
        while (true) {
            System.out.printf("\nPlease chose operation:\n");
            for(Menu bufMenu : Menu.values())
            {
                System.out.printf("%s%d%s)%s\n", SET_MENU_COLOR , (bufMenu.ordinal() + 1), RESET_MENU_COLOR, bufMenu.getMenuName());
            }
            System.out.printf("Enter data: ");
            try {
                Integer chosenOperation = new Scanner(System.in).nextInt();
                switch(enumMenu[chosenOperation - 1])
                {
                    case TASK_1:
                        new CheckVariable().checkVariableMethod();
                        break;
                    case TASK_2:
                        new LcmGcdExecution().lcmGcdExecutionMethod();
                        break;
                    case TASK_3:
                        new WorkWithSentence().workWithSentenceMethod();
                        break;
                    case TASK_4:
                        new WorkWithText().workWithTextMethod();
                        break;
                    case TASK_5:
                        new WorkWithSequence().workWithSequenceMethod();
                        break;
                    case TASK_6:
                        new WorkWithBag().workWithBagMethod();
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.printf("%sYou entered wrong data%s\n", SET_ERROR_COLOR, RESET_MENU_COLOR);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.printf("%sThe selected operation does not exist. Choose operation 1 - %d%s\n", SET_ERROR_COLOR, enumMenu.length, RESET_MENU_COLOR);
            }
        }
    }
    /** Just main )) */
    public static void main(String[] args)
    {
        mainMenu();
    }
}