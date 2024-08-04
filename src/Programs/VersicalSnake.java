package Programs;

public class VersicalSnake {
    public static void main(String[] args) {
        int n = 5;
        int[][] res = m1(n);
        for (int[] i : res) {
            for (int e : i) {
                if (e != 0) {
                    System.out.print(e + " ");
                }
            }
            System.out.println();
        }
    }

    public static int[][] m1(int n) {
        int[][] a = new int[n][n];
        int v = 1, r = 0, c = 0;
        char dir = 'D';
        while (c <= a.length-1) {
            switch (dir) {
                case 'D':
                    a[r][c] = v++;
                    if (r == a.length-1) {
                        c++;
                        dir = 'U';
                    } else {
                        r++;
                    }
                    break;
                case 'U':
                    a[r][c] = v++;
                    if (r == c) {
                    	r++;
                        c++;
                        dir = 'D';
                    } else {
                        r--;
                    }
                    break;
            }
        }
        return a;
    }
}
