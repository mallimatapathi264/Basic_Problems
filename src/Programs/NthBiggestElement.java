package Programs;

import java.util.ArrayList;
import java.util.Arrays;
public class NthBiggestElement {
	public static void main(String[] args) {
		int n=5;
		int count=0;
		int[] a= {9,3,2,1,9,3,8};
		Arrays.sort(a);
		ArrayList al= new ArrayList();
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]!=a[i+1])
			{
				count++;
				al.add(a[i]);
			}
		}
		al.add(a[a.length - 1]);
		count++;
		if(n<=count)
            System.out.println(al.get(al.size()-n));
			else 
				System.out.println("No elements are there");
	}
}