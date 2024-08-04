package Programs;

public class SubtoSuper {
public static void main(String[] args) {
	int[] a=null;
	try
	{
		System.out.println(a[0]);
	}
	catch(Exception e)
	{
		System.out.println("arthm");
	}
	catch (ExceptionInInitializerError e) {
		System.out.println("ArrayIndex");
	}
  }
}
