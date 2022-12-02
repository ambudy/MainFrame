package retornodevalores;
import javax.swing.*;

public class main{
    public static void main(String[] args){
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el otro numero"));

        retorno rt = new retorno();
        /*primera forma para imprimir
        int suma = rt.sumar(n1, n2);
        int resta = rt.restar(n1, n2);
        int mult = rt.multiplicar(n1, n2);
        int div = rt.division(n1, n2);

        rt.mostrarResultado(suma, resta, mult, div);
        */
        


        //segunda forma para imprimir la
        JOptionPane.showMessageDialog(null, "la suma es " + rt.sumar(n1, n2) + " la resta es " + rt.restar(n1, n2) + " la multiplicacion es " + rt.multiplicar(n1, n2) + " y la division es " +  rt.division(n1, n2));
    }
}