package Metodoconstructor;
import javax.swing.*;
public class constructor {

    //atributos
    String nombre;
    int edad;


    /** Metodoconstructor parametros diferente a los atributos
    public constructor(String _nombre, int _edad){
        nombre = _nombre;
        edad = _edad;
    }
    **/

    // metodo constructor parametros iguales a los atributos 
    public constructor(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    public void mostrardatos(){
        JOptionPane.showMessageDialog( null, "mi nombre es " + nombre + " y tengo " + edad + " años");
    }
}