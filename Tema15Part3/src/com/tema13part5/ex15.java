package com.tema13part5;

public class ex15 {
    public static void main(String[] args) {
        int [] vect = {2,5,12,21,1,8,45,18};
        int nrDat = 3;
        int nrPar = 0;
        int nrUlt = vect.length - 1;
        for (int i = 0; i <= nrUlt; i++){
            if (vect[i] % 2 == 0 && nrDat > 0){
                nrPar = vect[i];
                nrDat--;
            }
        }
        System.out.println(nrPar);
    }
}
