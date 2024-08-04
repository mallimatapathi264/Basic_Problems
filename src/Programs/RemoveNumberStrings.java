/*package Programs;


public class RemoveNumberStrings {
    public static void main(String[] args) {
        String s = "he3llo333w3o2r1d1";
		
		 * StringBuilder result = new StringBuilder();
		 * 
		 * for (int i = 0; i < s.length(); i++) { char a = s.charAt(i); if (a < '0' || a
		 * > '9') { result.append(a); } }
		 * 
		 * System.out.println(result.toString());
		
        
    }
}*/
package Programs;

public class RemoveNumberStrings {
	public static void main(String[] args) {
		
		/*
		 * char[] c = s.toCharArray(); int nonDigitCount = 0;
		 * 
		 * // First pass: Count the number of non-digit characters for (int i = 0; i <
		 * c.length; i++) { if (c[i] < '0' || c[i] > '9') { nonDigitCount++; } }
		 * 
		 * // Create an array to hold non-digit characters char[] resultArray = new
		 * char[nonDigitCount]; int resultIndex = 0;
		 * 
		 * // Second pass: Populate the result array with non-digit characters for (int
		 * i = 0; i < c.length; i++) { if (c[i] < '0' || c[i] > '9') {
		 * resultArray[resultIndex++] = c[i]; } }
		 * 
		 * // Convert the result array to a string String result = new
		 * String(resultArray);
		 * 
		 * // Print the result System.out.println(result);
		 */
		        String s = "he3287 6g54e3q";
		        String ch = "";
		        String digits="";
		        char[] c = s.toCharArray();
		        
		        for (int i = 0; i < c.length; i++) {
		            char c1 = c[i];
		            if (c1 >= '0' && c1 <= '9') {
		            	digits+=c1;
		               
		            }
		            else {
		            	ch+=c1;
		            }
		        }
		        
		        System.out.println("characters are: "+ch);
		        System.out.println("digits are: "+digits);
		    }
		}
