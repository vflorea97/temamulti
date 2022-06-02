package com.tema13part5;

public class ex4 {
    public static void main(String[] args) {
        int [] vect = {2,5,34,7,56,23,67};
        int lg = vect.length;
        int nrUlt = lg - 1;
        int nrPrim = 0;
        for (int i = 0; i <= nrUlt; i++){
            if (i < nrUlt / 2) {
               int prim = nrPrim + i;
               int ultim = nrUlt - i;
                System.out.println(vect[prim]);
                System.out.println(vect[ultim]);
            }
        }
    }
}
