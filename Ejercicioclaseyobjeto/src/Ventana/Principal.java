package Ventana;

import javax.swing.*;
import java.awt.*;
//clase principal extends sirve para enlazar el JFrame
public class Principal extends JFrame{
    //constructor de la clase
    public Principal(){
        setSize(500,500); //ancho y altura de la ventana
        setTitle("pagina principal"); //sirve para poner titulo a la verntana
        //setLocation(100,100); //sirve para poner la posicion inicial de la ventana
        //setBounds(100,200,500,500); //sirve para poner el setSize y el setLocation
        setLocationRelativeTo(null); //poner la ventana en el sentro no importa el tamaño de la pantalla
        //setResizable(false); // sirbe para cambiar de tamaño la ventana con el cursor
        // setMinimumSize(new Dimension(200,200)); // sirbe para establecer un espacio minimo 
        this.getContentPane().setBackground(Color.ORANGE);  //poner color de fondo a la ventana
        iniciarPanel(); // llamar al metodo desde el  constructor principal
        setDefaultCloseOperation(EXIT_ON_CLOSE); //sirve para serar la ventana junto con el programa
        
        
    }

    //creando panel
    private void iniciarPanel() {
        JPanel panel = new JPanel(); // creacion del panel
        setSize(500,500);
        panel.setBackground(Color.BLUE); //poniendo color de fondo al panel
        this.getContentPane().add(panel);//agregar panel sobre la ventana junto

    }
    
}