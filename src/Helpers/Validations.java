
package Helpers;

import javax.swing.JTextField;

public class Validations {
    
    public static int validaLoginrVacio(String user, String passwo) {
        //si la longitudd del user esta vacio retorno un 1
        if (user.length() == 0 && passwo.length() == 0) {
            return 0;
        }

        if (user.length() == 0) {
            return 1;
        }

        if (passwo.length() == 0) {
            return 2;
        }

        return 4;//si nada se cumple retorno un 4 y todo salio bien
    }

     public boolean validarInputVacio(JTextField j) {
        if (j.getText().trim().equals("") ||j.getText().trim().equals("0")) {
            return true;
        }

        return false;
    }
}
