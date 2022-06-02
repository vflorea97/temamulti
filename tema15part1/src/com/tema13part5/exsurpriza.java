package com.tema13part5;

public class exsurpriza {
    public static void main(String[] args) {
        int [] vect = {1,2,3,4,5,7,8,9,10,11};
        int nrUlr = vect.length - 1;
        int nrLips = 0;
        for (int i = 0; i < nrUlr; i++){
            if (vect[i + 1] != vect[i] + 1){
                nrLips = vect[i] + 1;

            }
        }
        System.out.println(nrLips);
    }
}
