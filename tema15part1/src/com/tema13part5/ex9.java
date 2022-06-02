package com.tema13part5;

public class ex9 {
    public static void main(String[] args) {
        int[] vect = {3, 5, 8, 12, 23, 9, 46, 5};
        int nrUlt = vect.length - 1;
        int primP = 0;
        int pozP = 0;
        int pozU = 0;
        for (int i = 0; i <= nrUlt; i++){
            if (vect[i] % 2 == 0){
                primP = vect[i];
                pozU = i;
            }
        }
        for (int i1 =0; i1 <= nrUlt; i1++){
            if (primP > vect[i1] && vect[i1] % 2 == 0){
                primP = vect[i1];
                pozP = i1;
            }
        }
        int sum = 0;
        for (int i3 = pozP + 1; i3 < pozU; i3++){
            sum += vect[i3];
        }
        System.out.println(sum);
    }
}
