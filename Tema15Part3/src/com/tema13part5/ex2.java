package com.tema13part5;

public class ex2 {
    public static void main(String[] args) {
        int [] vect = {12,24,4,10,16,25,18};
        int nrUlt = vect.length - 1;
        int count1 = 0;
        for (int i = 0; i <= nrUlt; i++){
            int i2 = 1;
            int count = 0;
            while (i2 <= vect[i]){
                if(vect[i] % i2 == 0){
                    count++;
                }
                i2++;
            }
            if (count == 2){
                count1++;
            }
        }
        if (count1 > 0){
            System.out.println("Avem numere prime");
        }else{
            System.out.println("Nu avem numere prime");
        }
    }
}
