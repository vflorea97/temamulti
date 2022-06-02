package com.tema13part5;

public class ex3 {
    public static void main(String[] args) {
        int[] vect = {2, 4, 24, 18, 46, 56, 18};
        int elemente = vect.length;
        int nrUlt = vect.length - 1;
        int count = 0;
        for (int i = 0; i <= nrUlt; i++){
            if(vect[i] % 2 == 0){
                count++;
            }
        }
        if (count == elemente){
            System.out.println("Toate numerele sunt pare");
        }else{
            System.out.println("Nu toate numerele sunt pare");
        }
    }
}
