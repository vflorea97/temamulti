package com.tema13part5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] vect = {3,5,13,24,54,2,17};
        int[] vect1 = new int[vect.length-1];
        int nrUlt = vect.length - 1;
        int poz = 3;
        int gasit = 0;
        for(int i = 0; i <= nrUlt; i++){
            if(i != poz){
                vect1[gasit] = vect[i];
                gasit++;
            }
        }
        System.out.println(Arrays.toString(vect1));
    }
}
