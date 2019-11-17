package com.senlainc.petushokvaliantsin.senlatest.task_4;

import com.senlainc.petushokvaliantsin.senlatest.task_4.text.IFourthTask;
import com.senlainc.petushokvaliantsin.senlatest.task_4.text.implementation.WorkWithText;
import static com.senlainc.petushokvaliantsin.senlatest.Main.RESET_MENU_COLOR;
import static com.senlainc.petushokvaliantsin.senlatest.Main.SET_MENU_COLOR;

import java.util.Scanner;

public class FourthTask implements IFourthTask {
    @Override
    public void runTask() {
        System.out.printf("%sTask 4%s\nPlease enter text:\n", SET_MENU_COLOR, RESET_MENU_COLOR);
        String mainText = new Scanner(System.in).nextLine();
        System.out.printf("Please enter word: ");
        String mainString = new Scanner(System.in).next();
        System.out.println(new WorkWithText().toString(mainText, mainString));
    }
}
