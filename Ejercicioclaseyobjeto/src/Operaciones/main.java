package Operaciones;
import javax.swing.*;
public class main {
    public static void main (String[] args ){
        Operacion op = new Operacion();
        op.leerNumeros();
        op.multiplicar();
        op.sumar();
        op.restar();
        op.div();

        op.resultado();


    }
}
