package com.tema13part5;

public class ex17 {
    public static void main(String[] args) {
        int [] vect = {2,13,8,34,21,8,10,8,17,0,8};
        int nrUlt = vect.length - 1;
        int nrMaj = 0;
        for ( int i = 0; i <= nrUlt; i++){
            int count = 0;
            for ( int i1 = 0; i1<= nrUlt; i1++){
                if (vect[i] == vect[i1]){
                    count++;
                }
            }
            if (count == vect[i] / 2){
                nrMaj = vect[i];
            }
        }
        System.out.println(nrMaj);
    }
}
