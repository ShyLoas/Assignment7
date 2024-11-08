package assignment7;

import java.util.Arrays;
import java.util.ArrayList;

public class Sorting {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5, 3, 8, 2, 4));
        numbers.sort(null);
        System.out.println(numbers);
    }
}
