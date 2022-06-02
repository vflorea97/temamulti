package com.tema13part5;

public class ex6 {
    public static void main(String[] args) {
        int [] vect = {31,24,17,12,9,4,1};
        int nrPr = vect[0];
        int nrUlt1 = vect[vect.length - 1];
        int elementeBaza = vect.length;
        int elementeC = 0, elementeSCr = 0, elementeCr = 0, elementeSD = 0, elementeD = 0;
        int nrUlt = vect.length - 1;
        for (int i = 0; i<= nrUlt; i++){
            if (vect[i] == nrPr){
                elementeC++;
            }
            if (nrPr <= vect[i] && nrPr > 0){
                elementeSCr++;
                nrPr = vect[i];
            }
            if(nrPr <= vect[i] && vect[0] == 0){
                nrPr = vect[i];
                elementeCr++;
            }
            if (vect[i] <= nrPr && nrUlt1 != 0){
                nrPr = vect[i];
                elementeSD++;
            }
            if (vect[i] <= nrPr && nrUlt1 == 0){
                nrPr = vect[i];
                elementeD++;
            }
        }
        if (elementeC == elementeBaza){
            System.out.println("Sir constant");
        }
        else if (elementeSCr == elementeBaza){
            System.out.println("Sir strict crescator");
        }
        else if (elementeCr == elementeBaza){
            System.out.println("Sir crescator");
        }
        else if (elementeSD == elementeBaza){
            System.out.println("Sir strict descrescator");
        }
        else if (elementeD == elementeBaza){
            System.out.println("Sir descrescator");
        }

    }
}
