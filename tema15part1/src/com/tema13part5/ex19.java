package com.tema13part5;

public class ex19 {
    public static void main(String[] args) {
        int [] vert = {0,2,11,14,12,6,7,33};
        int nrUlt = vert.length - 1;
        int nrOri = 0;
        for (int i = 0; i <= nrUlt; i++){
            if (vert[i] % 2 != 0 || vert[i] == 2){
                nrOri++;
            }
        }
        System.out.println(nrOri);
    }
}
