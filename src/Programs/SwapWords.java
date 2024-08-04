package Programs;

public class SwapWords {
	public static void main(String[] args) 
	{
		String s="java is an easy";
		String[] s1 = s.split(" ");
		Swap(s1);
		for(int i=0;i<s1.length;i++)
		System.out.print(s1[i]+" ");
	}
	public static String[] Swap(String[] s)
	{
		int count=0;
		int i=0, j=s.length-1;
		while(i<j)
		{
			String temp=s[i];
			s[i]=s[j];
			s[j]= temp;
			count++;
			i++;
			j--;
		}
		System.out.println(count);
		
		
		return s;
	}
}
