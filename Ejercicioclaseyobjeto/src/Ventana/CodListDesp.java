package Ventana;

import javax.swing.*;
import java.awt.*;

//clase principal extends sirbe para para enlazar jframe

public class CodListDesp extends JFrame{
    //creamos el panel
    public JPanel panel;
    //constructor de la clase
    public CodListDesp(){
        setTitle("lista desplegable");
        setLayout(null); //desactivar diseño predeterminada
        setSize(500, 500);//poner ancho y alto a la ventana
        setLocationRelativeTo(null);//centrar la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//cerrar la ventana junto con el programa
        agregarMetodos();
    }

    private void agregarMetodos(){
    menuDesplegable();
    }

    private void menuDesplegable(){
    // constructor de arreglo de objetos
    String [] estadocivil = {"casado","viudo","soltero", "escoja una"};
    //crear Jcombobox
    JComboBox listaDesplegable = new JComboBox(estadocivil);
    listaDesplegable.setBounds(20, 20, 100, 30);
    listaDesplegable.addItem("uniolibre");//anexar un objeto nuevo
    listaDesplegable.setSelectedItem("escoja una");//seleccionar el primer objeto a salir
    add(listaDesplegable);

    }


}