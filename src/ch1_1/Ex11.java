package ch1_1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Ex11 {

    public static void printBooleanMatrix(boolean[][] matrix) {
        int colNum = matrix[0].length;
        if (colNum == 0) {
            return;
        }
        int rowNum = matrix.length;

        for (int i = 0; i < rowNum; i++) {
            for (int j = 0; j < colNum; j++) {
                StdOut.print(matrix[i][j] ? '*' : ' ');
            }
            StdOut.println();
        }
    }

    public static void main(String[] args) {
        StdOut.print("Input row num: ");
        int rowNum = StdIn.readInt();
        StdOut.print("Input col num: ");
        int colNum = StdIn.readInt();

        boolean[][] matrix = new boolean[rowNum][colNum];
        for (int i = 0; i < rowNum; i++) {
            for (int j = 0; j < colNum; j++) {
                matrix[i][j] = StdIn.readBoolean();
            }
        }
        printBooleanMatrix(matrix);
    }
}
