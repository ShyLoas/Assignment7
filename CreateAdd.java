
package assignment7;

import java.util.ArrayList;
import java.util.Scanner;

public class CreateAdd {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Nhap ten: ");
            names.add(sc.next());
        }
        System.out.println();
        for(int i = 0; i<5; i++){
            System.out.println("Ten cua ban la: " + names.get(i));
        }
    }
}
