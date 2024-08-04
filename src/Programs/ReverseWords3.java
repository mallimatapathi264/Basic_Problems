package Programs;

public class ReverseWords3 {
public static void main(String[] args) {
	String s="java is good";//avaj si doog
	String s1="";
	String s2="";
	char[] c=s.toCharArray();
	for(int i=0;i<c.length;i++)
	{
		if(c[i]!=' ')
		{
			s1=c[i]+s1+"";
		}
		else {
			s2+=s1+" ";
			s1="";
		}
	}
	s2+=s1+" ";
	System.out.println(s2);	
	}
}
