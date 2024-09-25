import org.example.first_task.UniqueNumberExtractor;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class FirstTaskTest {
    @Test
    public void extractionTest() {
        UniqueNumberExtractor uniqueNumberExtractor = new UniqueNumberExtractor();
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            nums.add(i);
        }
        System.out.println(uniqueNumberExtractor.extractUniqueNumbers(nums));
    }

    @Test
    public void uniqueNumbersTest() {
        UniqueNumberExtractor uniqueNumberExtractor = new UniqueNumberExtractor();
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            nums.add(i);
        }
        for (int j = 1; j < 10; j = j + 2) {
            nums.add(j);
        }
        System.out.println(uniqueNumberExtractor.extractUniqueNumbers(nums));
    }
}