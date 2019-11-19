package com.senlainc.petushokvaliantsin.senlatest.task_6.backpack.implementation.Stuff;

import com.senlainc.petushokvaliantsin.senlatest.task_6.backpack.IStuff;

import static com.senlainc.petushokvaliantsin.senlatest.menu.Menu.RESET_MENU_COLOR;
import static com.senlainc.petushokvaliantsin.senlatest.menu.Menu.SET_MENU_COLOR;

public class Stuff implements IStuff {
    /** Variables */
    private String nameStuff;
    private Integer weightStuff;
    private Integer costStuff;
    /** Constructor */
    public Stuff(String bufNameStuff, Integer bufWeightStuff, Integer bufCostStuff) {
        this.nameStuff = bufNameStuff;
        this.costStuff = bufCostStuff;
        this.weightStuff = bufWeightStuff;
    }
    @Override
    public String getNameStuff() {
        return nameStuff;
    }
    @Override
    public Integer getWeightStuff() {
        return weightStuff;
    }
    @Override
    public Integer getCostStuff() {
        return costStuff;
    }
    @Override
    public String toString() {
        return "Stuff name: " + SET_MENU_COLOR + "'" + nameStuff + "'" + RESET_MENU_COLOR +
                " cost: " + SET_MENU_COLOR + "'" + costStuff + "'" + RESET_MENU_COLOR +
                " weight: " + SET_MENU_COLOR + "'" + weightStuff + "'" + RESET_MENU_COLOR;
    }
}
