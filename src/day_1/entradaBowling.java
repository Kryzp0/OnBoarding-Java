package day_1;

import java.util.Scanner;

public class entradaBowling {
        public static void menuEntrada() {
            Scanner input = new Scanner(System.in);
            boolean aux = true;
            do {
                System.out.println("Calculadora Básica");
                System.out.println("Elija una opción:");
                System.out.println("1. Introducir datos personales\n2. Capacidad disponible\n3. Dinero Recaudado\n0. Finalizar");
                byte opcion = input.nextByte();
                switch (opcion) {
                    case 0:
                        System.out.println("Finalizando...");
                        aux = false;
                        break;
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    default:
                        System.out.println("Hay que aprender a leer");
                        try{
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            // Manejo de la excepción
                            e.printStackTrace();
                        }
                        break;
                }

            }
            while (aux);
    }
}
