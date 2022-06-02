package com.tema13part5;

import java.util.Arrays;

public class ciorna {
    public static void main(String[] args) {
        int [] vect = {3,5,13,24,54,2,17};
        int nrUlt = vect.length - 1;
        int pozDat= 3;
        for (int i = 0; i <= nrUlt; i++){
            if(i == pozDat){
                vect[i] = 0;
            }
        }
        int [] vect1 = new int[vect.length - 1];
        for (int i1 = 0; i1 <= vect1.length - 1 ; i1++){
            if (vect[i1] == 0){
                vect1[i1] = vect[i1 + 1];
            }
        }int i3 = 0;
        for (int i2 = 0; i2 <= vect1.length - 1; i2++){
            if (vect1[i2] == 0){
                vect1[i3] = vect[i2];
                i3++;
            }
        }
        System.out.println(Arrays.toString(vect1));

    }
}
