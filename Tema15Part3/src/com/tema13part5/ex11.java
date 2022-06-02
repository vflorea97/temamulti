package com.tema13part5;

public class ex11 {
    public static void main(String[] args) {
        int [] vect = {34,31,17,6,3,8,11,47};
        int nrUlt = vect.length - 1;
        int nrMax = 0;
        int pozitie = 0;
        int crescator = 0;
        int descrescator = 0;
        for (int i = 0; i <= nrUlt; i++){
            if (nrMax < vect[i]){
                nrMax = vect[i];
            }
        }
        int nrMin = nrMax;
        for (int i1 = 0; i1 <= nrUlt; i1++){
            if (nrMin > vect[i1]){
                nrMin = vect[i1];
                pozitie = i1;
            }
        }
        int nrMin1 = nrMin;
        int panta = pozitie;
        int rampa = nrUlt - pozitie;
        for (int i2 = pozitie; i2 <= nrUlt; i2++){
            if (vect[i2] > nrMin){
                nrMin = vect[i2];
                crescator++;
            }
        }
        for (int i3 = pozitie; i3 >= 0; i3--){
            if (vect[i3] > nrMin1){
                descrescator++;
            }
        }
        if (crescator == rampa && descrescator == panta){
            System.out.println("Este sir vale");
        }else{
            System.out.println("Nu este sir vale");
        }

    }
}
