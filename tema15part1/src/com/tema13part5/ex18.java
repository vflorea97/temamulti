package com.tema13part5;

public class ex18 {
    public static void main(String[] args) {
        int [] vect = {2,45,7,12,3,3,56,3};
        int nrUlt = vect.length - 1;
        int nrOri = 0;
        for (int i = nrUlt; i >= 0; i--){
            if (vect[i] == vect[nrUlt]){
                nrOri++;
            }
        }
        System.out.println(nrOri);
    }
}
