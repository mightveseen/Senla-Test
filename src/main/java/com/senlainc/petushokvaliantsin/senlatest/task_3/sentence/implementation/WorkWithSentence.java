package com.senlainc.petushokvaliantsin.senlatest.task_3.sentence.implementation;

import com.senlainc.petushokvaliantsin.senlatest.task_3.sentence.iWorkWithSentence;
import org.jetbrains.annotations.NotNull;

import java.util.*;

public class WorkWithSentence implements iWorkWithSentence {
    /** Variables */
    private LinkedList<String> mainString = new LinkedList<>();
    private static final String SET_MENU_COLOR = "\u001b[33m", RESET_MENU_COLOR = "\u001b[0m", SET_ERROR_COLOR = "\u001b[31m";
    /** Make first char UpperCase */
    private void firstChar() {
        for(int i = 0; i < mainString.size(); i++) {
            mainString.set(i, mainString.get(i).substring(0, 1).toUpperCase() + mainString.get(i).substring(1));
        }
    }
    /** Sort words in sentence */
    private void sortSentence() {
        Collections.sort(mainString);
    }
    /** Display LinkedList */
    @NotNull
    private String displayLinkedList() {
        StringBuilder bufMainString = new StringBuilder();
        for(String tmpString : mainString) {
            bufMainString.append(tmpString + " ");
        }
        bufMainString.deleteCharAt(bufMainString.length() - 1);
        return bufMainString.toString();
    }
    /** Main method */
    public void workWithSentenceMethod() {
        System.out.printf("%sTask 3%s\nPlease enter sentence: ", SET_MENU_COLOR, RESET_MENU_COLOR);
        try {
            mainString.addAll(Arrays.asList(new Scanner(System.in).nextLine().split("[\\s.]"))); firstChar(); sortSentence();
            System.out.printf("Your changed sentence: %s'%s'%s\nWord counter: %s'%d'%s\n",  SET_MENU_COLOR, displayLinkedList(), RESET_MENU_COLOR,
                    SET_MENU_COLOR, mainString.size(), RESET_MENU_COLOR);
        } catch (NumberFormatException e) {
            System.out.printf("%sYou entered wrong data%s\n", SET_ERROR_COLOR, RESET_MENU_COLOR);
        }
    }
}
