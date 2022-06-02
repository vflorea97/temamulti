package com.tema13part5;

public class ex8 {
    public static void main(String[] args) {
        int [] vect = {7,5,2,13,7,24,3,6};
        int nrUlt = vect.length - 1;
        int max = 0;
        int min = 0;
        int pozU = 0;
        int pozP = 0;
        for (int i = 0; i <= nrUlt; i++){
            if (max < vect[i]){
                max = vect[i];
                min = max;
                pozU = i;
            }
        }
        for (int i1 = 0; i1 <= nrUlt; i1++){
            if (min > vect[i1]){
                min = vect[i1];
                pozP = i1;
            }
        }
        for ( int i3 = pozP; i3 <= pozU; i3++){
            System.out.println(vect[i3]);
        }

    }
}
