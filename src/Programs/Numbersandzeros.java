/*package Programs;

public class Numbersandzeros {
    public static void main(String[] args) {
        int[] n = {1, 0, 2, 3, 0, 5, 0, 8, 3, 0, 0};
        
        // Move non-zero elements to the front
        int nonZeroIndex = 0;
        for (int i = 0; i < n.length; i++) {
            if (n[i] != 0) {
                n[nonZeroIndex++] = n[i];
            }
        }
        
        // Fill the rest with zeros
        while (nonZeroIndex < n.length) {
            n[nonZeroIndex++] = 0;
        }
        
        // Print the modified array
        for (int n1 : n) {
            System.out.print(n1 + " ");
        }
    }
}

*/
/*
package Programs;
public class Numbersandzeros {
    public static void main(String[] args) {
        int[] n = {1, 0, 2, 0, 8, 3, 0, 0};
        int j = 0;
        for (int i = 0; i < n.length; i++) {
            if (n[i] != 0) {
                int temp = n[i];
                n[i] = n[j];
                n[j] = temp;
                j++;
            }
        }
        for (int num : n) {
            System.out.print(num + " ");
        }
    }
}
*/
package Programs;

import java.util.ArrayList;

public class Numbersandzeros {
    public static void main(String[] args) {
        int[] n = {1, 0, 2, 0, 8, 3, 0, 0};
        
        // Create an ArrayList to hold non-zero elements
        ArrayList<Integer> al = new ArrayList<>();
        
        // Add non-zero elements to the ArrayList
        for (int i = 0; i < n.length; i++) {
            if (n[i] != 0) {
                al.add(n[i]);
            }
        }
        
        // Fill the array with non-zero elements followed by zeros
        int nonZeroIndex = 0;
        for (int i = 0; i < al.size(); i++) {
            n[nonZeroIndex++] = al.get(i);
        }
        
        while (nonZeroIndex < n.length) {
            n[nonZeroIndex++] = 0;
        }
        
        // Print the modified array
        for (int num : n) {
            System.out.print(num + " ");
        }
    }
}











