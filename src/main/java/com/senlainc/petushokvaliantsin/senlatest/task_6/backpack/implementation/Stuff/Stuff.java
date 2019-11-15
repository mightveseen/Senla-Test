package com.senlainc.petushokvaliantsin.senlatest.task_6.backpack.implementation.Stuff;

import com.senlainc.petushokvaliantsin.senlatest.task_6.backpack.iStuff;

public class Stuff implements iStuff {
    /** Variables */
    private String nameStuff;
    private Integer weightStuff;
    private Integer costStuff;
    /** Constructor */
    public Stuff(String bufNameStuff, Integer bufWeightStuff, Integer bufCostStuff) {
        this.nameStuff = bufNameStuff; this.costStuff = bufCostStuff; this.weightStuff = bufWeightStuff;
    }
    /** Name getter */
    public String getNameStuff() {
        return nameStuff;
    }
    /** Weight getter */
    public Integer getWeightStuff() {
        return weightStuff;
    }
    /** Cost getter */
    public Integer getCostStuff() {
        return costStuff;
    }
}
