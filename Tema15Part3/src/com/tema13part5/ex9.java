package com.tema13part5;

public class ex9 {
    public static void main(String[] args) {
        int [] vect  = {1,17,13,45,10,7,100};
        int nrPr = vect[0];
        int nrUlt = vect[vect.length - 1];
        int pozitie = vect.length - 1;
        int elemente = vect.length - 2;
        int count = 0;
        for (int i = 1; i <= pozitie; i++){
            if (vect[i] > nrPr && vect[i] < nrUlt){
                count++;
            }
        }
        if (count == elemente){
            System.out.println("Toate elementele apartin intervalului inchis");
        }else{
            System.out.println("Nu toate elementele apartin intervalului inchis");
        }
    }
}
