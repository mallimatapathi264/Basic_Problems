package Programs;

public class ReverseHalfString {
public static void main(String[] args)  {
	String s="hardwork";
	String f= s.substring(0,s.length()/2);
	String l=s.substring(s.length()/2);
	String rem= revhalf(l);
	String res= f+""+rem;
	for(int i=0;i<res.length();i++) {
	System.out.print(res.charAt(i));
	}
}
private static String revhalf(String s1) 
	{
		char[] s= s1.toCharArray();
		if(s.length<=1) return new String(s);
		int st=0;int end= s.length-1;
		while(st<end)
		{
			char temp= s[st];
			s[st]=s[end];
			s[end]=temp;
			st++;
			end--;
		}
	return new String(s);
	}
}
