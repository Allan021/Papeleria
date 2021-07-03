package Helpers;

import java.awt.Color;
import java.awt.event.MouseEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*Ingeniera yo cree estas clases para evitar colocar todo este codigo en la clase princiapl y en los Jdialogs
y JfFrame porque creo que no deben verse muy cargados*/
public class Effects {

    //Reseta los JTextFields
    public static void resetFields(JTextField[] fields,String text){
        
        for (JTextField field : fields) {
            field.setText(text);
        }
    }
    
    public static void mensajito(JComponent object, String text, String title, int i, Icon icono) {
        JOptionPane.showMessageDialog(object, text, title, i, icono);
    }
    
      public static void colorInicial(JComponent componente, Color[] colors) {
                componente.setBackground(colors[0]);
                componente.setForeground(colors[1]);
    }
    
    public static void darHover(JComponent componente, Color[] colors, Color[] colors2) {
        componente.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e); 
                componente.setBackground(colors[0]);
                componente.setForeground(colors[1]);

            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e); 
                componente.setBackground(colors2[0]);
                componente.setForeground(colors2[1]);
            }

        });
    }

}
