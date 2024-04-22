package day_3;

public class Mascota {
    private String nombre;
    private TipoDeMascota tipo;
    private int edad;
    private Persona dueño;

    public Mascota() {
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "nombre='" + nombre + '\'' +
                ", tipo=" + tipo +
                ", edad=" + edad +
                '}';
    }

    public Mascota(String nombre, TipoDeMascota tipo, int edad) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoDeMascota getTipo() {
        return tipo;
    }

    public void setTipo(TipoDeMascota tipo) {
        this.tipo = tipo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Persona getDueño() {
        return dueño;
    }

    public void setDueño(Persona dueño) {
        this.dueño = dueño;
    }
}
