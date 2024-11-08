package assignment7;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class Search {

    public static void main(String[] args) {
        ArrayList<String> key = new ArrayList<>(Arrays.asList("Java", "Python", "C++", "JavaScript"));
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap tu can tim: ");
        String in = sc.nextLine();

        if (key.contains(in)) {
            System.out.println("Tu nay co trong danh sach");
        } else {
            System.out.println("Tu nay khong co trong danh sach");
        }
    }
}
