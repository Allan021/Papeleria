package Helpers;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;
import java.awt.Toolkit;

//una clase aparte para validar los numeros y poder reutilizar esta clase a lo largo de la apliccacion
public class ValidarInputs {

    public ValidarInputs() {

    }

    public static void ingresoSoloNumeros(JTextField j) {
        j.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();//caracter ingresado

                if (!Character.isDigit(c)) {
                    e.consume();
                }

                if (c == '.' && j.getText().contains(".")) {
                    e.consume();
                }

                if (c == '0' && j.getText().startsWith("0")) {
                    e.consume();
                }

                if (j.getText().length() == 5) {//para que no se pase mas de 5 caracteres
                    e.consume();
                    Toolkit.getDefaultToolkit().beep(); //:V
                    j.setToolTipText("Cantidad muy grande");
                }

                if (j.getText().equals("") && c != '0') {
                    j.setText("0");
                } else if (j.getText().startsWith("0")) {
                    j.setText(null);
                }

            }

        });
    }

    public static void identidad(JTextField j) {
        j.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();//caracter ingresado

                if (!Character.isDigit(c)) {
                    e.consume();
                }

                if (j.getText().length() >= 13) {//para que no se pase mas de 5 caracteres
                    e.consume();
                    Toolkit.getDefaultToolkit().beep(); //
                    j.setToolTipText("Numero de identidad solo tiene 13 numeros");
                }

            }

        });
    }

    public static void soloLetras(JTextField j) {
        j.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();//caracter ingresado

                if (Character.isDigit(c)) {
                    e.consume();
                    Toolkit.getDefaultToolkit().beep(); //
                    j.setToolTipText("El nombre no debe tener numeros");
                }

            }

        });
    }

}
