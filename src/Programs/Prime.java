package Programs;
import java.util.Scanner;
class Prime 
{
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter start range");
		int st=s.nextInt();
		System.out.println("Enter End range");
		int end=s.nextInt();
		int count=0;
		if(st==1) {
			System.out.print("please Enter greathan "+st);
			}
		for(int i=st;i<=end;i++)
		{
			if(i==isPrime(i))
			{
				count++;
				if(count%2!=0) 
					System.out.println(i);
			}
		}
	}
	public static int isPrime(int n)
	{
		int count=0;
		if(n<=1) 
		{
			count++;
		}
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				count++;
				break;
			}
		}
		if(count== 0) 
		{
			return n;
		}
	return 0;
	}
}