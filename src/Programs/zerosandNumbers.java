/*package Programs;

public class zerosandNumbers {
    public static void main(String[] args) {
        int[] n = {1, 0, 2, 3, 0, 5, 0, 8, 3, 0, 0};
        int index = 0;
        int[] result = new int[n.length];

        // Move non-zero elements to the result array from the end
        for (int i = n.length - 1; i >= 0; i--) {
            if (n[i] != 0) {
                result[n.length - 1 - index] = n[i];
                index++;
            }
        }

        // The remaining positions in the result array will be zeros

        // Copy the result array back to the original array
        for (int i = 0; i < n.length; i++) {
            n[i] = result[i];
        }

        // Print the modified array
        for (int num : n) {
            System.out.print(num + " ");
        }
    }
}
*/

package Programs;
	
public class zerosandNumbers {
    public static void main(String[] args) {
        int[] n = {1, 0, 2, 0, 8, 3, 0, 0};
        int index = n.length - 1;
        // Move non-zero elements to the end of the array
        for (int i = n.length - 1; i >= 0; i--) {
            if (n[i] != 0) {
                n[index--] = n[i];
            }
        }
        // Fill the beginning of the array with zeros
        while (index >= 0) {
            n[index--] = 0;
        }
        // Print the modified array	
        for (int num : n) {
            System.out.print(num + " ");
        }
    }
}








