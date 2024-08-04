package Programs;

import java.util.Arrays;

public class AnagraminStringArray {
	
	/*public static boolean areAnagram(String s1, String s2)
	{
		return sortString(s1).equals(sortString(s2));
	}
	public static String sortString(String s) {
		char[] c=s.toCharArray();
		Arrays.sort(c);
		return new String(c);
	}
	public static void main(String[] args) {
		String[] s1= {"race","peek"};
		String[] s2= {"peek","care"};
		boolean f=true;
		for(String str1:s1)
		{
			for(String str2:s2) {
				if(areAnagram(str1,str2)) {
					System.out.println(str1+" "+" "+str2+" are Anagrams");
					
				}
				else
				{
					System.out.println(str1+" "+" "+str2+" are not Anagrams");
				}
			}
		}	
	}

}*/
	//Arrays.toString(s2);	
//for String Arrays
	public static void main(String[] args) {
		String[] s1= {"peek","silent","race"};
		String[] s2= {"race","peek","silent"};
		sort(s1);
		sort(s2);
		Arrays.sort(s1);
		Arrays.sort(s2);
	
		  String s3= Arrays.toString(s1);
		 String s4= Arrays.toString(s2);
		 if(s3.equals(s4)) 
		//if (Arrays.equals(s1, s2))
		{
			System.out.println("anagram");
		}
		else
		{
			System.out.println("not a anagram ");
		}	}
	
	 
	public static void sort(String[] s)
	{ 
		for(int i=0;i<s.length-1;i++)
		{
			for(int j=0;j<s.length-1-i;j++) {
			if(s[j].compareTo(s[j+1])<0)
			{
				String temp=s[j];
				s[j]=s[j+1];
				s[j+1]=temp;
			}
			}
		}
	
	}
}


/*
 * 
 * public static void main(String[] args) {
		String[] s1= {"peek","silent","race"};
		String[] s2= {"race","peek","silent"};
		Arrays.sort(s1);
		Arrays.sort(s2);
	
		String s3= Arrays.toString(s1);
		String s4=Arrays.toString(s2);
		if(s3.equals(s4)) 
		{
			System.out.println("anagram");
		}
		else
		{
			System.out.println("not a anagram ");
		}
	}
}

 */






