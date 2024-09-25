import org.example.second_task.ElementFrequencyCounter;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class SecondTaskTest {
    @Test
    public void programTest() {
        ElementFrequencyCounter elementFrequencyCounter = new ElementFrequencyCounter();
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            nums.add(i);
        }
        System.out.println(elementFrequencyCounter.countFrequencies(nums));
    }

    @Test
    public void frequencyCounterTest() {
        ElementFrequencyCounter elementFrequencyCounter = new ElementFrequencyCounter();
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(1);
        nums.add(1);
        nums.add(1);
        nums.add(1);
        nums.add(1);
        System.out.println(elementFrequencyCounter.countFrequencies(nums));
    }
}
