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
    /**
     * 
     */
    private void iniciarPanel() {
        JPanel panel = new JPanel(); // creacion del panel
        //panel.setBackground(Color.BLUE); //poniendo color de fondo al panel
        panel.setLayout(null);//desactivando el diseño por defecto del panel
        this.getContentPane().add(panel);//agregar panel sobre la ventana junto


        //creamos etiqueta 
        JLabel etiqueta = new JLabel("fragata", SwingConstants.CENTER); //creamos la etiqueta dentro de los parentecis anexo el texto entre comillas doble y establecer su alineacion horizontal
        //etiqueta.setText("hola"); //establecemos texto de la etiqueta dentro
        //etiqueta.setHorizontalAlignment(SwingConstants.CENTER); establecer la alineacion horizontal del texto
        etiqueta.setBounds(85, 10, 300, 80); // poner ancho y alto a la etiqueta 
        etiqueta.setForeground(Color.BLUE); //poner color al texto de la etiqueta 
        etiqueta.setOpaque(true); //desactivar los valores predeterminados de la etiqueta
        etiqueta.setBackground(Color.yellow); //ponerle color de fondo a la etiqueta
        etiqueta.setFont(new Font("Arial", Font.BOLD, 20)); // establecemos la clase de letra el tipo y el tamano, la clase de letra tambien puede ser 0 normal 1 negrita 2 cursiva 3 negrita cursiva
        panel.add(etiqueta); // agregamos la etiqueta al panel


        //etiquetas de imagen
        //primera forma
        /**JLabel etiqueta2 = new JLabel (new ImageIcon("fragata.jpg"));
        etiqueta2.setBounds(10, 80, 500, 500);
        panel.add(etiqueta2); 
        */

        //etiqueta de imagen
        //segnda forma cambiar tamaño a la imagen
        ImageIcon imagen = new ImageIcon("fragata.jpg");
        JLabel etiqueta2 = new JLabel();
        etiqueta2.setBounds(10, 80, 458, 458);
        //etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(458, 458, Image.SCALE_SMOOTH))); //CAMBIAR DE TAMAÑO 
        etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiqueta2.getWidth(), etiqueta2.getHeight(), Image.SCALE_SMOOTH))); //CAMBIAR TAMAÑO TANTO A LA ETIQUETA COMO A LA IMAGEN AL INSTANTE
        panel.add(etiqueta2);
        
        
        //etiqueta de imagen
        //tercera forma
        /**JLabel etiqueta2 = new JLabel();
        etiqueta2.setIcon(new ImageIcon("fragata.jpg"));
        etiqueta2.setBounds(10, 80, 458, 458);
        panel.add(etiqueta2);
        */

    }
    
}