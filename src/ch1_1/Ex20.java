package ch1_1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Ex20 {
    /**
     *
     * @param N 用于计算的值
     * @return N!以2为底的对数
     */
    public static double ln(int N) {
        if (N == 0) {
            return 0;
        } else {
            return Math.log(N) + ln(N - 1);
        }
    }

    public static void main(String[] args) {
        StdOut.print(ln(StdIn.readInt()));
    }
}
