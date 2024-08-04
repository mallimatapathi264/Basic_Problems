package Programs;

public class RemoveSpace {
	public static void main(String[] args) {
		String s="    Hello    world   how r u";
		String res="";
		for(int i=0;i<s.length();i++)
		{
			char c1=s.charAt(i);
			if(c1!=' ') res+=c1;
			else if(s.charAt(i+1)!=' ') res+=c1;
		}
		for(int i=0;i<res.length();i++)
		{	
			if(res.charAt(i)!=' ')
			{
				res=res;
			}
		}
		res=res.trim();
			System.out.println(res);
	}


}
