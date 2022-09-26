import javax.swing.*;                           //Añadimos las librerias con "*"
import java.awt.Color;                          //Biblioteca de color


public class swing01{
    public static void main(String [] args){
        JFrame window = new JFrame("Swing");           //Creamos la ventana llamada "window"
        JLabel label = new JLabel("Hola Java Swing");   //Creamos una label (Esta fuera de window)
        JButton button = new JButton("Boton");          //Creamos el boton (Esta fuera de window, y no cuenta con tamaño)
        Color color = new Color(169,169,169);             //Creamos un color con la biblioteca "awt" (No sale xd)


        window.setBackground(color);                        //Le agregamos el color al fondo()
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //TERMINA EL PROGAMA LO CIERRA
        //Antes de eso no termina el programa por mas que le demos al tachesito :c
        
        
        
        button.setBounds(50, 50, 80, 25);   //Le asignamos posicion y tamaño al boton



        window.add(button);                       //Agregamos el boton a la ventana
        window.add(label);                          //Agregamos la Etiqueta a la ventana 
        window.setSize(400, 300);   //Asignamos el tamaño a window
        window.setVisible(true);               //Hicimos visible dicha ventana (Si no, no seria visible xd)
        
        




    
    }
}