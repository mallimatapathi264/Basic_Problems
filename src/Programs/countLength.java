package Programs;

import java.util.Scanner;

public class countLength {

	public static void main(String[] args) {
		String s="hello world";
		Scanner scn = new Scanner(s);
		scn=scn.useDelimiter(" ");
		int c=0;
		while(scn.hasNext())
		{
		scn.next();
			c++;
		}
		System.out.println("No. of Words: "+c);
	}


}
