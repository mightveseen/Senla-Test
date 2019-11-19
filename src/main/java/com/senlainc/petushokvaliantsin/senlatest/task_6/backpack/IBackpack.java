package com.senlainc.petushokvaliantsin.senlatest.task_6.backpack;

import java.util.List;

public interface IBackpack<T> {
    Integer getStuffListSize();
    void  setMainStuffList(List<T> bufStuffList);
    List<T> getMainStuffList();
    Integer getMaxWeight();
}
