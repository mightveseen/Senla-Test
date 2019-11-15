package com.senlainc.petushokvaliantsin.senlatest.task_6.backpack;

import java.util.LinkedList;

public interface iBackpack {
    /** Get list size for cycle */
    Integer getStuffListSize();
    /** Set chosen stuff */
    void  setMainStuffList(LinkedList bufStuffList);
    /** Display all backpack stuff */
    String toString(int indexList);
}
