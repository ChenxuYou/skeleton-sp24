package com.Trial;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExercises {
    /**
     * Returns a map from every lower case letter to the number corresponding to that letter, where
     * 'a' is 1, 'b' is 2, 'c' is 3, ..., 'z' is 26.
     */
    public static Map<Character, Integer> letterToNum() {
        // TODO: Fill in this function.
        Map<Character, Integer> LtN = new HashMap<>();
        for (char i = 'a'; i <= 'z'; i++) {
            LtN.put(i, i - 'a' + 1);
        }
        return LtN;
    }

    /**
     * Returns a map from the integers in the list to their squares. For example, if the input list
     * is [1, 3, 6, 7], the returned map goes from 1 to 1, 3 to 9, 6 to 36, and 7 to 49.
     */
    public static Map<Integer, Integer> squares(List<Integer> nums) {
        // TODO: Fill in this function.
        Map<Integer, Integer> sqr = new HashMap<>();
        for (int i : nums) {
            sqr.put(i, i * i);
        }

        return sqr;
    }

    /** Returns a map of the counts of all words that appear in a list of words. */
    public static Map<String, Integer> countWords(List<String> words) {
        // TODO: Fill in this function.
        Map<String, Integer> cW = new HashMap<>();
        for (String word : words) {
            if (!cW.containsKey(word)) {
                cW.put(word, 1);
            } else {
                int curValue = cW.get(word);
                cW.put(word, curValue + 1);
            }
        }
        return cW;
    }
}
