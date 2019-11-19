package com.senlainc.petushokvaliantsin.senlatest.menu.enumeration;


public enum MenuOption {
    TASK_1("Task 1 - Check variable"),
    TASK_2("Task 2 - Find LCM and GCD"),
    TASK_3("Task 3 - Work with sentence"),
    TASK_4("Task 4 - Work with text"),
    TASK_5("Task 5 - Work with sequence"),
    TASK_6("Task 6 - Work wih backpack");
    private String menuName;

    MenuOption(String bufMenuName) {
        this.menuName = bufMenuName;
    }

    public String getMenuName() {
        return menuName;
    }

}