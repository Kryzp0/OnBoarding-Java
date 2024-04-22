package day_3;

public class Main {
    public static void main(String[] args){
        Mascota Angelo = new Mascota("Angelo",TipoDeMascota.GATO, 5);
        Mascota Calcifer = new Mascota("Calcifer",TipoDeMascota.GATO,4);
        Mascota Luna = new Mascota("Luna",TipoDeMascota.PERRO,1);
        Mascota Agua = new Mascota("Agua",TipoDeMascota.GATO,4);
        Mascota Ginger = new Mascota("Ginger",TipoDeMascota.GATO,5);
        Persona Chris = new Persona("Chris","Vega","20.091.490-2",25,1.70,false);
        Persona Giselle = new Persona("Giselle","Aravena","21.356.668-7",20,1.53,false);
        Giselle.añadirMascota(Calcifer);
        Chris.añadirMascota(Angelo);
        Chris.añadirMascota(Luna);
        Chris.añadirMascota(Agua);
        Chris.añadirMascota(Ginger);
        System.out.println(Chris.presentacion());
        System.out.println(Giselle.presentacion());
    }
}
