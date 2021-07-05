
package Controlador;

//clase por la cual inicia todo

import Views.Login;

public class ClaseLanzadora {
    public static void main(String[] args) {
        Login inicio = new Login();
        inicio.setVisible(true);
    }
}
