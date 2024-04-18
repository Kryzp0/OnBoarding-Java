package day_1;

import java.util.Scanner;

public class calculadoraBasica {
    public static void menuCalculadora(){
        Scanner input = new Scanner(System.in);
        boolean aux = true;
        do {
        System.out.println("Calculadora Básica");
        System.out.println("Elija una opción:");
        System.out.println("1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir\n5. Potencia\n6. Raíz Cuadrada\n0. Finalizar");
        byte opcion = input.nextByte();
        switch (opcion){
            case 0:
                System.out.println("Finalizando...");
                aux = false;
                break;
            case 1:
                suma();
                break;
        }

        }
        while (aux);
    }
    public static void suma(){
        boolean aux = true;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Ingrese el primer número que desea sumar");
            float numero1 = input.nextFloat();
            System.out.println("Ingrese el segundo número que desea sumar");
            float numero2 = input.nextFloat();
            float suma = numero1 + numero2;
            System.out.println("La suma total es: " + suma);
            System.out.println("Para volver al menú ingrese 1 y para realizar otra suma ingrese cualquier otro número");
            byte opcion = input.nextByte();
            if (opcion == 1) {
                aux = false;
            }
        }
        while (aux);
    }
}
