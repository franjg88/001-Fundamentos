package com.cice.ejercicio4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número para calcular su factorial: ");
        int var = sc.nextInt();

        int fact = 1;
        for (int i = 1; i <= var; i++) {
            fact *= i;
        }
        System.out.println("El factorial de "+var+"es: "+fact);
    }
}
