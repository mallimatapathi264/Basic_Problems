package Programs;

import java.util.HashSet;

public class RemoveDuplicateWordsUsingHashset {
public static void main(String[] args) {
	String s="i am java developer, i will also want to learn python";
	String[] s1= s.split(" ");
	HashSet<String> hs= new HashSet();
	for(int i=0;i<s1.length;i++)
	{
		if(!hs.contains(i))
		{
			hs.add(s1[i]);
		}
	}
	System.out.println(hs);
}
}
