package com.company;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.Stopwatch;

public class Main {
    public static int count(int[] a) {
        int N = a.length;
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    if (a[i] + a[j] + a[k] == 0) {
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Integer[] a = {7, 3, 2, 4, 5, 6, 9, 8, 10, 0, 1, 11};
        Integer[] b = {7, 3, 2, 4, 5, 6, 9, 8, 10, 0, 1, 11};
        Integer[] c = {7, 3, 2, 4, 5, 6, 9, 8, 10, 0, 1, 11};
        Integer[] d = {7, 3, 2, 4, 5, 6, 9, 8, 10, 0, 1, 11};
        Integer[] e = {7, 3, 2, 4, 5, 6, 9, 8, 10, 0, 1, 11};
        Integer[] f = {7, 3, 2, 4, 5, 6, 9, 8, 10, 0, 1, 11};
        Integer[] g = {7, 3, 2, 4, 5, 6, 9, 8, 10, 0, 1, 11};
        Integer[] h = {7, 3, 2, 4, 5, 6, 9, 8, 10, 0, 1, 11};
        Integer[] i = {7, 3, 2, 4, 5, 6, 9, 8, 10, 0, 1, 11};

        Stopwatch timer = new Stopwatch();
        Selection.sort(a);
        Double time = timer.elapsedTime();
        Selection.show(a);
        StdOut.print("Selection " + time + "ms\n");

        Stopwatch timer2 = new Stopwatch();
        Insersion.sort(b);
        Double time2 = timer2.elapsedTime();
        Insersion.show(b);
        StdOut.print("Insersion " + time2 + "ms\n");

        Stopwatch timer3 = new Stopwatch();
        Shell.sort(c);
        Double time3 = timer3.elapsedTime();
        Shell.show(c);
        StdOut.print("Shell " + time3 + "ms\n");

        Stopwatch timer4 = new Stopwatch();
        Merge.sort(d);
        Double time4 = timer4.elapsedTime();
        Merge.show(d);
        StdOut.print("Merge " + time4 + "ms\n");

        Stopwatch timer5 = new Stopwatch();
        Quick.sort(e);
        Double time5 = timer5.elapsedTime();
        Quick.show(e);
        StdOut.print("Merge " + time5 + "ms\n");

    }
}
