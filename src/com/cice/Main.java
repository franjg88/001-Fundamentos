package com.cice;

public class Main {

    private static String nombre = "Gustavo";
    /**
     * Esto es un comentario para la documentacion del javaDoc
     * @param args
     */

    public static void main(String[] args) {
	// write your code here
        //Poner un comentario en una linea
        /*
        *comentario
        * en
        * varias
        * lineas
        * */

        byte numero;
        numero = 127;
        numero = 124;

        final int CONSTANTE_NO_MUTABLE=12;

        nombre="Pedro";


    }

    /**
     * Metodo que pasando un nombre va a devolver un saludo personalizado
     * @param nombre -> nombre de la persona que vamos a saludar
     * @return->que va a devolver despues de ejecutarse el metodo
     */
    public static String saluda(String nombre){
        int dato = (1 == 2) ? 1 : 2; //Condicion ternaria. Si 1==2 es true devuelve 1. Si no devuelve 2
        return "hola chicos!!";
    }
}
