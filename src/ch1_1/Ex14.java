package ch1_1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Ex14 {
    /**
     * @param value 进行底为2对数运算的值
     * @return 不大于log2(value)的最大整数, 非法输入返回-1
     */
    public static int lg(int value) {
        if (value <= 0) {
            return -1;
        }
        int res = 0;
        while (value >= 2) {
            res++;
            value >>= 1;
        }
        return res;
    }

    public static void main(String[] args) {
        StdOut.println(lg(StdIn.readInt()));
    }
}
