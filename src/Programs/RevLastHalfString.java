package Programs;
import java.util.Scanner;
public class RevLastHalfString {
	public static void main(String[] args) {
		String s="hardwork";
		Scanner scn= new Scanner(s);
		scn= scn.useDelimiter("");
		int count=0;
		String f="";
		String l="";
		while(scn.hasNext())
		{
			scn.next();
			count++;
		}
		//Resetting the Scanner:
		//After counting the characters, the scanner has reached the end of the string.
		//We need to reset the scanner to start from the beginning again to process the string.
		//This is done by reinitializing the scn object with new Scanner(s) and setting the delimiter again.
		 scn = new Scanner(s); 
	        scn.useDelimiter("");
		
		for(int i=0;i<count/2;i++)
		{
			f=f+scn.next();
		}
		for(int i=0;i<count-count/2;i++)
		{
			l= scn.next()+l;
		}
		String finalResult=f+l;
		System.out.println(finalResult);
	}
}

















//		int c=count;
//		for(int i=0;i<c/2;i++)
//		{
//			rem+=scn.next();
//		}
//		for(int i=c;i>c/2;i--)
//		{
//			res=scn.next()+res;
//		}
//	String finalresult= rem+""+res;
//	}
//}

	