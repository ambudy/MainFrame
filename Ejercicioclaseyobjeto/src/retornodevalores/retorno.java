package retornodevalores;
import javax.swing.*;

public class retorno{
    //metodos para ingresar dos numero
    public int sumar(int numero1, int numero2){
        //metodo para sumar
        int suma=numero1+numero2;
        //retornar suma
        return suma;


    }


    public int restar(int numero1, int numero2){
        int resta=numero1-numero2;
        return resta;

    }
    


    public int multiplicar(int numero1, int numero2){
        int mult=numero1*numero2;
        return mult;
    }


    public int division(int numero1, int numero2){
        int div=numero1/numero2;
        return div;
    }
    
    

    /*primera forma para imprimir
    public void mostrarResultado(int suma, int resta, int mult, int div){
        JOptionPane.showMessageDialog(null, "la suma es " + suma + ", la resta es " + resta + ", la multiplicacion es " + mult + " y la division es " + div);
    }
    */
}