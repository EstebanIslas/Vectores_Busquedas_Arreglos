package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //Guardar la primer entrada del usuario
        int[] numeros = new int[10]; //Arreglo que pide 10 numeros
        int veces = 1; // Variable para contar numeros para el usuario
        int orde; // realiza el ordenamiento de las variables
        int buscar; //Para la busqueda
        
        boolean mensaje = true; //mensaje de busqueda

        for (int i = 0; i < 10; i++) { //Ciclo que cuenta 10 veces los numeros que preguntaran al usuario
            System.out.print("Ingrese el numero " + veces + " : ");
            numeros[i] = entrada.nextInt();
            veces += 1;
        }
        for (int a = 0; a <= numeros.length - 1; a++) { //Ciclo para imprimir los numeros que se han introducido
            System.out.println(numeros[a] + "");
        }
        System.out.println("");

        for (int b = 0; b < numeros.length - 1; b++) { //Ciclo que cuenta el total de numeros en el arreglo
            for (int c = 0; c < numeros.length - 1; c++) {// cuenta los numeros para ordenar
                if (numeros[c] < numeros[c + 1]) {  
                    orde = numeros[c]; 
                    numeros[c] = numeros[c + 1];
                    numeros[c + 1] = orde;
                }

            }
        }
        for (int d = 0; d < numeros.length; d++) { // Imprimir los numeros ordenados
            System.out.println(numeros[d]);
        }

        Scanner tecla = new Scanner(System.in);
        System.out.println("Ingresa el numero a buscar: ");
        buscar = tecla.nextInt();

        for (int e = 0; e < numeros.length - 1; e++) { //Ciclo que cuenta el total de numeros en el arreglo
            if (numeros[e] == buscar) { //Si la vuelta de la variable e es igual a la busqueda del usuario
                System.out.println("El numero " + numeros[e] + " esta en la posicion " + (e + 1));
                mensaje = false;
                break;
            }
        }
        if (mensaje == true) {
            System.out.println("Numero no encontrado!!");
        }

    }

}
