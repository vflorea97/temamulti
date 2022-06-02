package com.tema13part5;

import java.util.Arrays;

public class ex13 {
    public static void main(String[] args) {
        int[] vect = {41,10,3,7,41,10,11,3};
        int[] vect1 = new int[vect.length];
        int nrUlt = vect.length - 1;
        int gasit = -1;
        for (int i = 0; i <= nrUlt; i++) {
            int nrOri = 1;
            for (int i2 = i + 1; i2 <= nrUlt; i2++) {
                if (vect[i2] == vect[i]) {
                    nrOri++;
                    vect1[i2] = gasit;
                }
            }
            if(vect1[i] != gasit){
                vect1[i] = nrOri;
            }
        }
        for (int i1 = 0; i1 <= nrUlt; i1++){
            if (vect1[i1] != gasit){
                System.out.println(vect[i1] + " " + vect1[i1]);
            }
        }
    }
}
