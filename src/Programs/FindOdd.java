package Programs;

import java.util.ArrayList;
import java.util.List;

public class FindOdd {
    public static void main(String[] args) {
        int[] a = {6, 7, 5, 4, 3, 9, 1, 8};
        List<Integer> oddNumbers = new ArrayList<>();
        
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                oddNumbers.add(a[i]);
            }
        }
        
        System.out.println("Odd numbers in the array: " + oddNumbers);
    }
}
