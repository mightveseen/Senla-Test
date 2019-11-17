package com.senlainc.petushokvaliantsin.senlatest.task_4.text.implementation;

import com.senlainc.petushokvaliantsin.senlatest.task_4.text.IWorkWithText;
import static com.senlainc.petushokvaliantsin.senlatest.Main.RESET_MENU_COLOR;
import static com.senlainc.petushokvaliantsin.senlatest.Main.SET_MENU_COLOR;

import java.util.*;

public class WorkWithText implements IWorkWithText {
    /** Read text */
    private List<String> readText(String bufString) {
        List<String> mainText = new ArrayList<>();
        mainText.addAll(Arrays.asList(bufString.split("[\\s.,;?!()—\\n]")));
        for(int i = 0; i < mainText.size(); i++) {
            if(mainText.get(i).length() == 0) {
                mainText.remove(i); i--;
            }
        }
        return mainText;
    }
    /** Put into HashMap */
    private Map<String, Integer> createHashMap(String bufString) {
        Map<String, Integer> checkRepeatText = new LinkedHashMap<>();
        for(String tmpString : readText(bufString)) {
            if(checkRepeatText.get(tmpString.toLowerCase()) == null) {
                checkRepeatText.put(tmpString.toLowerCase(), 1); continue;
            }
            checkRepeatText.put(tmpString.toLowerCase(), checkRepeatText.get(tmpString.toLowerCase()) + 1);
        }
        return checkRepeatText;
    }
    /** Main method */
    @Override
    public String toString(String bufMainText, String bufMainWord) {
        return "You entered word: " + SET_MENU_COLOR + "'" + bufMainWord + "'" + RESET_MENU_COLOR +
                    "repeat into text: " + SET_MENU_COLOR + "'" + createHashMap(bufMainText).get(bufMainWord.toLowerCase()) + "'" + RESET_MENU_COLOR;
    }
}
