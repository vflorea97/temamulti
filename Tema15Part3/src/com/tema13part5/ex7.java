package com.tema13part5;

public class ex7 {
    public static void main(String[] args) {
        int [] vect = {12,27,18,34,21,3};
        int nrUlt = vect.length - 1;
        int count = 0;
        for (int i = 0; i <= nrUlt; i++){
            if (vect[i] % 3 == 0){
                count++;
            }
        }
        if (count == nrUlt){
            System.out.println("Toate numerele sunt multipii ultimului numar");
        }else{
            System.out.println("Nu toate numerele sunt multipii ultimului numar");
        }
    }
}
