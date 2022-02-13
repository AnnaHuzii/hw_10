package TaskThree;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class SortArrayTests {
    private static final String[] myStringArray = new String[]{"1, 2, 0", "4, 5"};

    public static void main(String[] args) {

        String[] myStringArrayChar = Arrays.stream(myStringArray)
                .flatMap((p) -> Arrays.stream(p.split(", ")))
                .toArray(String[]::new);

        int[] myIntArray = Arrays.stream(myStringArrayChar)
                .mapToInt(Integer::parseInt)
                .sorted()
                .toArray();

        String myString = Arrays.toString(myIntArray).replaceAll("\\[|]|\\s", "");

        System.out.println(myString);
    }
}
