package assignment7;

import java.util.Arrays;
import java.util.ArrayList;

public class Remove {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        numbers.remove(Integer.valueOf(5));
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
