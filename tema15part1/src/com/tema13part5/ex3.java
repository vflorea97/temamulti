package com.tema13part5;

public class ex3 {
    public static void main(String[] args) {
        int [] vert = {3,5,7,34,56,2};
        int lg = vert.length;
        int nrUlt = lg - 1;
        for (int i = 0; i <= nrUlt; i++){
            if (i % 2 == 0){
                System.out.println(vert[i]);
            }
        }
        for (int i1 = nrUlt; i1 >= 0;i1--){
            if (i1 % 2 == 1) {
                System.out.println(vert[i1]);
            }
        }
    }
}
