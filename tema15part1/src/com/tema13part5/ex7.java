package com.tema13part5;

public class ex7 {
    public static void main(String[] args) {
        int [] vect = {3,4,75,13,23,45,78};
        int nrUlt = vect.length - 1;
        int min = 0;
        int max = 0;
        for (int i = 0; i <= nrUlt; i++){
            if (max < vect[i]){
                max = vect[i];
                min = max;

            }
        }
        for (int i1 = 0; i1 < nrUlt; i1++){
            if (min > vect[i1]) {
                min = vect[i1];
            }
        }
        int nrEg = 0;
        int sum = max - min;
        for (int i2 = 0; i2 < nrUlt; i2++){
            if (sum == vect[i2]){
                nrEg++;
            }
        }
        System.out.println(nrEg);
    }
}
