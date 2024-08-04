package Programs;

public class ReverseStringArray {
	public static void main(String[] args) {
		String s="java is an oop langugage";
		String[]  s1= s.split(" ");
		
		for(int i=s1.length-1;i>=0;i--)
		{
			System.out.print(s1[i]+" ");
		}
		
	}

}
