package day_4;

public class MenuImplement implements MenuCalculadora{

    @Override
    public void deplegarMenu() {
        System.out.println(opcionesMenu());
    }

    private String opcionesMenu() {
        return """
                Calculadora Básica
                Elija una opción:
                1. Sumar
                2. Restar
                3. Multiplicar
                4. Dividir
                0. Finalizar
                """;
    }

}
