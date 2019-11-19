package com.senlainc.petushokvaliantsin.senlatest.task_4;

import com.senlainc.petushokvaliantsin.senlatest.task_4.text.IFourthTask;
import com.senlainc.petushokvaliantsin.senlatest.task_4.text.implementation.WorkWithText;

import java.util.Scanner;

import static com.senlainc.petushokvaliantsin.senlatest.menu.Menu.RESET_MENU_COLOR;
import static com.senlainc.petushokvaliantsin.senlatest.menu.Menu.SET_MENU_COLOR;

public class FourthTask implements IFourthTask {
    @Override
    public void runTask() {
        System.out.printf("%sTask 4%s\nPlease enter text:\n", SET_MENU_COLOR, RESET_MENU_COLOR);
        String mainText = new Scanner(System.in).nextLine();
        System.out.print("Please enter word: ");
        String mainString = new Scanner(System.in).next();
        System.out.println(new WorkWithText().toString(mainText, mainString));
    }
}
