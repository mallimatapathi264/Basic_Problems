package Programs;

public class RemoveConjuative {
	public static void main(String[] args) {
		String s="java";
		char[] c=s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]==c[j])
				{
					c[j]=' ';
				}
			}
		}
		for(int i=0;i<c.length;i++)
		{
			if(c[i]!=' ')
				System.out.print(c[i]);
		}
	}

}
