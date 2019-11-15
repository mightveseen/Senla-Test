package com.senlainc.petushokvaliantsin.senlatest.task_6.backpack.implementation.Backpack;

import com.senlainc.petushokvaliantsin.senlatest.task_6.backpack.implementation.Stuff.Stuff;
import com.senlainc.petushokvaliantsin.senlatest.task_6.backpack.iBackpack;

import java.util.LinkedList;

public class Backpack implements iBackpack {
    /** Variables */
    private Integer maxWeightBackpack;
    private LinkedList<Stuff> mainStuffList;
    /** Constructor */
    public Backpack(Integer bufMaxWeightBackpack) {
        this.maxWeightBackpack = bufMaxWeightBackpack;
    }
    /** Max weight getter */
    public Integer getStuffListSize() {
        return mainStuffList.size();
    }
    /** Put stuff */
    public void setMainStuffList(LinkedList bufStuffList) {
        this.mainStuffList = bufStuffList;
    }
    /** Display List */
    public String toString(int listIndex) {
        return "Stuff name: " + mainStuffList.get(listIndex).getNameStuff() +
                ", weight: " + mainStuffList.get(listIndex).getWeightStuff() +
                ", cost: " + mainStuffList.get(listIndex).getCostStuff();
    }
}
