package day_2;

import java.util.Arrays;

public class Persona {
    String nombre;
    String apellido;
    String DNI;
    int edad;
    double altura;
    boolean casado;
    String[] mascotas;

    public String presentacion(){
        String mensajeCasado = this.casado ? "Estoy casado/a." : "No estoy casado/a";
        String mensajeMascotas = "";
        if (this.mascotas != null && this.mascotas.length > 0) {
            mensajeMascotas = "Mis mascotas se llaman:\n";
            for (String mascota : this.mascotas) {
                mensajeMascotas += "- " + mascota + "\n";
            }
        } else {
            mensajeMascotas = "No tengo mascotas.";
        }

        return "Presentación de " + this.nombre + ":\n" +
                "¡Hola! Mi nombre es " + this.nombre + " " + this.apellido + ".\n" +
                "Tengo " + this.edad + " años y mido " + this.altura + " metros de altura.\n" +
                mensajeCasado + "\n" +
                "Mi DNI es " + this.DNI + ".\n" +
                mensajeMascotas;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public String[] getMascotas() {
        return mascotas;
    }

    public void setMascotas(String[] mascotas) {
        this.mascotas = mascotas;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", DNI='" + DNI + '\'' +
                ", edad=" + edad +
                ", altura=" + altura +
                ", casado=" + casado +
                ", mascotas=" + Arrays.toString(mascotas) +
                '}';
    }

    public Persona(String nombre, String apellido, String DNI, int edad, double altura, boolean casado, String[] mascotas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.edad = edad;
        this.altura = altura;
        this.casado = casado;
        this.mascotas = mascotas;
    }

    public Persona() {
    }
}
