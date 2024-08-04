package Programs;

public class Helloworld {
	public static void main(String[] args) {
		String s="hello world t";
		char[] c=s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			int count=50;
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]>='a' && c[i]<='z')
				{
					if(c[i]==c[j])
					{
						c[j]=(char)count;
						count++;
					}
					s.replace(s.charAt(i)+" ", " ");
				}
			}
			if(count!=50)
			{
				c[i]='1';
			}
		}
		System.out.println(c);
	}

}
