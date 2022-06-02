package com.tema13part5;

public class ex6 {
    public static void main(String[] args) {
        int [] vect = {2,9,7,67,45,-2,3,5,7};
        int nrUlt = vect.length - 1;
        int min = 0;
        int max = 0;
        int pozP = 0;
        int pozU = 0;
        for (int i = 0; i <= nrUlt; i++){
            if (max < vect[i]){
                max = vect[i];
                min = max;
                pozU = i;
            }
        }
        for (int i1 = 0; i1 < nrUlt; i1++){
            if (min > vect[i1]) {
                min = vect[i1];
                pozP = i1;
            }
        }
        System.out.println(pozU);
        System.out.println(pozP);
    }
}
