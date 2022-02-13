package TaskOne;

import java.util.*;

public class NameNumberTests {
    private static final List<String> listName = Arrays.asList("Yura", "Mark", "Bogdan", "Lara", "Igor", "Andrey", "Zina");

    public static void main(String[] args) {
        System.out.print("Вывод нечетных значений: ");
        nameNumberOdd((n) -> n % 2 == 1, listName);
    }

    public static void nameNumberOdd(NameNumber nameNumber, List<String> names) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < names.size(); i++) {
            if (!nameNumber.oddName(i)) continue;
            String lastName = listName.get(i);
            result.add(i + ". " + lastName);
        }
        System.out.println(result);
    }
}

