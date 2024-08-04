package Programs;
public class PrintMaxNumbr {
	public static void main(String[] args) {
		String s="136in12232dai1231";
		int max=0;
		int n=0;
		int res=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='0' && ch<='9')
			{
				n=(n*10)+(ch-'0');	
			}
			else
			{
				if(max<n)
				{
					max=n;
					n=0;
				}
			}
		}
	 	res= max<n?n:max;
	 	System.out.println(res);
	}
}