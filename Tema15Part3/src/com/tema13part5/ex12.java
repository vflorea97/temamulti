package com.tema13part5;

public class ex12 {
    public static void main(String[] args) {
        int [] vect = {2,13,45,5,5,5,16,9,9,9};
        int nrUlt = vect.length - 1;
        int count = 0;
        for (int i = 1; i < nrUlt; i++){
            if (vect[i - 1] == vect[i] && vect[i + 1] == vect[i]){
                count++;

            }
        }
        if (count > 0){
            System.out.println("Exista paritate intre vecini");
        }else{
            System.out.println("Nu exista paritate intre vecini");
        }
    }
}
