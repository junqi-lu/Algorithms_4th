package ch1_1;

import edu.princeton.cs.algs4.StdOut;

public class Ex15 {

    /**
     *
     * @param a 整型数组, 值均在0到m-1之间
     * @param m 返回数组的大小
     * @return 返回整型数组, 其中索引为i的值为i在a[]中出现过的次数
     */
    public static int[] histogram(int[] a, int m) {
        int[] res = new int[m];

        for (int i = 0; i < a.length; i++) {
            res[a[i]]++;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3, 5, 1, 4, 4, 5};
        int[] res = histogram(a, a.length);
        for (int item : res) {
            StdOut.print(item + ", ");
        }
    }
}
