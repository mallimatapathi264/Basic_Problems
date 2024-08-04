package Programs;

public class PascalTriangle {
    public static void main(String[] args) {
        int n = 6; // Number of rows
        int[][] triangle = generatePascalsTriangle(n);

        // Print the triangle
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] generatePascalsTriangle(int n) {
        int[][] triangle = new int[n][n];

        for (int i = 0; i < n; i++) {
            triangle[i][0] = 1; // First element in every row is 1
            for (int j = 1; j <= i; j++) {
                triangle[i][j] = triangle[i-1][j-1] + triangle[i-1][j];
            }
        }
        return triangle;
    }
}