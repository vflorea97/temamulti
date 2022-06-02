package com.tema13part5;

public class ex10 {
    public static void main(String[] args) {
        int [] vect = {3,6,4,10,34,1,5,18};
        int nrUlt = vect.length - 1;
        int sum = 0;
        int nrOri = 0;
        for (int i = 0; i <= nrUlt; i++){
            sum += vect[i];
        }
        int med = sum / vect.length;
        for (int i1 = 0; i1 <= nrUlt; i1++){
            if (vect[i1] == med){
                nrOri++;
            }
        }
        System.out.println(nrOri);
    }
}
