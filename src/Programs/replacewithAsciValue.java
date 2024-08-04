package Programs;

public class replacewithAsciValue {
	public static void main(String[] args) {
		String s="java";
		int most=0;
		String t=s;
		char res=' ';
		while(s.length()>0)
		{
			char a= s.charAt(0);
			String s1= s.replace(a+"", "");
			int length= s.length()-s1.length();
			if(length>most) {
				most=length;
				res=a;
			}
			else if(length==most && a<res)
			{
				res=a;
			}
			s=s1;	
		}
		s=t;
		int asc= (int)res;
		String s3= t.replace(res+"",asc+"");

			System.out.println(s3);
			return;
	}

}
