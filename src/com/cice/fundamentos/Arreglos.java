package com.cice.fundamentos;

public class Arreglos {

    int a = 10;
    int[] numeros = new int[a];
    static int[] otrosnumeros = {1,2,3,4,5};
    int numero[] = new int[a];

    public static void main(String[] args){

        System.out.println(otrosnumeros[4]);

        otrosnumeros[1] = 3;

        int size = otrosnumeros.length;

        System.out.println(size);

        //ARRAYS DE VARIAS DIMENSIONES

        int[][] arrayBidimensional = new int[2][4];
        int[] array2[] = new int[2][4];
        int array2b[][] = {{0,1,2,3},{2,1,5,4},{5,4,7,8},{6,5,4,1}};

        System.out.println(array2b[1][2]);

        int [][][] array3d = {{{1,2},{2,4}},{{5,4},{8,4}}};
        int [][][] array3d2 = new int[2][2][2];


    }
}
