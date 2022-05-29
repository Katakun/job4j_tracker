package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int leftLength = left.length();
        int rightLength = right.length();
        int length = leftLength <= rightLength ? leftLength : rightLength;
        int res = 0;

        for (int i = 0; i < length; i++) {
            res = Character.compare(left.charAt(i), right.charAt(i));
            if (res != 0) {
                break;
            }
        }
        if (res == 0) {
            res = Integer.compare(leftLength, rightLength);
        }
        return res;
    }
}