package Programs;

public class PlusSymbolMinus {
	/*Q.Take one number if that number starts with only + symbol  or – symbol or not starts with + symbol
	 *  or - symbol and that number should not contains 
	 * any special characters and alphabets.That number should contains  numbers starts with
	 *  + or – or normal number otherwise print not a number.
	 * If that number is valid we have to convert that number into short type.
*/
		public static void main(String[] args) {
			
			String s1="+123";
			char[] b=s1.toCharArray();
			String s4="";
			int sum=0;
			int placeholder=1;
			for(int i=0;i<b.length;i++)
			{
				char c=b[i];
				if(i==0 && c=='+' || i==0 && c=='-'|| i==0)
				{
					isCheck(s1);
				}
			}
		}
		public static void isCheck(String s4)
		{
			   boolean flag=false;
			   for(int j=1;j<s4.length();j++)
			   {
				   
				   char n=s4.charAt(j);
				   if(!(n<='9' && n>='0'))
				   {
					   flag=true;
					   break;
				   }
			   }
			   if(!flag)
			   {
				   System.out.println("it is valid");
				  isShort(s4);
			   }
			   else
			   {
				   System.out.println("it is not valid");
			   }
		}
		public static void isShort(String s8)
		{
			int sum=0;
			int placeholder=1;
			for(int k=s8.length()-1;k>=0;k--)
			{
				char p=s8.charAt(k);
				if(p<='9' && p>='0')
				{
					short num=(short) (p-'0');
					sum=sum+placeholder*num;
					placeholder=placeholder*10;
				}
			}
			System.out.println("number in short:"+sum);
		}
		
	}


/*	O/p:

	it is valid
	number in short:123
*/

