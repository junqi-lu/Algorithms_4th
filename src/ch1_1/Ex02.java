package ch1_1;

import edu.princeton.cs.algs4.StdOut;

public class Ex02 {

    public static String judgeType(Object temp) {
        if (temp instanceof Integer) {
            return "integer";
        } else if (temp instanceof Float) {
            return "float";
        } else if (temp instanceof Double) {
            return "double";
        } else if (temp instanceof Long) {
            return "long";
        } else if (temp instanceof Boolean) {
            return "boolean";
        } else if (temp instanceof String) {
            return "string";
        } else if (temp instanceof Character) {
            return "char";
        } else {
            return "error";
        }
    }

    public static void main(String[] args) {
        StdOut.print((1 + 2.236) / 2);
        StdOut.println(" " + judgeType((1 + 2.236) / 2));
        StdOut.print(1 + 2 + 3 + 4.0);
        StdOut.println(" " + judgeType(1 + 2 + 3 + 4.0));
        StdOut.print(4.1 >= 4);
        StdOut.println(" " + judgeType(4.1 >= 4));
        StdOut.print(1 + 2 + "3");
        StdOut.println(" " + judgeType(1 + 2 + "3"));
    }
}