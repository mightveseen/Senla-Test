package com.senlainc.petushokvaliantsin.senlatest.task_1;

import com.senlainc.petushokvaliantsin.senlatest.task_1.checkvariable.IFirstTask;
import com.senlainc.petushokvaliantsin.senlatest.task_1.checkvariable.implementation.CheckVariable;

import java.util.Scanner;

import static com.senlainc.petushokvaliantsin.senlatest.menu.Menu.RESET_MENU_COLOR;
import static com.senlainc.petushokvaliantsin.senlatest.menu.Menu.SET_MENU_COLOR;

public class FirstTask implements IFirstTask {
    @Override
    public void runTask() {
        System.out.printf("%sTask 1%s\nPlease enter variable: ", SET_MENU_COLOR, RESET_MENU_COLOR);
        System.out.println(new CheckVariable().toString(new Scanner(System.in).nextInt()));
    }
}
