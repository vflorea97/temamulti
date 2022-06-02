package com.tema13part5;

public class Main {

    public static void main(String[] args) {
	int [] vect = {1,3,24,13,15,63,9};
    int nrUlt = vect.length - 1;
    int count = 0;
    for ( int i = 0; i <= nrUlt; i++){
        if (vect[i] % 2 != 0){
            count++;
            }
        }
    if (count > 0){
        System.out.println("Exista numere impare");
    }else{
        System.out.println("Nu exista numere impare");
        }
    }
}
