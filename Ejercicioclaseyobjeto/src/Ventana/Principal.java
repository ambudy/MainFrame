package Ventana;

import javax.swing.*;
//clase principal extends sirve para enlazar el JFrame
public class Principal extends JFrame{
    //constructor de la clase
    public Principal(){
        setSize(500,500); //ancho y altura de la ventana
        setTitle("pagina principal"); //sirve para poner titulo a la verntana
        //setLocation(100,100); //sirve para poner la posicion inicial de la ventana
        //setBounds(100,200,500,500); //sirve para poner el setSize y el setLocation
        setDefaultCloseOperation(EXIT_ON_CLOSE); //sirve para serar la ventana junto con el programa
        setLocationRelativeTo(null); //poner la ventana en el sentro no importa el tamaño de la pantalla
    }
}