package Programs;
public class FibPatternLessThanSymbol {
	public static void main(String[] args) {
		int n = 7;
		int[] ar = getArray(n);
		int sp = n/2;
		int ei = 0;
		int oi = ar.length - 2;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= sp; j++) {
				System.out.print(" "+" ");
			}
			if (i <= n / 2+1) {
				System.out.println(ar[ei]);
				ei += 2;
			}else {
				System.out.println(ar[oi]);
				oi -= 2;
			}
			if (i <= n / 2) {
				sp--;
			} else {
				sp++;	
			}
		}
	}
	public static int[] getArray(int n) {
		int[] ar = new int[n];
		int a = 0, b = 1, c;
		for (int i = 0; i < n; i++) {
			ar[i] = a;
			c = a + b;
			a = b;
			b = c;
		}
		return ar;
	}
}
