package ch1_1;

import edu.princeton.cs.algs4.StdOut;

public class Ex08 {
    public static void main(String[] args) {
        System.out.println('b');
        System.out.print('b' + 'c');
        System.out.println(" " + Ex02.judgeType('b' + 'c'));
        System.out.print('a' + 4);
        System.out.println(" " + Ex02.judgeType('a' + 4));
        System.out.print((char) ('a' + 4));
        System.out.println(" " + Ex02.judgeType((char) ('a' + 4)));
    }
}
