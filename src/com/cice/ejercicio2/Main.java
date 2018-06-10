package com.cice.ejercicio2;


import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        int a = 2;
        //Scanner para poder pedir datos por consola al usuario
        System.out.println("Introduce un numero: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();

        if (a%2 == 0){
            System.out.println(a+" es un numero par");
        }else{
            System.out.println(a+" es un numero impar");
        }


    }
}
