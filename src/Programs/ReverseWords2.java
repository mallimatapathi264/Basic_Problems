package Programs;

public class ReverseWords2 {
public static void main(String[] args) {
	String s3="java is good";//doog si avaj 
	
	String s1="";
	String s2="";
	char[] s=s3.toCharArray();
	for(int i=0;i<s.length;i++)
	{
		
		if(s[i]!=' ')
		{
			s1=s[i]+s1+"";
		}
		else{s2=s1+" "+s2;
		s1="";
		}
		
	}
	s2=s1+" "+s2;
   System.out.println(s2);
	
}
}
