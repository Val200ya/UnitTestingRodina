package org.example.third_task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringSorter {
    public List<String> sortStringsAlphabetically(List<String> strings) {
        List<String> words = new ArrayList<>(strings);
        Collections.sort(words);
        return words;
    }
    public List<String> sortStringsByLength(List<String> strings) {
        List<String> words = new ArrayList<>(strings);
        words.sort(Comparator.comparing(String::length));
        return words;
    }
}