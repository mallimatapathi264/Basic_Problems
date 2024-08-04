package Programs;
import java.util.Scanner;
public class fibpatternGreaterthanSymbol {
    public static void main(String[] args) {
        int n = 7; 
        int[] ar = getArray(n);
        int sp = 1; 
        int ei = 0; 
        int oi = ar.length - 2; 
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < sp; j++) {
                System.out.print(" "+" ");
            }
            if (i<=n/2+1) {
                System.out.println(ar[ei]);
                ei += 2;
            } else {
                System.out.println(ar[oi]);
                oi-= 2;
            }
            if (i <= n / 2) {
                sp++;
            } else {
                sp--;
            }
        }
    }
    public static int[] getArray(int n) {
    	//System.out.println("enter first number");
    	//Scanner scn= new Scanner(System.in);
    	//int a= scn.nextInt();
    	int a=0, b=1;
    	//System.out.println("enter first number");
    	//int b= scn.nextInt();
        int[] ar = new int[n];
        int c;
        for (int i = 0; i < n; i++) {
            ar[i] = a;
            c = a + b;
            a = b;
            b = c;
        }
        return ar;
    }
}
