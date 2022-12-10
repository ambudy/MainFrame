package Sobrecargademetodos;
import javax.swing.*;
public class Sobrecarga{
    //atributos de
    String nombre;
    int edad;
    String dni;

    //sobre carga de metodos constructores
    public Sobrecarga(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;

    }

    public Sobrecarga(String dni){
        this.dni = dni;
    }

    //sobre cargo de metodos 
    public void correr(){
       
        JOptionPane.showMessageDialog(null, "soy " +nombre + " y tengo " + edad + " años de edad y estoy corriendo una maraton");
    }

    public void correr(int km, String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
        JOptionPane.showMessageDialog(null, "soy " + nombre + " y tengo " + edad + " años edad y estoy corriendo una maraton y he recorrido " + km + " kilometros");
    }

}