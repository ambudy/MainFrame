package parametrosargumentos;

import javax.swing.*;

public class main {
    public static void main (String [] args){
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero"));

        int n2 = Integer.parseInt(JOptionPane.showInputDialog("ingrese otro numero"));

        Operadores op = new Operadores();

        op.sumar(n1, n2);
        op.restar(n1, n2);
        op.multiplicar(n1, n2);
        op.dividir(n1, n2);
        op.mostrarresultado();

    }
    
}