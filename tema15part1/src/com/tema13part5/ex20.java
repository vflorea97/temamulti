package com.tema13part5;

public class ex20 {
    public static void main(String[] args) {
        int [] vect = {10,122,144,162,20,257};

        int nrUlt = vect.length - 1;
        for (int i = 0; i <= nrUlt; i++){
            int ogld = 0;
            int r = vect[i];
            while (vect[i] > 0){
                int i1 = vect[i] % 10;
                ogld = ogld * 10 + i1;
                vect[i] /= 10;
            }
            int ogld1 = 0;
            while (ogld > 10){
                int ogld2 = ogld % 10;
                ogld1 = ogld1 * 10 + ogld2;
                ogld /= 10;
            }
            int count = 0;
            for (int i1 = 1; i1 * i1 <= ogld1; i1++){
                count++;
                if (ogld1 / count == count){
                    System.out.println(r);
                }
            }
        }
    }
}
