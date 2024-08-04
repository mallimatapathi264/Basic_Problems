package Programs;

public class ConvertCases {
	public static void main(String[] args) {
		String s="MaLlIkArJuNa SwAmY MaTaPaThI";
		for(int i=0;i<s.length();i++){
			char c=s.charAt(i);
			if(Character.isUpperCase(c))
			{
			System.out.print(Character.toLowerCase(c));
			}
			else if(Character.isLowerCase(c))
			{
				System.out.print(Character.toUpperCase(c));
			}
			else
			System.out.print(c);
			}
	}

}
