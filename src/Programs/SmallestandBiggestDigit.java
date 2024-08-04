package Programs;

import java.util.LinkedList;

public class SmallestandBiggestDigit {
public static void main(String[] args) {

int n=5791;
int small= 9,big=0; 

while(n>0) 
{
	int rem= n%10;
	if(rem<small)
	{
		small= rem;
	}
	 if(rem>big)
	{
	big=rem;
		
	}
	 n=n/10;
	
		}
		System.out.println(big+" "+small);
	}
}
