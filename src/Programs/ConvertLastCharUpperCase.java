package Programs;

import java.util.Scanner;

public class ConvertLastCharUpperCase {
	public static void main(String[] args) {
		 String s = "i am good";
	        String s1 = "";
	        Scanner scn = new Scanner(s);
	        scn = scn.useDelimiter(" ");

	        while (scn.hasNext()) {
	            String word = scn.next();
	            if (!word.isEmpty()) {
	                // Get the length of the word
	                int length = word.length();
	                
	                // Convert the last character to uppercase
	                char lastChar = word.charAt(length - 1);
	                char upperLastChar = Character.toUpperCase(lastChar);
	                
	                // Replace the last character with the uppercase one
	                String modifiedWord = word.substring(0, length - 1) + upperLastChar;
	                
	                // Append the modified word to s1
	                s1 += modifiedWord + " ";
	            }
	        }
	        // Trim the result string to remove any trailing spaces and print it
	        System.out.println(s1.trim());
	    }
	}