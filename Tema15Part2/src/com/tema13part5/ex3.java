package com.tema13part5;

import java.util.Arrays;

public class ex3 {
    public static void main(String[] args) {
        int [] vect = {0,34,12,3,5,18,42};
        int [] vect1 = new int [vect.length + 1];
        int nrUlt = vect.length - 1;
        int poz = 4;
        int nr = 15;
        for (int i = 0; i <= nrUlt; i++){
            if (i == poz) {
                vect1[poz] = nr;
            }
        }
        int gasit = 0;
        for (int i1 = 0; i1 <= vect.length; i1++){
            if (i1 != poz){
                vect1[i1] = vect[gasit];
                gasit++;
            }
        }
        System.out.println(Arrays.toString(vect1));
    }
}
