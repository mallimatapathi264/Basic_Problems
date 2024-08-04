package Programs;

public class StringRotationofEachother {
	public static void main(String[] args) {
	

	String s1="race";
	String s2= "cera";
	if(isRotation(s1,s2))
	{
		System.out.println("rotation");
	}
	else
		System.out.println("not a rotation");
	}
	public static boolean isRotation(String s1, String s2) 
	{
		if(s1.length()!=s2.length()) return false;
		if(s1.equals(s2)) return true;
	int i=1;
	while(i<s1.length())
	{
		s1=s1.substring(1)+s1.substring(0,1);
		if(s1.equals(s2)) 
			return true;
	}
	i++;	
	return false;
	}
	}
	/*
	 * String s3=s1+s1; return s3.contains(s2);
	 */
