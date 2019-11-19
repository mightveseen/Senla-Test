package com.senlainc.petushokvaliantsin.senlatest.task_3.sentence.implementation;

import com.senlainc.petushokvaliantsin.senlatest.task_3.sentence.IWorkWithSentence;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import static com.senlainc.petushokvaliantsin.senlatest.menu.Menu.RESET_MENU_COLOR;
import static com.senlainc.petushokvaliantsin.senlatest.menu.Menu.SET_MENU_COLOR;

public class WorkWithSentence implements IWorkWithSentence {
    private List<String> mainString = new LinkedList<>();
    /** Read string */
    private void readSentence (String bufMainString, String bufSeparator) {
        if (bufSeparator.equals("none")) {
            mainString.addAll(Arrays.asList(bufMainString.split("\\s")));
        } else {
            mainString.addAll(Arrays.asList(bufMainString.split(bufSeparator)));
        }
    }
    /** Make first char UpperCase */
    private @NotNull String firstChar() {
        for(int i = 0; i < mainString.size(); i++) {
            mainString.set(i, mainString.get(i).substring(0, 1).toUpperCase() + mainString.get(i).substring(1));
        }
        return sortSentence();
    }
    /** Sort words in sentence */
    private @NotNull String sortSentence()  {
        Collections.sort(mainString);
        return displaySentence();
    }
    /** Display sentence */
    private @NotNull String displaySentence() {
        StringBuilder bufMainString = new StringBuilder();
        for(String tmpString : mainString) {
            bufMainString.append(tmpString).append(" ");
        }
        bufMainString.deleteCharAt(bufMainString.length() - 1);
        return bufMainString.toString();
    }
    /** Return result */
    public String toString(String bufMainString, String bufMainSeparator) {
            readSentence(bufMainString, bufMainSeparator);
            return "You entered sentence: " + SET_MENU_COLOR + "'" + displaySentence() + "'\n" + RESET_MENU_COLOR +
            "Word counter: " + SET_MENU_COLOR + "'" + mainString.size() + "'\n" + RESET_MENU_COLOR +
            "Sorted sentence: " + SET_MENU_COLOR + "'" + sortSentence() + "'\n" + RESET_MENU_COLOR +
            "Changed sentence: " + SET_MENU_COLOR + "'" + firstChar() + "'\n" + RESET_MENU_COLOR;
    }
}
