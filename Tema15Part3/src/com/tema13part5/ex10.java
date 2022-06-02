package com.tema13part5;

public class ex10 {
    public static void main(String[] args) {
        int [] vect = {1,5,17,34,27,21,8,2,1};
        int nrUlt = vect.length - 1;
        int nrMax = 0;
        int pozitie = 0;
        int crescator = 0;
        int descrescator = 0;
        for (int i = 0; i <= nrUlt; i++){
            if (nrMax < vect[i]){
                nrMax = vect[i];
                pozitie = i;
            }
        }
        int rampa = pozitie;
        int panta = nrUlt - pozitie;
        for (int i1 = pozitie; i1 >= 0; i1--){
            if (vect[i1] < nrMax){
                crescator++;
            }
        }
        for (int i2 = pozitie; i2 <= nrUlt; i2++){
            if (vect[i2] < nrMax){
                nrMax = vect[i2];
                descrescator++;
                System.out.println(vect[i2]);
            }
        }
        if (crescator == rampa && descrescator == panta){
            System.out.println("Este sir munte");
        }else{
            System.out.println("Nu este sir munte");
        }
    }
}
