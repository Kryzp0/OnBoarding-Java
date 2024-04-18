package day_1;

import java.util.Scanner;

public class esPrimo {
    public static void respuestaPrimo(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese una número:");
        int numero = input.nextInt();
        if (esPrimo(numero)){
            System.out.println("El número "+numero+" es primo");
        }else {
            System.out.println("El número "+numero+" no es primo");
        }
    }
    public static boolean esPrimo(int numero){
        if (numero<=1){
            return false;
        }
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

}
