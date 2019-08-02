package ch1_1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Ex09 {

    public static String toBinaryString(int n) {
        if (n == 0) {
            return "0";
        } else if (n < 0) {
            return "error";
        }

        StringBuilder res = new StringBuilder();
        while (n > 0) {
            res.append(n & 1);
            n >>= 1;
        }
        return res.reverse().toString();
    }

    public static void main(String[] args) {
        while (true) {
            int n = StdIn.readInt();
            StdOut.println(toBinaryString(n));
        }
    }
}
