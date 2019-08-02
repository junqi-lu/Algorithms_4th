package ch1_1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Ex21 {
    public static void main(String[] args) {
        StdOut.print("Please input count:");
        int n = StdIn.readInt();
        String[] nameArray = new String[n];
        int[] integerArray1 = new int[n];
        int[] integerArray2 = new int[n];
        for (int i = 0; i < n; i++) {
            nameArray[i] = StdIn.readString();
            integerArray1[i] = StdIn.readInt();
            integerArray2[i] = StdIn.readInt();
        }
        StdOut.println("=----=----=----=------=");
        for (int i = 0; i < n; i++) {
            System.out.printf("|%4s|%4d|%4d|%6.3f|\n", nameArray[i], integerArray1[i], integerArray2[i],
                    (float) integerArray1[i] / integerArray2[i]);
            System.out.println("=----=----=----=------=");
        }
    }
}
