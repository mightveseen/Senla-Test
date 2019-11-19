package com.senlainc.petushokvaliantsin.senlatest.task_6.backpack.implementation.Backpack;

import com.senlainc.petushokvaliantsin.senlatest.task_6.backpack.IBackpack;
import com.senlainc.petushokvaliantsin.senlatest.task_6.backpack.implementation.Stuff.Stuff;

import java.util.List;

public class Backpack implements IBackpack<Stuff> {

    private Integer maxWeight;
    private List<Stuff> mainStuffList;

    public Backpack(Integer maxWeight) {
        this.maxWeight = maxWeight;
    }

    @Override
    public void setMainStuffList(List<Stuff> bufStuffList) {
        this.mainStuffList = bufStuffList;
    }

    @Override
    public Integer getStuffListSize() {
        return mainStuffList.size();
    }

    @Override
    public List<Stuff> getMainStuffList() {
        return mainStuffList;
    }

    @Override
    public Integer getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(Integer maxWeight) {
        this.maxWeight = maxWeight;
    }
}
