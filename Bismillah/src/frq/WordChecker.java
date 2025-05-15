package frq;

import java.util.ArrayList;

public class WordChecker {
    private ArrayList<String> wordList;

    public boolean isWordChain() {
        for (int i = 1; i < wordList.size(); i++) {
            if (!(wordList.get(i-1).contains(wordList.get(i)))) {
                return false;
            }
        }
        return true;
    }

    public ArrayList<String> createList(String target) {
        ArrayList<String> newList = new ArrayList<>();
        for (int i = 0; i < wordList.size(); i++) {
            if (wordList.get(i).startsWith(target)) {
                newList.add(wordList.get(i).replace(target, ""));
            }
        }
        return newList;
    }
}
