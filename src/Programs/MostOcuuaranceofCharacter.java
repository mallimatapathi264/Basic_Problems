package Programs;

public class MostOcuuaranceofCharacter {
	public static void main(String[] args) {
		
	String s="succecss";
		int most=0;
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
			System.out.println(res+"="+most);
			return;
	}

}
