package day_1;

import java.util.Scanner;

public class buscarMayor {
    public static void buscarMayor() {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        int numero1 = input.nextInt();

        System.out.println("Ingrese el segundo número:");
        int numero2 = input.nextInt();

        System.out.println("Ingrese el tercer número:");
        int numero3 = input.nextInt();


        int mayor = numero1;

        if (numero2 > mayor) {
            mayor = numero2;
        }
        if (numero3 > mayor) {
            mayor = numero3;
        }
        System.out.println("El número mayor es: " + mayor);
    }
}
