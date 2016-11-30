package com.company;

import edu.princeton.cs.algs4.StdOut;

/**
 * Created by Yk on 2016/11/14.
 */
public class Shell {
    //Integer[] d = {0, 1, 3, 2, 4, 5, 7, 6, 8, 9, 10, 11};
    public static void sort(Comparable<Integer>[] a) {
        int N = a.length;
        int h = 1;
        while (h < N / 3) h = 3 * h + 1;
        while (h >= 1) {
            for (int i = h; i < N; i++) {
                for (int j = i; j >= h && less(a[j], a[j - h]); j -= h) {
                    exch(a, j, j - h);
//                    System.out.println("h="+h+" "+"i="+i+" "+"j="+j);
//                    Shell.show(a);
                }
            }
            h = h / 3;
        }
    }

    public static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    public static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            StdOut.print(a[i] + " ");
        }
        StdOut.println();
    }
}
