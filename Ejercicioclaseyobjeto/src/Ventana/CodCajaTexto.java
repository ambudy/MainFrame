package Ventana;

import javax.swing.*;
import java.awt.*;

//clase principal extends sirve para enlazar el jframe
public class CodCajaTexto extends JFrame{
    //creamos el panel
    public JPanel panel;
    //constructor clase
    public CodCajaTexto(){
        

        setLayout(null);//sirbe para desactiva diseño
        setSize(500, 500);//dar alto y ancho a la ventana
        setTitle("Caja de texto");//dar titulo
        setLocationRelativeTo(null);//centrar la ventana 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//cerrar la ventana junto con el programa
        IniciarMetodo();//agregar metodos al panel

    }
    //poner todos los metodos
    private void IniciarMetodo() {
        CajaTexto();
        AreaTexto();
    }
    //metodo CajaTexto
    private void CajaTexto() {
        JTextField Caja = new JTextField();
        Caja.setBounds(50, 50, 100, 30); //poner posicion en el eje x,y,ancho alto 
        Caja.setText("hola...");//texto inicial
        add(Caja); //agregar caja 
    }



    //area de texto
    private void AreaTexto(){
        JTextArea Area = new JTextArea();
        Area.setBounds(50, 100, 300, 200);
        Area.append("anexa el texto");// ingresa mas texto
        Area.setEditable(true);// sirbe para decir si se edita o no el area
        add(Area);
    }
}