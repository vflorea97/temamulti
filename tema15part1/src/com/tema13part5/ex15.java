package com.tema13part5;

public class ex15 {
    public static void main(String[] args) {
        int [] vect1 = {2,0,14,53,2,43,12};
        int [] vect2 = {11,3,24,31,12,5,8,45};
        int nrUlt1 = vect1.length - 1;
        int nrUlt2 = vect2.length - 1;
        int nrOri = 0;
        int max = 0;
        for (int i2 = 0; i2 <= nrUlt2; i2++){
            if (max < vect2[i2]){
                max = vect2[i2];
            }
        }
        for (int i = nrUlt1; i >= 0; i--){
                if (vect1[i] > max) {
                    nrOri++;
                }
        }
        System.out.println(nrOri);
    }
}
