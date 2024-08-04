package Programs;

public class BiggestString {
	public static void main(String[] args) {
		String s="abcde ant abcde bangalo i bangalore atmospher";
		String[] s1=s.split(" ");
		String c="";
		for(int i=0;i<s1.length;i++)
		{
			 c=s1[0];
			if(c.length()<s1[i].length())
			{ 
			c=s1[i];	
			}
			else if(c.length()==s1[i].length())
			{
			if(c.compareTo(s1[i])>0)
			{
				c=s1[i];
			}
		   }
		}
		System.out.println(c);
	}
}
