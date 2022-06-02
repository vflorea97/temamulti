package com.tema13part5;

public class ex11 {
    public static void main(String[] args) {
        int [] vect = {1,15,6,9,20,47,85,34,12};
        int nrUlt = vect.length - 1;
        int sum = 0;
        int sum1 = 0;
        int sum2 = 0;
        int nrOri = 0;
        System.out.println("Numerele de la dreapa la stanga: ");
        for (int i = nrUlt; i >= 0; i--){
            System.out.println(vect[i]);
            if (vect[i] % 2 == 0){
                sum += vect[i];
            }
        }
        System.out.println();
        System.out.println("Suma: " + sum);
        for (int i1 = 0; i1 <= nrUlt; i1++){
            if (i1 % 2 == 0){
                sum1 += vect[i1];

            }
        }
        System.out.println();
        System.out.println("Suma pozitie: " + sum1);
        for (int i2 = 0; i2 <= nrUlt; i2++){
            if(vect[i2] % 10 == 0){
                nrOri ++;
            }
        }
        System.out.println();
        System.out.println("Numere divizibile cu 10: " + nrOri);
        for (int i3 = 0; i3 <= nrUlt; i3++){
            if(i3 % 2 == 1 && vect[i3] % 3 == 0){
                sum2 += vect[i3];
            }
        }
        System.out.println();
        System.out.println("Suma imp div 3: " + sum2);
    }
}
