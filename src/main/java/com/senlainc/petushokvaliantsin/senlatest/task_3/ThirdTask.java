package com.senlainc.petushokvaliantsin.senlatest.task_3;

import com.senlainc.petushokvaliantsin.senlatest.task_3.sentence.IThirdTask;
import com.senlainc.petushokvaliantsin.senlatest.task_3.sentence.implementation.WorkWithSentence;

import java.util.Scanner;

import static com.senlainc.petushokvaliantsin.senlatest.menu.Menu.RESET_MENU_COLOR;
import static com.senlainc.petushokvaliantsin.senlatest.menu.Menu.SET_MENU_COLOR;

public class ThirdTask implements IThirdTask {
    @Override
    public void runTask() {
        System.out.printf("%sTask 3%s\nPlease enter sentence: ", SET_MENU_COLOR, RESET_MENU_COLOR);
        String mainString = new Scanner(System.in).nextLine();
        System.out.printf("Please enter separator. Example: %s[, .()/]%s. If you dont want enter separator write - %snone%s: ",
                            SET_MENU_COLOR, RESET_MENU_COLOR, SET_MENU_COLOR, RESET_MENU_COLOR);
        String mainSeparator = new Scanner(System.in).nextLine();
        System.out.println(new WorkWithSentence().toString(mainString, mainSeparator));
    }
}
