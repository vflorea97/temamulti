package com.tema13part5;

public class ex18 {
    public static void main(String[] args) {
        int [] vect = {3,5,8,34,8,6,23};
        int poz = 2;
        int nrAls = 0;
        int n = 1;
        int nrUlt = vect.length - 1;
        for (int i = 0; i <= nrUlt; i++){
            if (i == poz){
                nrAls = vect[i];
            }
        }
        for (int i1 = 1; i1 <= nrAls; i1++){
            n = n * i1;
        }
        System.out.println(n);
    }
}
