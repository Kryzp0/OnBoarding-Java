package day_4;

import java.util.Scanner;

public class Calculadora {
    private OperacionesImplement operaciones = new OperacionesImplement();
    private MenuImplement menu = new MenuImplement();
    private Scanner input = new Scanner(System.in);

    public void generarMenu() {
        boolean aux;
        do {
            this.menu.deplegarMenu();
            aux = seleccionarOpcion();
        }
        while (aux);
    }

    private boolean seleccionarOpcion() {
        byte opcion = input.nextByte();
        boolean aux;
        switch (opcion) {
            case 1:
                do {
                    System.out.println(realizarSuma());
                    aux=menuOperacion();
                }while (aux);
                return true;
            case 2:
                do {
                    System.out.println(realizarResta());
                    aux=menuOperacion();
                }while (aux);
                return true;
            case 3:
                do {
                    System.out.println(realizarMultiplicacion());
                    aux=menuOperacion();
                }while (aux);
                return true;
            case 4:
                do {
                    System.out.println(realizarDivision());
                    aux=menuOperacion();
                }while (aux);
                return true;
            case 0:
                System.out.println("Finalizando...");
                return false;
            default:
                System.out.println("Hay que aprender a leer");
                return false;
        }
    }

    private String realizarSuma() {
        System.out.println("Ingrese el primer número:");
        double num1 = input.nextDouble();
        System.out.println("Ingrese el segundo número:");
        double num2 = input.nextDouble();
        double resultado = operaciones.sumar(num1, num2);
        return "El resultado de la suma es: " + resultado;
    }

    private String realizarResta() {
        System.out.println("Ingrese el primer número:");
        double num1 = input.nextDouble();
        System.out.println("Ingrese el segundo número:");
        double num2 = input.nextDouble();
        double resultado = operaciones.restar(num1, num2);
        return "El resultado de la resta es: " + resultado;
    }

    private String realizarMultiplicacion() {
        System.out.println("Ingrese el primer número (Multiplicando):");
        double num1 = input.nextDouble();
        System.out.println("Ingrese el segundo número (Multilpicador):");
        double num2 = input.nextDouble();
        double resultado = operaciones.multiplicar(num1, num2);
        return "El resultado de la multiplicación es: " + resultado;
    }

    private String realizarDivision() {
        System.out.println("Ingrese el primer número (Dividendo):");
        double num1 = input.nextDouble();
        System.out.println("Ingrese el segundo número (Divisor):");
        double num2 = input.nextDouble();
        if (num2==0){
            return "La división por 0 no está permitida";
        }
        double resultado = operaciones.dividir(num1, num2);
        return "El resultado de la división es: " + resultado;
    }

    private boolean menuOperacion(){
        System.out.println("Para volver al menú ingrese 1 y para realizar la misma operación ingrese cualquier otro número");
        byte opcion = input.nextByte();
        if (opcion == 1) {
            return false;
        }
        return true;
    }
}
