package day_1;

import java.util.Scanner;

public class calculadoraBasica {
    public static void menuCalculadora() {
        Scanner input = new Scanner(System.in);
        boolean aux = true;
        do {
            System.out.println("Calculadora Básica");
            System.out.println("Elija una opción:");
            System.out.println("1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir\n5. Potencia\n6. Raíz Cuadrada\n0. Finalizar");
            byte opcion = input.nextByte();
            switch (opcion) {
                case 0:
                    System.out.println("Finalizando...");
                    aux = false;
                    break;
                case 1:
                    suma();
                    break;
                case 2:
                    resta();
                    break;
                case 3:
                    multiplicacion();
                    break;
                case 4:
                    division();
                    break;
                case 5:
                    potencia();
                    break;
                case 6:
                    raizCuadrada();
                    break;
                default:
                    System.out.println("Hay que aprender a leer");
                    try{
                    Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;
            }

        }
        while (aux);
    }

    public static void suma() {
        boolean aux = true;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Ingrese el primer número que desea sumar");
            float numero1 = input.nextFloat();
            System.out.println("Ingrese el segundo número que desea sumar");
            float numero2 = input.nextFloat();
            float resultado = numero1 + numero2;
            System.out.println("La resultado total es: " + resultado);
            System.out.println("Para volver al menú ingrese 1 y para realizar suma ingrese cualquier otro número");
            byte opcion = input.nextByte();
            if (opcion == 1) {
                aux = false;
            }
        }
        while (aux);
    }

    public static void resta() {
        boolean aux = true;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Ingrese el primer número que desea restar (minuendo)");
            float numero1 = input.nextFloat();
            System.out.println("Ingrese el segundo número (sustraendo)");
            float numero2 = input.nextFloat();
            float resultado = numero1 - numero2;
            System.out.println("El total de la resta es: " + resultado);
            System.out.println("Para volver al menú ingrese 1 y para realizar otra resta ingrese cualquier otro número");
            byte opcion = input.nextByte();
            if (opcion == 1) {
                aux = false;
            }
        }
        while (aux);
    }
    public static void multiplicacion() {
        boolean aux = true;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Ingrese el primer número que desea multiplicar (multiplicando)");
            float numero1 = input.nextFloat();
            System.out.println("Ingrese el segundo número (multiplicador)");
            float numero2 = input.nextFloat();
            double resultado = numero1 * numero2;
            System.out.println("El total de la multiplicación es: " + resultado);
            System.out.println("Para volver al menú ingrese 1 y para realizar otra multiplicación ingrese cualquier otro número");
            byte opcion = input.nextByte();
            if (opcion == 1) {
                aux = false;
            }
        }
        while (aux);
    }
    public static void division() {
        boolean aux = true;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Ingrese el primer número que desea dividir (dividendo)");
            float numero1 = input.nextFloat();
            System.out.println("Ingrese el segundo número (divisor)");
            float numero2 = input.nextFloat();
            double resultado = numero1 / numero2;
            System.out.println("El total de la división es: " + resultado);
            System.out.println("Para volver al menú ingrese 1 y para realizar otra división ingrese cualquier otro número");
            byte opcion = input.nextByte();
            if (opcion == 1) {
                aux = false;
            }
        }
        while (aux);
    }
    public static void potencia() {
        boolean aux = true;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Ingrese el primer número que desea elevar (base)");
            float numero1 = input.nextFloat();
            System.out.println("Ingrese el segundo número (exponente)");
            float numero2 = input.nextFloat();
            double resultado = Math.pow(numero1, numero2);
            System.out.println("El total de la potencia es: " + resultado);
            System.out.println("Para volver al menú ingrese 1 y para realizar otra potencia ingrese cualquier otro número");
            byte opcion = input.nextByte();
            if (opcion == 1) {
                aux = false;
            }
        }
        while (aux);
    }
    public static void raizCuadrada() {
        boolean aux = true;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Ingrese el número del cual desea obtener la raíz cuadrada");
            float numero1 = input.nextFloat();
            double resultado = Math.sqrt(numero1);
            System.out.println("El total de la potencia es: " + resultado);
            System.out.println("Para volver al menú ingrese 1 y para obtener otra raíz cuadrada ingrese cualquier otro número");
            byte opcion = input.nextByte();
            if (opcion == 1) {
                aux = false;
            }
        }
        while (aux);
    }
}
