package Programs;

public class ReverseString {
	public static void main(String[] args) {
		String s="i am good";
		String res="";
		String[] a= s.split(" ");
		for(int i=0;i<a.length;i++)
		{
			if(i!=a.length-1)
			{
				res+=rev(a[i])+" ";
			}
			else
				res+= rev(a[i]);
		}
		System.out.println(res);
	}
	public static String rev(String s)
	{
		   char[] c = s.toCharArray();
	        int st = 0, end = c.length - 1;
	        while (st < end) {
	            char temp = c[st];
	            c[st] = c[end];
	            c[end] = temp;
	            st++;
	            end--;
	        }
	        return new String(c);
	    }
	}
