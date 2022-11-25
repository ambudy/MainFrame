package parametrosargumentos;
import javax.swing.*;
public class Operadores{
    //atributos
    int suma, resta, multiplicacion, divicion;


    //metodos

    //metodo para sumar
    public void sumar(int numero1, int numero2){
    suma = numero1+numero2;
    }


    //metodo para restar
    public void restar(int numero1, int numero2){
    resta = numero1-numero2;
    }


    //metodo para multiplicar
    public void multiplicar(int numero1, int numero2){
    multiplicacion  = numero1*numero2;
    }

    //metodo para dividir
    public void dividir(int numero1, int numero2){
    divicion = numero1/numero2;
    }

    //metodo para mostrar resultado
    public void mostrarresultado(){
        JOptionPane.showMessageDialog(null, "la suma de los numertos ingresado es " + suma + " y la resta es " + resta + " y la multiplicacion es " + multiplicacion + " y la divicion es " + divicion);
    }
}