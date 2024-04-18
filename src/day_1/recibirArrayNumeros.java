package day_1;

import java.util.Scanner;

public class recibirArrayNumeros {
    public static int[] inputArray(){
        Scanner input = new Scanner(System.in);
        int[] numeros = new int[6];
        for (int i = 0; i < 6; i++) {
            System.out.println("Ingrese el número "+(i+1)+":");
            numeros[i] = input.nextInt();
        }
        return numeros;
    }
    public static void imprimirPares(int[] array){
        boolean hayPares = false;
        for (int numero : array) {
            if (esPar.esPar(numero)){
                if (!hayPares){
                    System.out.println("Los números pares son:");
                    hayPares = true;
                }
                System.out.println(numero);
            }
        }
        if (!hayPares){
            System.out.println("No hay números pares");
        }
    }
    public static void imprimirSumaImpares(int[] array){
        System.out.println("La suma de los números impares es:");
        int suma = 0;
        for (int numero : array){
            if (!esPar.esPar(numero)){
                suma+=numero;
            }
        }
        System.out.println(suma);
    }
    public static void imprimirSumaPrimos(int[] array){
        System.out.println("La suma de los números primos es:");
        int suma = 0;
        for (int numero: array){
            if(esPrimo.esPrimo(numero)){
                suma+=numero;
            }
        }
        System.out.println(suma);
    }

    public static void imprimirParesYSumaPrimos(int[] array){
        imprimirPares(array);
        imprimirSumaPrimos(array);
    }
}
