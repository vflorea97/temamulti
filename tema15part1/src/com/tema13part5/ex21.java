package com.tema13part5;

public class ex21 {
    public static void main(String[] args) {
        int [] vect = {4,12,45,6,11,23,1};
        int nrUlt = vect.length - 1;
        int sum = 0;
        for (int i = 0; i <= nrUlt; i++){
            sum += vect[i];
        }
        for (int i1 = nrUlt; i1 >= 0; i1--){
            System.out.println(sum);
            sum -= vect[i1];
        }
    }
}
