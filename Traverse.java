package assignment7;

import java.util.Arrays;
import java.util.ArrayList;

public class Traverse {

    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>(Arrays.asList("New York", "Nha Trang", "Da Nang", "Ho CHi Minh", "Ha Noi"));
        for (int i = 0; i < cities.size(); i++) {
            System.out.println(cities.get(i));
        }
    }
}
