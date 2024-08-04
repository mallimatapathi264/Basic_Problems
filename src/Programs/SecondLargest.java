package Programs;

public class SecondLargest {
public static void main(String[] args) {
	int[] a= {1,5,4,5,6,7,2,8};
	int max1=9;
	int max2=9;
	for(int i=0;i<a.length;i++)
	{
		if(a[i]<max1)
		{
			max2=max1;
			max1=a[i];
		}
		else if(a[i]<max2 && a[i]!=max2)
		{
			max2=a[i];
		}
	}
	System.out.println(max2);
}
}
