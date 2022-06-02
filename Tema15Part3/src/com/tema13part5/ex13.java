package com.tema13part5;

public class ex13 {
    public static void main(String[] args) {
        int [] vect = {23,13,45,11,8,21,19,38};
        int nrUlt = vect.length - 1;
        int start = 0;
        for (int i = 0; i <= nrUlt; i++){
            int nrMare = 0;
            boolean gasit = false;
            for (int i1 = start; i1 <= nrUlt; i1++){
             if (vect[i] < vect[i1] && !gasit){
                 nrMare = vect[i1];
                 gasit = true;
                }
            }
            start++;
            if (vect[i] < nrMare){
                System.out.println("Numarul mai mare ca " + vect[i] + " este " + nrMare);
            }else{
                System.out.println(-1);
            }
        }
    }
}
