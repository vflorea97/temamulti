package com.tema13part5;

public class ex4 {
    public static void main(String[] args) {
        int [] vect = {3,3,3,3,3,3,3};
        int refer = vect[0];
        int elemente = vect.length;
        int nrUlt = vect.length - 1;
        int count = 0;
        for (int i = 0; i <= nrUlt; i++){
            if(vect[i] == refer){
                count++;
            }
        }
        if (elemente == count){
            System.out.println("Toate numerele sunt egale");
        }else{
            System.out.println("Nu toate numerele sunt egale");
        }
    }
}
