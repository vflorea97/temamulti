package com.tema13part5;

public class ex2 {
    public static void main(String[] args) {
    int [] vect = {2,5,21,6,9,18,3};
    int nrUlt = vect[vect.length - 1];
        for (int i : vect) {
            if (i % nrUlt == 0) {
                System.out.println(i);
            }
        }
    }
}
