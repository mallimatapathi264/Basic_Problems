package Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class convertStringToAStringArray {
public static void main(String[] args) {
	/*String s1="i am great";
	 * char[] b=s1.toCharArray(); Scanner sc=new Scanner(s1);
	 * sc=sc.useDelimiter(" "); String s7=""; int count=0; ArrayList<String> a1=new
	 * ArrayList<String>(); while(sc.hasNext()) { s7=sc.next(); a1.add(s7); count++;
	 * }
	 * 
	 * String []s9=new String[count]; for(int i=0;i<a1.size();i++) {
	 * s9[i]=a1.get(i); } System.out.println(Arrays.toString(s9));
	 */	
	  String s2 = "i am great";
      
      // Split the string based on spaces
      String[] s = s2.split(" ");
      
      // Print each element of the array
      for (int i = 0; i < s.length; i++) {
          System.out.println(s[i]);
      }
  }
}

	
	
	//convert first letter as captial
	//convert middle letter as uppercase
	//reverse each world output=i ma doog
	///s1+=scn.next().toUpperCase().charAt(0);
