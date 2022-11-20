package Operaciones;

import javax.swing.*;

public class Operacion{
    //atributos operaciones
    int numero1;
    int numero2;
    int suma;
    int restado;
    int multiplicacion;
    int division;

    //metodos operaciones

    //metodo para pedir numeros oper
    public void leerNumeros(){
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("ingrese otro numero"));
    }
    // metodo para sumar
    public void sumar(){
        suma = numero1+numero2;
    }
    //metodo para resta
    public void restar(){
        restado = numero1-numero2;
    }
    //metodo para multiplicar
    public void multiplicar(){
        multiplicacion = numero1*numero2;
    }
    //metodo para dividir
    public void div(){
        division = numero1/numero2;
    }
    //metodo para resultado
    public void resultado(){
    JOptionPane.showMessageDialog(null, "la suma es " + suma + ", la division es " + division + " , la multiplicacion es " + multiplicacion + ", la resta es " + restado);
}
}