package com.tema13part5;

public class Main {

    public static void main(String[] args) {
	int [] nr = {2,4,8,5,21,18,17};
    int lg = nr.length;
    int sumP = 0;
    int sumI = 0;
    for (int i = 0; i < lg; i++){
        if (nr[i] % 2 == 0) {
            sumP += nr[i];
            }
        if (nr[i] % 2 == 1) {
            sumI += nr[i];
            }
        }
        int rez = sumP - sumI;
        if (rez < 0) {
            rez = -rez;
        }
        System.out.println(rez);
    }
}
