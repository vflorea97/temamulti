package com.tema13part5;

public class ex8 {
    public static void main(String[] args) {
        int [] vect = {1,34,22,7,18,34,2};
        int [] vect1 = {22,2,1,34,18,7,34};
        int elemente = vect.length;
        int nrUlt = vect.length - 1;
        int count = 0;
        for (int i = 0; i <= nrUlt; i++){
            boolean pozitieGasita = false;
            for (int i1 = 0; i1 <= nrUlt; i1++){
                if (vect[i] == vect1[i1] && !pozitieGasita){
                    pozitieGasita = true;
                    count++;
                }
            }
        }
        if (count == elemente){
            System.out.println("Vectorii contin exact aceleasi elemente");
        }else{
            System.out.println("Vectorii nu contin exact aceleasi elemente");
        }
    }
}
