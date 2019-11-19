package com.senlainc.petushokvaliantsin.senlatest.task_6;

import com.senlainc.petushokvaliantsin.senlatest.task_6.backpack.ISixthTask;
import com.senlainc.petushokvaliantsin.senlatest.task_6.backpack.implementation.WorkWithBag;

import java.util.Scanner;

import static com.senlainc.petushokvaliantsin.senlatest.menu.Menu.RESET_MENU_COLOR;
import static com.senlainc.petushokvaliantsin.senlatest.menu.Menu.SET_MENU_COLOR;

public class SixthTask implements ISixthTask {
    @Override
    public void runTask() {
        System.out.printf("%sTask 6%s\nPlease enter max backpack weight: ", SET_MENU_COLOR, RESET_MENU_COLOR);
        int mainWeight = new Scanner(System.in).nextInt();
        new WorkWithBag().getResult(mainWeight);
    }
}
