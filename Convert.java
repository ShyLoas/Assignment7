package assignment7;

import java.util.ArrayList;
import java.util.Scanner;

public class Convert {
    
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Nhap so: ");
            num.add(sc.nextInt());
        }
        Integer[] arr = new Integer[num.size()];
        arr = num.toArray(arr);
        
        System.out.println("Array: ");
        for (int n : arr) {
            System.out.print(n + ", ");
        }
    }
}
