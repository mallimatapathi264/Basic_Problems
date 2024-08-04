package Programs;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDupelements {
    public static void main(String[] args) {
        int[] n = {1,1, 2, 3, 4, 5, 4, 3, 2, 6, 8};
        Arrays.sort(n);
        ArrayList<Integer> al = new ArrayList<>();
        
        // Add unique elements to ArrayList
        for (int i = 0; i < n.length - 1; i++) {
            if (n[i] != n[i + 1]) {
                al.add(n[i]);   
            }
        }
        // Add the last element since it will not be added in the loop
        al.add(n[n.length - 1]);

        // Print elements from ArrayList
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }
    }
}
