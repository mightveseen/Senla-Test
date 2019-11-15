package com.senlainc.petushokvaliantsin.senlatest.task_6.backpack.implementation;

import com.senlainc.petushokvaliantsin.senlatest.task_6.backpack.iWorkWithBag;
import com.senlainc.petushokvaliantsin.senlatest.task_6.backpack.implementation.Backpack.Backpack;
import com.senlainc.petushokvaliantsin.senlatest.task_6.backpack.implementation.Stuff.Stuff;

import java.util.*;

public class WorkWithBag implements iWorkWithBag {
    /** Variables */
    private Integer maxWeight = 15; /* Max backpack weight */
    private ArrayList<Stuff> mainStuffList = new ArrayList<>(); /* ArrayList of stuff */
    private LinkedList<Float> mainUnitCostMap = new LinkedList<>(); /* HashMap for find unit cost */
    private Backpack mainBackpack = new Backpack(maxWeight); /* Main backpack */
    private static final String SET_MENU_COLOR = "\u001b[33m", RESET_MENU_COLOR = "\u001b[0m";
    /** Create Stuff */
    private void creatStuff() {
        mainStuffList.add(new Stuff("Gold", 4, 100));
        mainStuffList.add(new Stuff("Potato", 14, 400));
        mainStuffList.add(new Stuff("MacBook", 4, 400));
    }
    /** Find unit cost */
    private void findUnitCost() {
        for(int i = 0; i < mainStuffList.size(); i++) {
            mainUnitCostMap.add(i, (float)mainStuffList.get(i).getCostStuff() / (float)mainStuffList.get(i).getWeightStuff());
        }
    }
    /** Fill backpack */
    private void fillBackpack() {
        Integer fillMaxWeight = 0;
        LinkedList<Stuff> bufStuffList = new LinkedList<>();
        while(mainUnitCostMap.size() != 0) {
            int bufListIndex = mainUnitCostMap.indexOf(Collections.max(mainUnitCostMap));
            if(maxWeight > (fillMaxWeight + mainStuffList.get(bufListIndex).getWeightStuff())) {
                fillMaxWeight += mainStuffList.get(bufListIndex).getWeightStuff();
                bufStuffList.add(mainStuffList.get(bufListIndex));
            }
            mainUnitCostMap.remove(bufListIndex);
        }
        mainBackpack.setMainStuffList(bufStuffList);
    }
    /** Display backpack */
    private void displayBackpack() {
        System.out.printf("Backpack stuff:\n");
        for(int i = 0; i < mainBackpack.getStuffListSize(); i++) {
            System.out.println(mainBackpack.toString(i));
        }
    }
    /** Main method */
    public void workWithBagMethod() {
        System.out.printf("%sTask 6%s\n", SET_MENU_COLOR, RESET_MENU_COLOR);
        try {
            creatStuff(); findUnitCost(); fillBackpack(); displayBackpack();
        } catch (NullPointerException e) {
            System.err.printf("Something went wrong\n");
        }
    }
}
