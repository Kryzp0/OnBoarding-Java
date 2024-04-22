package day_2;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args){
        Persona Chris = new Persona("Chris","Vega","20.091.490-2",25,1.70,false,new String[]{"Luna","Angelo","Agua","Ginger"});
        Persona Giselle = new Persona("Giselle","Aravena","21.356.668-7",20,1.53,false,new String[]{"Calcifer"});
        System.out.println(Chris.presentacion());
        System.out.println(Giselle.presentacion());
    }
}
