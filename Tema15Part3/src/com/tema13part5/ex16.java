package com.tema13part5;

public class ex16 {
    public static void main(String[] args) {
        int [] vect = {3,2,45,13,7,22,8,4};
        int nrDat = 2;
        int nrImp = 0;
        int nrUlt = vect.length - 1;
        for (int i = 0; i <= nrUlt; i++){
            if (vect[i] % 2 != 0 && nrDat > 0){
                nrImp = vect[i];
                nrDat--;
            }
        }
        System.out.println(nrImp);
    }
}
