package com.Trial;

import java.util.ArrayList;
import java.util.List;

public class ListExercises {

    /** Returns the total sum in a list of integers */
    public static int sum(List<Integer> L) {
        // TODO: Fill in this function.
        int sum = 0;
        for (int ele : L) {
            sum += ele;
        }
        return sum;
    }

    /** Returns a list containing the even numbers of the given list */
    public static List<Integer> evens(List<Integer> L) {
        // TODO: Fill in this function.
        List<Integer> evenLst = new ArrayList<>();
        for (int i : L) {
            if (i % 2 == 0) {
                evenLst.add(i);
            }
        }
        return evenLst;
    }

    /** Returns a list containing the common item of the two given lists */
    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
        // TODO: Fill in this function.
        List<Integer> comLst = new ArrayList<>();
        for (int elem1 : L1) {
            for (int elem2 : L2) {
                if (elem1 == elem2) {
                    boolean isPresent = comLst.contains(elem1);
                    if (!isPresent) {
                        comLst.add(elem1);
                    }
                }
            }
        }
        return comLst;
    }


    /** Returns the number of occurrences of the given character in a list of strings. */
    public static int countOccurrencesOfC(List<String> words, char c) {
        // TODO: Fill in this function.
        int num = 0;
        for (String str : words) {
            for (char ch : str.toCharArray()) {
                if (ch == c) {
                    num++;
                }
            }
        }
        return num;
    }
}
