package com.senlainc.petushokvaliantsin.senlatest.task_6.backpack.implementation;

import com.senlainc.petushokvaliantsin.senlatest.task_6.backpack.IWorkWithBag;
import com.senlainc.petushokvaliantsin.senlatest.task_6.backpack.implementation.Backpack.Backpack;
import com.senlainc.petushokvaliantsin.senlatest.task_6.backpack.implementation.Stuff.Stuff;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class WorkWithBag implements IWorkWithBag {
    /** Create Stuff */
    private List<Stuff> creatStuff(List<Stuff> mainStuffList) {
        mainStuffList.add(new Stuff("Gold", 4, 100));
        mainStuffList.add(new Stuff("Potato", 14, 400));
        mainStuffList.add(new Stuff("MacBook", 4, 400));
        return mainStuffList;
    }
    /** Find unit cost */
    private List<Float> findUnitCost(List<Stuff> mainStuffList, List<Float> mainUnitCostMap) {
        for(int i = 0; i < mainStuffList.size(); i++) {
            mainUnitCostMap.add(i, (float)mainStuffList.get(i).getCostStuff() / (float)mainStuffList.get(i).getWeightStuff());
        }
        return mainUnitCostMap;
    }
    /** Fill backpack */
    private void fillBackpack(int maxWeight, List<Stuff> bufMainStuffList, List<Float> bufMainUnitCost, Backpack bufMainBackpack) {
        Integer fillMaxWeight = 0;
        List<Stuff> bufStuffList = new LinkedList<>();
        while(bufMainUnitCost.size() != 0) {
            int bufListIndex = bufMainUnitCost.indexOf(Collections.max(bufMainUnitCost));
            if(maxWeight > (fillMaxWeight + bufMainStuffList.get(bufListIndex).getWeightStuff())) {
                fillMaxWeight += bufMainStuffList.get(bufListIndex).getWeightStuff();
                bufStuffList.add(bufMainStuffList.get(bufListIndex));
            }
            bufMainUnitCost.remove(bufListIndex);
        }
        bufMainBackpack.setMainStuffList(bufStuffList);
    }
    /** Display backpack */
    private void displayBackpack(Backpack bufMainBackpack) {
        System.out.print("Backpack stuff:\n");
        List<Stuff> bufStuffList = bufMainBackpack.getMainStuffList();
        for(Stuff tmpStuff : bufStuffList) {
            System.out.println(tmpStuff);
        }
    }
    /** Main method */
    @Override
    public void getResult(int maxWeight) {
        List<Stuff> mainStuffList = new ArrayList<>(); /* ArrayList of stuff */
        List<Float> mainUnitCost = new LinkedList<>(); /* HashMap for find unit cost */
        Backpack mainBackpack = new Backpack(maxWeight); /* Main backpack */
        fillBackpack(maxWeight, creatStuff(mainStuffList), findUnitCost(mainStuffList, mainUnitCost), mainBackpack);
        displayBackpack(mainBackpack);
    }
}
