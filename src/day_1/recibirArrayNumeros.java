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
        System.out.println("Los números pares son:");
        for (int numero : array) {
            if (esPar.esPar(numero)){
                System.out.println(numero);
            }
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

}
