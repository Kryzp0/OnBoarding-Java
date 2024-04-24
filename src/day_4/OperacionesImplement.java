package day_4;

public class OperacionesImplement implements OperacionesCalculadora {
    @Override
    public double sumar(double num1, double num2) {
        return num1+num2;
    }

    @Override
    public double restar(double num1, double num2) {
        return num1-num2;
    }

    @Override
    public double multiplicar(double num1, double num2) {
        return num1*num2;
    }

    @Override
    public double dividir(double num1, double num2) {
        return num1/num2;
    }


}
