package com.tema13part5;

import java.util.Arrays;

public class ex12 {
    public static void main(String[] args) {
        int [] x = {2,3,5,4,13,45,21};
        int nrUlt = x.length - 1;
        int elemente = 0;
        for (int i = nrUlt; i >= 0; i--){
            int i1 = 1;
            int count = 0;
            while (i1 <= x[i]){
                if (x[i] % i1 == 0){
                    count++;
                }
                i1++;
            }
            if (count == 2){
                elemente++;
            }
        }
        int [] vect1 = new int[elemente];
        int nrUlt1 = vect1.length - 1;
        int poz = 0;
        for (int i2 = nrUlt; i2 >= 0; i2--){
            int i3 = 1;
            int count1 = 0;
            while (x[i2] >= i3){
                if (x[i2] % i3 == 0) {
                    count1++;
                }
                i3++;
            }
            if (count1 == 2){
                int nrPrim = x[i2];
                vect1[poz] = nrPrim;
                poz++;
            }
        }
        System.out.println(Arrays.toString(vect1));
    }
}
