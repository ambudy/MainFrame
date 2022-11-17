package paquete;

import javax.swing.*;

public class Coche {
    // atributos
    String color;
    String marca;
    int km;

    //metodo main
    public static void main (String[] args) {
        //objetos 
        Coche coche1 = new Coche();

        //asignar valor al objeto coche1 por medio de los atributos 
        coche1.color = "negro";
        coche1.marca = "chebrolet";
        coche1.km = 0;

        //imprimir datos por consola
        System.out.println("el color del coche es " + coche1.color + " de marca " + coche1.marca + " kilometros recorrido " + coche1.km + "km");

        Coche coche2 = new Coche();

        coche2.color = "blanco";
        coche2.marca = "ferrary";
        coche2.km = 20;

        //imprimir los datos en una ventana emergente
        JOptionPane.showMessageDialog(null, "el coche de marca " + coche2.marca + " es de color " + coche2.color + " y ha recorrido " + coche2.km + "km");


    }
}
