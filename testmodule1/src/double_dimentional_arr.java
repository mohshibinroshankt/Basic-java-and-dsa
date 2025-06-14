import java.util.Scanner;

public class double_dimentional_arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r,c;
        System.out.println("Enter the number of rows");
        r = sc.nextInt();
        System.out.println("Enter the number of columns");
        c = sc.nextInt();

        int[][] matrix = new int[r][c];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("The matrix is");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }
    }
}
