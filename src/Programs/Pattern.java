package Programs;

public class Pattern {
	public static void main(String[] args) {
		int n= 5;
		int space=0;
	for(int i=1;i<=n;i++)
	{
		for(int k=1;k<=space;k++)
		{
		System.out.print(" "+" ");
		}
		for(int j=n;j>=i;j--)
		{
			if(i==1 || j==n)
			{
				System.out.print(j+" ");
			}
			else
			{
				System.out.print(" "+" ");
			}
		}
			for(int j=i+1;j<=n;j++)
			{
				if(i==1 || j==n) 
				System.out.print(j+" ");
				else 
				{
					System.out.print(" "+" ");
				}
			}
			System.out.println();
				space++;
				}
	}
}
