package day_1;

import java.util.Objects;
import java.util.Scanner;

public class igualdad {
    public static void compararStrings(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese una texto:");
        String palabra1 = input.nextLine();
        System.out.println("Ingrese el segundo texto a comparar:");
        String palabra2 = input.nextLine();
        if (Objects.equals(palabra1, palabra2)){
            System.out.println("Son iguales");
        }else {
            System.out.println("No son iguales");
        }
    }
}
