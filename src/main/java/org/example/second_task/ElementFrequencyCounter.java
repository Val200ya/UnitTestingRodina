package org.example.second_task;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ElementFrequencyCounter {
    public Map<Integer, Integer> countFrequencies(List<Integer> numbers) {
        Map<Integer, Integer> frequency = new HashMap<>();
        for (int i: numbers) {
            int prev = 0;
            if (frequency.get(i) != null) {
                prev = frequency.get(i);
            }
            frequency.put(i, prev + 1);
        }
        return frequency;
    }
}