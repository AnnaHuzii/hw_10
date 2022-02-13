package TaskTwo;

import java.util.*;

public class NameSortTests {
    private static final List<String> listName = Arrays.asList("Yura", "Mark", "Bogdan", "Lara", "Igor", "Andrey", "Zina");

    public static void main(String[] args) {
        List<String> nameUp = stringUp(String::toUpperCase);

        nameUp.sort(Collections.reverseOrder());

        System.out.println(nameUp);
    }

    static List<String> stringUp(NameUpSort nameUp) {
        List<String> result = new ArrayList<>();
        for (String name : NameSortTests.listName) {
            result.add(nameUp.func(name));
        }
        return result;
    }
}