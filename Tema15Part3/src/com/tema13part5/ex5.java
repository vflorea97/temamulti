package com.tema13part5;

public class ex5 {
    public static void main(String[] args) {
        int [] vect = {-2,4,17,24,32,56,73};
        int nrPr = vect[0];
        int elemente = vect.length;
        int nrUlt = vect.length - 1;
        int count = 0;
        for (int i = 0; i <= nrUlt; i++){
            if (nrPr <= vect[i]){
                nrPr = vect[i];
                count++;
            }
        }
        if (elemente == count){
            System.out.println("Numerele sunt in ordine crescatoare");
        }else{
            System.out.println("Numerele nu sun in ordine crescatoare");
        }
    }
}
