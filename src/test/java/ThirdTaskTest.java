import org.example.third_task.StringSorter;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ThirdTaskTest {
    @Test
    public void sortAlphabeticallyFruitsTest() {
        StringSorter stringSorter = new StringSorter();
        List<String> strings = new ArrayList<>();
        strings.add("Orange");
        strings.add("Watermelon");
        strings.add("Pineapple");
        strings.add("Apple");
        System.out.println(stringSorter.sortStringsAlphabetically(strings));
    }

    @Test
    public void sortAlphabeticallyColorsTest() {
        StringSorter stringSorter = new StringSorter();
        List<String> strings = new ArrayList<>();
        strings.add("Green");
        strings.add("White");
        strings.add("Pink");
        strings.add("Black");
        System.out.println(stringSorter.sortStringsAlphabetically(strings));
    }

    @Test
    public void sortByLengthGameCharactersTest() {
        StringSorter stringSorter = new StringSorter();
        List<String> strings = new ArrayList<>();
        strings.add("Flowey");
        strings.add("Pikachu");
        strings.add("Marx");
        strings.add("Steve");
        System.out.println(stringSorter.sortStringsByLength(strings));
    }

    @Test
    public void sortByLengthCoffeeTest() {
        StringSorter stringSorter = new StringSorter();
        List<String> strings = new ArrayList<>();
        strings.add("Espresso");
        strings.add("Latte");
        strings.add("Cappuccino");
        strings.add("Americano");
        System.out.println(stringSorter.sortStringsByLength(strings));
    }
}
