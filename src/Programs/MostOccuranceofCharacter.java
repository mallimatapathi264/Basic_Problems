package Programs;

public class MostOccuranceofCharacter {
 public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="succecss";
		int most=0;
		while(s.length()>0)
		{
			char a= s.charAt(0);
			String s1= s.replace(a+"", "");
			int length= s.length()-s1.length();
			if(length>most) {
				most=length;
				s=s1;
			}
			System.out.println(a+"="+most);
			return;
		}
	}
}