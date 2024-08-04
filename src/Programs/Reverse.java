package Programs;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		String s="ramesh";
		Scanner scn=  new Scanner(s);
		scn= scn.useDelimiter("");
		String res="";
		while(scn.hasNext())
		{
			res=scn.next()+res;
		}
		System.out.println(res);
	}
}