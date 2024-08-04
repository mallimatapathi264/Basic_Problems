package Programs;
import java.util.Scanner;
public class GreatestDigit {
	public static void main(String[] args) {
		String  s="1234uibdj345kjhu1";
		for(int i=9;i>=0;i--)
		{
			if(s.contains(i+""))
			{
				System.out.println(i);
				break;
			}
			
		}
	}
}