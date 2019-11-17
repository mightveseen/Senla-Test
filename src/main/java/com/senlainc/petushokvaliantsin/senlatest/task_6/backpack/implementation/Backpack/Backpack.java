package com.senlainc.petushokvaliantsin.senlatest.task_6.backpack.implementation.Backpack;

import com.senlainc.petushokvaliantsin.senlatest.task_6.backpack.implementation.Stuff.Stuff;
import com.senlainc.petushokvaliantsin.senlatest.task_6.backpack.IBackpack;

import java.util.List;

public class Backpack implements IBackpack {
    /** Variables */
    private Integer maxWeightBackpack;
    private List<Stuff> mainStuffList;
    /** Constructor */
    public Backpack(Integer bufMaxWeightBackpack) {
        this.maxWeightBackpack = bufMaxWeightBackpack;
    }
    /** Put stuff */
    @Override
    public void setMainStuffList(List bufStuffList) {
        this.mainStuffList = bufStuffList;
    }
    @Override
    public Integer getStuffListSize() {
        return mainStuffList.size();
    }
    @Override
    public List getMainStuffList() {
        return mainStuffList;
    }
}
