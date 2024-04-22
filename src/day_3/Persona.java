package day_3;

import java.util.HashSet;
import java.util.Set;

public class Persona {
    private String nombre;
    private String apellido;
    private String DNI;
    private int edad;
    private double altura;
    private boolean casado;
    private Set<Mascota> mascotas = new HashSet<>();

    public String presentacion(){
        String mensajeCasado = this.casado ? "Estoy casado/a." : "No estoy casado/a";
        String mensajeMascotas = "";
        if (!this.mascotas.isEmpty()){
            mensajeMascotas = "Mis mascotas se llaman:\n";
            for (Mascota mascota : mascotas){
                mensajeMascotas += "- " + mascota.getNombre() + " es un " + mascota.getTipo().toString().toLowerCase() + " y tiene " + mascota.getEdad() + " años." + "\n";
            }
        }else {
            mensajeMascotas = "No tengo mascotas.";
        }

        return "Presentación de " + this.nombre + ":\n" +
                "¡Hola! Mi nombre es " + this.nombre + " " + this.apellido + ".\n" +
                "Tengo " + this.edad + " años y mido " + this.altura + " metros de altura.\n" +
                mensajeCasado + "\n" +
                "Mi DNI es " + this.DNI + ".\n" +
                mensajeMascotas;
    }

    public Persona(String nombre, String apellido, String DNI, int edad, double altura, boolean casado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.edad = edad;
        this.altura = altura;
        this.casado = casado;
    }

    public void añadirMascota(Mascota mascota){
        mascota.setDueño(this);
        this.mascotas.add(mascota);
    }

    public Persona() {
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

    public Set<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(Set<Mascota> mascotas) {
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
                ", mascotas=" + mascotas +
                '}';
    }
}
