package com.senlainc.petushokvaliantsin.senlatest.task_4.text.implementation;

import com.senlainc.petushokvaliantsin.senlatest.task_4.text.iWorkWithText;

import java.util.*;

public class WorkWithText implements iWorkWithText {
    /** Variables: */
    private ArrayList<String> mainText = new ArrayList<>();
    private Map<String, Integer> checkRepeatText = new LinkedHashMap<>();
    private static final String SET_MENU_COLOR = "\u001b[33m", RESET_MENU_COLOR = "\u001b[0m";
    /** Read text */
    private void readText() {
        mainText.addAll(Arrays.asList(new Scanner(System.in).nextLine().split("[\\s.,;?!()—\\n]")));
        for(int i = 0; i < mainText.size(); i++) {
            if(mainText.get(i).length() == 0) {
                mainText.remove(i); i--;
            }
        }
    }
    /** Put into HashMap */
    private void createHashMap() {
        for(String tmpString : mainText) {
            if(checkRepeatText.get(tmpString.toLowerCase()) == null) {
                checkRepeatText.put(tmpString.toLowerCase(), 1); continue;
            }
            checkRepeatText.put(tmpString.toLowerCase(), checkRepeatText.get(tmpString.toLowerCase()) + 1);
        }
    }
    /** Main method */
    public void workWithTextMethod() {
        System.out.printf("%sTask 4%s\nPlease enter text:\n", SET_MENU_COLOR, RESET_MENU_COLOR);
        try {
            readText(); createHashMap();
            System.out.printf("Please enter word: "); String bufCheckString = new Scanner(System.in).next();
            System.out.printf("You entered word: %s'%s'%s repeat into text: %s%d[times]%s", SET_MENU_COLOR, bufCheckString, RESET_MENU_COLOR,
                    SET_MENU_COLOR, checkRepeatText.get(bufCheckString.toLowerCase()), RESET_MENU_COLOR);
        } catch (InputMismatchException e) {
            System.err.printf("You entered wrong data\n");
        }
    }
}
