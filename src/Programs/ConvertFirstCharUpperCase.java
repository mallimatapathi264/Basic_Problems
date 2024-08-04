package Programs;

import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.text.*;

public class ConvertFirstCharUpperCase {
	public static void main(String[] args) {
	/*	  String s = "i am good";
	        String s1 = "";
	        Scanner scn = new Scanner(s);
	        scn = scn.useDelimiter(" ");

	        while (scn.hasNext()) {
	            String word = scn.next();
	            if (!word.isEmpty()) {
	                // Get the length of the word
	                int length = word.length();
	                
	                // Convert the last character to uppercase
	                char lastChar = word.charAt(0);
	                char upperLastChar = Character.toUpperCase(lastChar);
	                
	                // Replace the last character with the uppercase one
	                String modifiedWord =upperLastChar+word.substring(1, length);
	                
	                // Append the modified word to s1
	                s1 += modifiedWord + " ";
	            }
	        }
	        // Trim the result string to remove any trailing spaces and print it
	        System.out.println(s1.trim());
	    }
	}*/
		 /*Scanner scn=new Scanner(System.in);
		 System.out.println("enter 1a String");
	        String A=scn.next();
		 System.out.println("enter 2a String");
	        String B=scn.next();
	         Enter yor code here. Print output to STDOUT. 
	        String res= A.compareTo(B)>0? "Yes":"No";
	       String s=A+" "+B;
	        String s1 = "";
	        scn=new Scanner(s);
	       scn = scn.useDelimiter(" ");
	            while (scn.hasNext()) 
	            {
	            String word = scn.next();
	            if (!word.isEmpty()) 
	            {
	            int length = word.length();
	            char lastChar = word.charAt(0);
	            char upperLastChar = Character.toUpperCase(lastChar);
	            String result =upperLastChar+word.substring(1, length);
	            s1 += result + " ";
	            }
	        }
	        System.out.println(A.length()+B.length());
	        System.out.println(res);
	        System.out.println(s1.toString());    
	    }
	}*/
		
		        Scanner scanner = new Scanner(System.in);
		        double payment = scanner.nextDouble();
		        scanner.close();

		        // Write your code here
		        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
		        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
		        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
		        NumberFormat franceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);

		        // Format the payment according to different locales
		        String us = usFormat.format(payment);
		        String india = indiaFormat.format(payment);
		        String china = chinaFormat.format(payment);
		        String france = franceFormat.format(payment);

		        // Replace currency symbols with ASCII-compatible text equivalents
		        india = india.replace("₹", "Rs.");
		        china = china.replace("¥", "Yuan");
		        france = france.replace("€", "Euro");

		        // Print the formatted currencies
		        System.out.println("US: " + us);
		        System.out.println("India: " + india);
		        System.out.println("China: " + china);
		        System.out.println("France: " + france);
		    }
		}

