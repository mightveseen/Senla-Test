package com.senlainc.petushokvaliantsin.senlatest.task_2;

import com.senlainc.petushokvaliantsin.senlatest.task_2.lcmgcd.ISecondTask;
import com.senlainc.petushokvaliantsin.senlatest.task_2.lcmgcd.implementation.LcmGcdExecution;

import java.util.Scanner;

import static com.senlainc.petushokvaliantsin.senlatest.menu.Menu.RESET_MENU_COLOR;
import static com.senlainc.petushokvaliantsin.senlatest.menu.Menu.SET_MENU_COLOR;

public class SecondTask implements ISecondTask {
    @Override
    public void runTask() {
        System.out.printf("%sTask 2%s\nPlease enter 2 variables separating by space: ", SET_MENU_COLOR, RESET_MENU_COLOR);
        String[] mainVariables = new Scanner(System.in).nextLine().split(" ");
        System.out.println(new LcmGcdExecution().toString(mainVariables));
    }
}
