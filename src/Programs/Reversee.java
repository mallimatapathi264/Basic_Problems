package Programs;

public class Reversee {
	public static void main(String[] args) {
		int n=987654321;
		while(n!=0)
		{
			int r=n%10;
			System.out.print(r+" ");
			n=n/10;
		}
	}

}
