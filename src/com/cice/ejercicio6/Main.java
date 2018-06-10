package com.cice.ejercicio6;

public class Main {
    public static void main(String[] args){

        int[] array = {1,5,3,4,-1,10,3,4};
        int i = 0;

        while (array[i]>=0){
            i++;
        }
        System.out.println("El número total de números recuperados es: "+ (i));

        int i1 = 0;

        do{
            i1++;
        } while (array[i1]>=0);
        System.out.println("El número total de números recuperados es: "+ (i));
    }
}
