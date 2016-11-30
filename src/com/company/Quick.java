package com.company;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/**
 * Created by Yk on 2016/11/27.
 */
public class Quick {
    public static void sort(Comparable<Integer>[] a) {
        StdRandom.shuffle(a);
        sort(a, 0, a.length - 1);
    }

    public static void sort(Comparable<Integer>[] a, int lo, int hi) {
        if ((hi<=lo))return;
        int j = partition(a,lo,hi);
        sort(a,lo,j-1);
        sort(a,j+1,hi);
    }
    public static int partition(Comparable<Integer>[] a,int lo,int hi){
        int i = lo,j=hi+1;
        Comparable v = a[lo];
        while(true){
            while(less(a[++i],v))if(i==hi) break;
            while(less(v,a[--j]))if (j==lo)break;
            if(i>=j)break;
            exch(a,i,j);
        }
        exch(a,lo,j);
        return j;
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
