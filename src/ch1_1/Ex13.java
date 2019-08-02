package ch1_1;

public class Ex13 {
    public static void printTransposedMatrix(int[][] matrix) {
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.printf("%4d", matrix[j][i]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] a = {{3, 2, 1}, {123, 32, 231}};

        printTransposedMatrix(a);
    }
}
