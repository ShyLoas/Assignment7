package assignment7;

import java.util.Arrays;
import java.util.ArrayList;

public class Update {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        numbers.set(2, 100);
        System.out.println(numbers);
    }
}
