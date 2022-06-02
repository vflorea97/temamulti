package com.tema13part5;

import java.util.Arrays;

public class ex2 {
    public static void main(String[] args) {
        int[] vect = {2, 2, 34, 15, 8, 21, 15, 3};
        int count = 0;
        int nrUlt = vect.length - 1;
        int [] vect2 = new int [vect.length - count];
        for (int i = 0; i <= nrUlt; i++) {
            boolean gasit = false;
            for (int i1 = i + 1; i1 <= nrUlt; i1++) {
                if (vect[i] == vect[i1] && !gasit) {
                    gasit = true;
                    count++;
                    vect2[i1] = i1;
                    vect2[0] = 1;
                }
            }
        }
        int [] vect1 = new int [vect.length - count];
        int gasit1 = 0;
        for (int i1 = 0; i1 <= nrUlt; i1++){
            if (i1 != vect2[i1]){
                vect1[gasit1] = vect[i1];
                gasit1++;
            }
        }
         System.out.println(Arrays.toString(vect1));
    }
}
