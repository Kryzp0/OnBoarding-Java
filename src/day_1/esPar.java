package day_1;

import java.util.Scanner;

public class esPar {
    public static boolean esPar(int numero) {
        int resto = numero % 2;
        if (resto == 0) {
            return true;
        }
        return false;
    }
    public static void respuestaPar(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese una número:");
        int numero = input.nextInt();
        if (esPar(numero)){
            System.out.println("El número "+numero+" es par");
        }else {
            System.out.println("El número "+numero+" no es par");
        }
    }
}
