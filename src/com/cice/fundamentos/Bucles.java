package com.cice.fundamentos;

public class Bucles {
    public static void main(String[] args){

        int i = 0;

        //BUCLE FOR
        for(; i < 10; i++){
            System.out.println("hola");
        }

        //FOREACH
        int [] array = {1,2,3,4,5,6,7,8,9};

        for(int a : array){
            System.out.println(a);
        }

        //WHILE

        while(i < 10){
            System.out.println("I vale:"+ i);
            i++;
        }

        do{
            System.out.println("I vale: "+ i++);
        }while (i < 10); //La diferencia con el while es que este siempre te sacará un valor aunque no cumpla la condición
    }

}
