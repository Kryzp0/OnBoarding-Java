package day_1;

import java.util.Objects;
import java.util.Scanner;

public class entradaBowling {
    int ganancia = 0;

    public static void menuEntrada() {
        int cantidad = 500;
        Scanner input = new Scanner(System.in);
        boolean aux = true;
        entradaBowling plata = new entradaBowling();
        do {
            System.out.println("Entrada a Blowling");
            System.out.println("Elija una opción:");
            System.out.println("1. Introducir datos personales\n2. Aforo disponible\n3. Dinero Recaudado\n0. Finalizar");
            byte opcion = input.nextByte();
            switch (opcion) {
                case 0:
                    System.out.println("Finalizando...");
                    aux = false;
                    break;
                case 1:
                    String acceso = inputDatosPersonales(plata);
                    if (acceso.equals("Acceso permitido")) {
                        System.out.println(acceso);
                        cantidad--;
                    } else {
                        System.out.println(acceso);
                    }
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    System.out.println("El aforo es de:" + cantidad + " personas");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    System.out.println("El dinero recaudado es: " + plata.ganancia);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;
                default:
                    System.out.println("Hay que aprender a leer");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;
            }

        }
        while (aux);
    }

    public static String inputDatosPersonales(entradaBowling plata) {
        String entrada;
        boolean aux = true;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese su nombre:");
        String nombre = input.nextLine();
        System.out.println("Ingrese su edad");
        int edad = input.nextInt();
        input.nextLine();
        if (edad >= 21) {
            System.out.println("Ingrese su DNI");
            String DNI = input.nextLine();
            do {
                System.out.println("Posee una entrada?");
                entrada = input.nextLine().toLowerCase();
                if (!tipoDeEntrada(entrada, plata)) {
                    return "Acceso permitido";
                } else {
                    aux = false;
                }
            } while (aux);
        }
        return "Operación cancelada";
    }

    public static boolean tipoDeEntrada(String respuesta, entradaBowling plata) {
        Scanner input = new Scanner(System.in);
        if (Objects.equals(respuesta, "si")) {
            System.out.println(("Qué tipo de entrada posee? VIP o Descuento"));
            String tipoDeEntrada = input.next().toLowerCase();
            if (Objects.equals(tipoDeEntrada, "vip")) {
                return false;
            }
            if (Objects.equals(tipoDeEntrada, "descuento")) {
                System.out.println("Qué entrada desea comprar con 50% de decuento? VIP (valor  ̶2̶0̶0̶0̶ 1000), Normal (valor  ̶1̶0̶0̶0̶ 750) o Cancelar");
                String comprarEntrada = input.next().toLowerCase();
                switch (comprarEntrada) {
                    case "vip":
                        plata.ganancia += 1000;
                        break;
                    case "normal":
                        plata.ganancia += 750;
                        break;
                    case "cancelar":
                        return true;
                    default:
                        System.out.println("Texto inválido");
                        return true;
                }
                return false;
            }

        }
        if (Objects.equals(respuesta, "no")) {
            System.out.println("Qué entrada desea comprar? VIP (valor 2000), Normal (valor 1500) o Cancelar");
            String comprarEntrada = input.next().toLowerCase();
            switch (comprarEntrada) {
                case "vip":
                    plata.ganancia += 2000;
                    break;
                case "normal":
                    plata.ganancia += 1500;
                    break;
                case "cancelar":
                    return true;
                default:
                    System.out.println("Texto inválido");
                    return true;
            }
            return false;
        }
        return true;
    }
}
