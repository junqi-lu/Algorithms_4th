package ch1_1;

import edu.princeton.cs.algs4.StdOut;

public class Ex16 {
    public static String exR1(int n) {
        if (n <= 0) {
            return "";
        } else {
            return exR1(n - 3) + n + exR1(n - 2) + n;
        }
    }

    public static void main(String[] args) {
        StdOut.print(exR1(6));

    }
}
