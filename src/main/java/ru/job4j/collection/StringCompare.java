package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int leftLength = left.length();
        int rightLength = right.length();
        int minLength = Math.min(leftLength, rightLength);
        int res = 0;
        for (int i = 0; i < minLength; i++) {
            res = Character.compare(left.charAt(i), right.charAt(i));
            if (res != 0) {
                break;
            }
        }
        return res == 0 ? Integer.compare(leftLength, rightLength) : res;
    }
}