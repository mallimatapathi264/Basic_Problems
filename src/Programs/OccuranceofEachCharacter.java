package Programs;

public class OccuranceofEachCharacter {
public static void main(String[] args) {
	String s="mallikarjunaswamymatapathi";
	char[] c=s.toCharArray();
	
	for(int i=0;i<c.length;i++)
	{
		char ch=c[i];
		if(ch==' ') continue;
		int count=1;
		for(int j=i+1;j<c.length;j++)
		{
			if(ch==c[j])
			{
				count++;
				c[j]=' ';
			}
		}
	System.out.println(count+" "+ch+"");
	
	}
}
}
