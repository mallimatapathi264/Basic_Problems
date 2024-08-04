package Programs;
import java.util.Arrays;
public class BasedOnKey {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5, 8};
        int num = 2;
        int index = findIndex(array, num);
       
        if (index == -1) {
            System.out.println("Element is not present");
        } else {
            rotateArray(array, index);
        }
    }
    // Method to find the index of the specified element
    public static int findIndex(int[] array, int num) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                return i;
            }
        }
        return -1; // Element not found
    }
    // Method to rotate the array based on the index
    public static void rotateArray(int[] array, int index) {
        int[] rotatedArray = new int[array.length];
        int pos = 0;
        // Copy elements from the index+1 to the end of the array
        for (int i = index + 1; i < array.length; i++) {
            rotatedArray[pos++] = array[i];
        }
        // Copy elements from the start of the array to the index
        for (int i = 0; i <= index; i++) {
            rotatedArray[pos++] = array[i];
        }
        // Print the rotated array
      //  System.out.println(Arrays.toString(rotatedArray));
        for(int n:rotatedArray)
        {
        	System.out.print
        	(n);
        }
    }
}














	

/*import java.util.Arrays;

public class BasedOnKey {
	public static void main(String[] args) {
		int[] a= {1,2,3,5,8};
		int num=6;
		int index= isIndex(a, num);
		if(index==-1)
		{
			System.out.println("element is not presented");
		}
		else
		{
			isArray(a,index);
		}
	}
	public static int isIndex(int[] a, int n)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==n)
			{
				return i;
			}
		}
		return -1;
	}

public static void isArray(int[] a, int index)
{
	int v=0;
	int temp[] = new int[a.length];
	for(int i=index+1;i<a.length;i++)
	{
		temp[v++]=a[i];
	}
	for(int j=0;j<=index;j++)
	{
		temp[v++]=a[j];
	}
	System.out.println(Arrays.toString(temp));
	
}
	
}*/
