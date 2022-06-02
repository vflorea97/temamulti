package com.tema13part5;

public class ex14 {
    public static void main(String[] args) {
        int [] vect = {3,45,8,3,8,8,34,6,21,45};
        int nrUlt = vect.length - 1;
        int count = 0;
        for (int i = 0; i <= nrUlt; i++){
            int count1 = 0;
            for (int i1 = 0; i1 <= nrUlt; i1++){
                if (vect[i] == vect[i1] && i != i1){
                    count1++;
                }
            }
            if (count1 == 0){
                count++;
            }
        }
        System.out.println("Apar o singura data, " + count + " numere");
    }
}
