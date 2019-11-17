package com.senlainc.petushokvaliantsin.senlatest.task_3;

import com.senlainc.petushokvaliantsin.senlatest.task_3.sentence.IThirdTask;
import com.senlainc.petushokvaliantsin.senlatest.task_3.sentence.implementation.WorkWithSentence;
import static com.senlainc.petushokvaliantsin.senlatest.Main.RESET_MENU_COLOR;
import static com.senlainc.petushokvaliantsin.senlatest.Main.SET_MENU_COLOR;

import java.util.Scanner;

public class ThirdTask implements IThirdTask {
    @Override
    public void runTask() {
        System.out.printf("%sTask 3%s\nPlease enter sentence: ", SET_MENU_COLOR, RESET_MENU_COLOR);
        String mainString = new Scanner(System.in).nextLine();
        System.out.printf("Please enter separator. Example: [, .()/]. If you dont want enter separator write - none: ");
        String mainSeparator = new Scanner(System.in).nextLine();
        System.out.println(new WorkWithSentence().toString(mainString, mainSeparator));
    }
}
