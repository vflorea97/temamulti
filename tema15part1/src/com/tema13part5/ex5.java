package com.tema13part5;

public class ex5 {
    public static void main(String[] args) {
        int [] vect = {2,9,7,67,-2,45,3,5,7};
        int nrUlt = vect.length - 1;
        int min = vect[0];
        int max = vect[0];
        for (int i = 0; i <= nrUlt; i++){
            if (max < vect[i]){
                max = vect[i];

            }
            if (min > vect[i]) {
                min = vect[i];

            }
        }
        //for (int i1 = 0; i1 < nrUlt; i1++){

        //}
        System.out.println(min);
        System.out.println(max);
    }
}
