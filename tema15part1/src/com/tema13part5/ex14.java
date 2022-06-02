package com.tema13part5;

public class ex14 {
    public static void main(String[] args) {
        int [] vect = {2,0,43,0,12,6,0,0,7};
        int nrUlt = vect.length - 1;
        int sum = 0;
        int nr = 0;
        for (int i = 0; i <= nrUlt; i++){
            if (vect[i] != 0){
                sum += vect[i];
                nr++;
            }
        }
        int med = sum / nr;
        for (int i1 = 0; i1 <= nrUlt; i1++){
            if (vect[i1] == 0){
                vect[i1] = med;
            }
            System.out.println(vect[i1]);
        }
    }
}
