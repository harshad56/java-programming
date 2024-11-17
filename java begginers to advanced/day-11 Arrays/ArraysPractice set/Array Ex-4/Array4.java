
public class Array4 {
    public static void main(String[] args) {

        // additin 2x3 matrices
        int[][] matices1 = { { 1, 2, 3 }, { 4, 5, 6 } };// 2 matrices and 3 values in each
        int[][] matices2 = { { 7, 8, 9 }, { 3, 2, 1 } };

        int[][] result = { { 0, 0, 0 }, { 0, 0, 0 } };

        for (int i = 0; i < matices1.length; i++) {
            for (int j = 0; j < matices1[i].length; j++) {
                result[i][j] = matices1[i][j] + matices2[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.println("");// print a new line

        }

    }
}
