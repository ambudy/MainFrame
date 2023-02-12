package Ventana;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//creamos la clase principal extends sirbe para llamar la ventana del JFrame
public class CodEvento extends JFrame{
    //creamos el panel
    private JPanel panel;
    private JLabel saludo;
    private JTextField contText1;
    private JButton btnMostrar;

    //creamos el constructor de la clase principal
    public CodEvento(){
        //aqui escribimos los distintos cambios de la ventana del JFrame 
        setSize(500, 500);//ancho y largo a la ventana del JFrame
        setTitle("EVENTO");//dar titulo a la ventana del JFrame
        setLocationRelativeTo(null); // centrar la ventana del JFrame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//cerrar la ventana junto con el programa
        //enlazar todos los metodos con la vetana
        agregarMetodos();
        
    }

    
    //creamos el metodo a en lazar
    private void agregarMetodos(){
        //distintos metodos a en lazar
        colocarPaneles();
        textNombreApellido();
        contTexto1();
        btnMostrarDatos();
    }

    //creamos el metodo para paneles
    private void colocarPaneles(){
        //codigo para paneles 
        panel = new JPanel(); // creacion del panel
        panel.setBackground(Color.BLUE); //poniendo color de fondo al panel
        panel.setLayout(null);//desactivando el diseño por defecto del panel
        this.getContentPane().add(panel);//agregar panel sobre la ventana junto
    }

    private void textNombreApellido(){
        JLabel texto1 = new JLabel("ingrese el nombre y el apellido", SwingConstants.CENTER);
        texto1.setOpaque(true);//desactivar valores predeterminados del texto1
        texto1.setBounds(85, 10, 300, 30);//pomer ancho y altura a las texto1
        texto1.setFont(new Font("Arial", Font.BOLD, 20));
        texto1.setForeground(Color.RED);
        panel.add(texto1);
    }

    private void contTexto1(){
        contText1 = new JTextField();
        contText1.setBounds(85, 50, 300, 30);
        contText1.setFont(new Font("Arial", Font.BOLD, 20));
        contText1.setForeground(Color.BLUE);
        panel.add(contText1);
    }

    private void btnMostrarDatos(){
        btnMostrar = new JButton("Mostrar Datos"); 
        btnMostrar.setOpaque(true);
        btnMostrar.setBounds(85, 90, 250, 30);
        btnMostrar.setFont(new Font("Arial", Font.BOLD, 20));
        panel.add(btnMostrar);

        saludo = new JLabel();
        saludo.setBounds(85, 150, 350, 30);
        saludo.setFont(new Font("Arial", Font.BOLD, 20));
        saludo.setForeground(Color.RED);
        panel.add(saludo);

        ActionListener oyenteDeAccion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //accion que se realiza al dar clic en el boton
                saludo.setText("hola " + contText1.getText());
            }
        };
        btnMostrar.addActionListener(oyenteDeAccion);
    }
}