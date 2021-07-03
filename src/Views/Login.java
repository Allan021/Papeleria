
package Views;

import Model.Administrador;
import Views.DashBoard;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

       ArrayList<Administrador>usuarios;
       
    public Login() {
       usuarios = Administrador.obtenerUsuariosdb("administradores");//crear un array de usuarios
        
        initComponents();
        setLocationRelativeTo(null);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Container = new javax.swing.JPanel();
        Content = new javax.swing.JPanel();
        UserInputContent = new javax.swing.JPanel();
        UserInput = new javax.swing.JTextField();
        UserIconField = new javax.swing.JLabel();
        UserPasswordConent = new javax.swing.JPanel();
        UserPassword = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        Login = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        welcome = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        show = new javax.swing.JCheckBox();
        Title = new javax.swing.JLabel();
        exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Container.setBackground(new java.awt.Color(51, 51, 51));
        Container.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240), 3));
        Container.setForeground(new java.awt.Color(51, 51, 255));
        Container.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                ContainerMouseDragged(evt);
            }
        });
        Container.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ContainerMousePressed(evt);
            }
        });

        Content.setBackground(new java.awt.Color(255, 212, 1));

        UserInputContent.setBackground(new java.awt.Color(255, 255, 255));

        UserInput.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        UserInput.setBorder(null);
        UserInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserInputActionPerformed(evt);
            }
        });
        UserInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                UserInputKeyPressed(evt);
            }
        });

        UserIconField.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Login/user1.png"))); // NOI18N

        javax.swing.GroupLayout UserInputContentLayout = new javax.swing.GroupLayout(UserInputContent);
        UserInputContent.setLayout(UserInputContentLayout);
        UserInputContentLayout.setHorizontalGroup(
            UserInputContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UserInputContentLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(UserIconField, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(UserInput, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        UserInputContentLayout.setVerticalGroup(
            UserInputContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(UserInput)
            .addComponent(UserIconField, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        UserPasswordConent.setBackground(new java.awt.Color(255, 255, 255));

        UserPassword.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        UserPassword.setBorder(null);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Login/pass.jpg"))); // NOI18N

        javax.swing.GroupLayout UserPasswordConentLayout = new javax.swing.GroupLayout(UserPasswordConent);
        UserPasswordConent.setLayout(UserPasswordConentLayout);
        UserPasswordConentLayout.setHorizontalGroup(
            UserPasswordConentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UserPasswordConentLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(UserPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        UserPasswordConentLayout.setVerticalGroup(
            UserPasswordConentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
            .addComponent(UserPassword)
        );

        Login.setBackground(new java.awt.Color(16, 131, 213));
        Login.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        Login.setForeground(new java.awt.Color(255, 255, 255));
        Login.setText("Acceder");
        Login.setBorder(null);
        Login.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                LoginMouseMoved(evt);
            }
        });
        Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LoginMouseExited(evt);
            }
        });
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });

        Reset.setBackground(new java.awt.Color(255, 51, 0));
        Reset.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        Reset.setForeground(new java.awt.Color(255, 255, 255));
        Reset.setText("Resetear");
        Reset.setBorder(null);
        Reset.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                ResetMouseMoved(evt);
            }
        });
        Reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ResetMouseExited(evt);
            }
        });
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        welcome.setFont(new java.awt.Font("Open Sans", 1, 24)); // NOI18N
        welcome.setForeground(new java.awt.Color(255, 255, 255));
        welcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel2.setBackground(new java.awt.Color(30, 30, 30));
        jLabel2.setFont(new java.awt.Font("Open Sans", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(30, 30, 30));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Papeleria Mexicana");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Dashboard/7790539cf955f5a72fecad4fbea61be3 - logo-s-logo-branding.jpg"))); // NOI18N

        show.setBackground(new java.awt.Color(255, 212, 1));
        show.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        show.setForeground(new java.awt.Color(30, 30, 30));
        show.setText("Show Password");
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ContentLayout = new javax.swing.GroupLayout(Content);
        Content.setLayout(ContentLayout);
        ContentLayout.setHorizontalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContentLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113))
            .addGroup(ContentLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addGap(40, 40, 40)
                .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContentLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(UserPasswordConent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(UserInputContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(show, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ContentLayout.setVerticalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(20, 20, 20)
                .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContentLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(37, 37, 37))
                    .addGroup(ContentLayout.createSequentialGroup()
                        .addComponent(UserInputContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(UserPasswordConent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                        .addComponent(show)
                        .addGap(9, 9, 9)
                        .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)))
                .addComponent(welcome))
        );

        Title.setFont(new java.awt.Font("Open Sans Extrabold", 1, 36)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("           Administración");

        exit.setBackground(new java.awt.Color(255, 51, 0));
        exit.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setText("X");
        exit.setBorder(null);
        exit.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                exitMouseMoved(evt);
            }
        });
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitMouseExited(evt);
            }
        });
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ContainerLayout = new javax.swing.GroupLayout(Container);
        Container.setLayout(ContainerLayout);
        ContainerLayout.setHorizontalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContainerLayout.createSequentialGroup()
                .addComponent(Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        ContainerLayout.setVerticalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        getContentPane().add(Container, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UserInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserInputActionPerformed

    }//GEN-LAST:event_UserInputActionPerformed

    private void UserInputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UserInputKeyPressed
        if (evt.getKeyCode() == 13) {
            UserInput.requestFocus();
        }
    }//GEN-LAST:event_UserInputKeyPressed

    private void LoginMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginMouseMoved
        darHover(Login, new Color(12, 102, 166));
    }//GEN-LAST:event_LoginMouseMoved

    private void LoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginMouseExited
        quitarHover(Login, new Color(16,131,213));
    }//GEN-LAST:event_LoginMouseExited

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        String username = UserInput.getText();
        char[] password = UserPassword.getPassword();
        String passwo = "";

        for (char letra : password) {
            passwo += letra;
        }
        /*
        Codigos de Error
        Campos Vacios: 0
        Campo Uusuario Vacio: 1
        Campo Contraseña Vacio: 2
        Todo Nice: 4
        */
        int respuestaVacio = validarVacio(username, passwo);

        switch (respuestaVacio) {
            case 0:
            mensajito(UserInput, "Rellene el campo Usuario", "Complete el campo", 0, imagenNice("/Images/Messages/error.png", 40, 40));
            mensajito(UserPassword, "Rellene el campo Contraseña", "Complete el campo", 0, imagenNice("/Images/Messages/error.png", 40, 40));
            return;

            case 1:
            mensajito(UserInput, "Rellene el campo Usario", "No somos brujos", 0, imagenNice("/Images/Messages/error.png", 40, 40));
            return;
            case 2:
            mensajito(UserPassword, "Rellene el campo Contraseña", "No somos brujos", 0, imagenNice("/Images/Messages/error.png", 40, 40));
            return;

            case 4://si no hay error me salgo
            break;

        }

        /*
        Codigos de Error
        No existe el usuario: 404
        Constraseña incorrecta : 500
        Todo Nice: 200
        */
       int response= validarUsuarios(usuarios,username,passwo);
        
       switch(response){
           case 404:
                mensajito(UserInput, "No encontramos el usuario "+username+" en la lista de ususarios", "No existe este usuario", 0, imagenNice("/Images/Messages/error.png", 40, 40));
                   return;
               case 500:
                mensajito(UserPassword, "Contraseña incorrecta", "No coincide la contraseña ingresada", 0, imagenNice("/Images/Messages/error.png", 40, 40));
                   return;
               case 200:
                    mensajito(null, "Datos confrimador correctamente", "Usuario Encontrado!!", 3, imagenNice("/Images/Messages/nice.png", 40, 40));

                mensajito(null, "Bienvenido de nuevo " + username, "Es un gusto tenerlo de nuevo", 3, imagenNice("/Images/Messages/soldado.png", 40, 40));
              
                int indice=obtenerUsuarioValido(usuarios,username);
                Administrador userValid=usuarios.get(indice);//obteniendo el usuario correcto
                
                this.dispose();
                DashBoard dashboard = new DashBoard(userValid);
                dashboard.setVisible(true);

                
       }

       
    }//GEN-LAST:event_LoginActionPerformed

    
    
     private int validarUsuarios(ArrayList<Administrador> usuarios, String username, String passwo) {

       if(validarExistencia(usuarios, username))
       {
          
           if(validarCoincidencia(usuarios, username, passwo)){
               return 200;
           }
           else{
               return 500;
           }
           
       } else{         
           return 404;
       }
       
       
     }
    int x,y;
    
     private boolean validarExistencia(ArrayList<Administrador> usuarios, String username){
          for (Administrador usuario : usuarios) {
             if(username.equals(usuario.getUsername()) )
                 return true;
          }
     return false;
     }
     
       private boolean validarCoincidencia(ArrayList<Administrador> usuarios, String username, String passwo){
          for (Administrador usuario : usuarios) {
             if(username.equals(usuario.getUsername())&&passwo.equals(usuario.getPassword()) )
                 return true;
          }
     return false;
     }

    
    private void ResetMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResetMouseMoved
        Reset.setBackground(new Color(200, 57, 43));
        Reset.setForeground(new Color(240, 240, 240));
    }//GEN-LAST:event_ResetMouseMoved

    private void ResetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResetMouseExited
        Reset.setBackground(new Color(255, 51, 0));
        Reset.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_ResetMouseExited

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        resetear();
    }//GEN-LAST:event_ResetActionPerformed

    private void exitMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseMoved
        exit.setBackground(new Color(200, 57, 43));
        exit.setForeground(new Color(240, 240, 240));
    }//GEN-LAST:event_exitMouseMoved

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
        exit.setBackground(new Color(255, 51, 0));
        exit.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_exitMouseExited

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed

        int resp = JOptionPane.showConfirmDialog(null, "Esta seguro que quiere sair de la aplicación ?", "Le estaremos esperando con ancias !!",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, imagenNice("/Images/Messages/triste.png", 40, 40));

        if (resp == 0) {
         
                mensajito(null, "Que tenga un excelente dia", "Gracias por usar la aplicacion", 0, imagenNice("/Images/Messages/carita.png", 40, 40));
           System.exit(0);

        }

    }//GEN-LAST:event_exitActionPerformed

    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
        if (!show.isSelected()) {
            UserPassword.setEchoChar('•');
        } else if (show.isSelected()) {//si no esta seleccionado le quito lo del passwors
            UserPassword.setEchoChar((char) 0);//esto significa cualquier caracater que exista
        }
    }//GEN-LAST:event_showActionPerformed

    private void ContainerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContainerMousePressed
     x=evt.getX();
     y=evt.getY();
    }//GEN-LAST:event_ContainerMousePressed

    private void ContainerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContainerMouseDragged
        int xx = evt.getXOnScreen();
        int xy=evt.getYOnScreen();
        
        
        setLocation(xx-x, xy-y);
    }//GEN-LAST:event_ContainerMouseDragged

       /*CASTOM FUNCTIONS*/

    private int validarVacio(String user, String passwo) {
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

    private void darHover(JComponent componente, Color color) {
        componente.setBackground(color);
    }

    private void quitarHover(JComponent componente, Color color) {
        componente.setBackground(color);
    }
 private int obtenerUsuarioValido(ArrayList<Administrador> usuarios, String username) {
int i=0;
     for (Administrador usuario : usuarios) {
        if(username.equals(usuario.getUsername()) ){
            return i;
        }
        i++;
               
     }
     return 0;
    }
    private void resetear() {
        UserInput.setText("");
        UserPassword.setText("");
    }

    //estas son las imagenes de los JOptionPane
    public Icon imagenNice(String path, int ancho, int alto) {
        Icon imagen = new ImageIcon(new ImageIcon(getClass().getResource(path)).getImage().
                getScaledInstance(ancho, alto, java.awt.Image.SCALE_SMOOTH));

        return imagen;
    }

     private void mensajito(JComponent object, String text, String title, int i, Icon icono) {
        JOptionPane.showMessageDialog(object, text, title, i, icono);
    }

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Container;
    private javax.swing.JPanel Content;
    private javax.swing.JButton Login;
    private javax.swing.JButton Reset;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel UserIconField;
    private javax.swing.JTextField UserInput;
    private javax.swing.JPanel UserInputContent;
    private javax.swing.JPasswordField UserPassword;
    private javax.swing.JPanel UserPasswordConent;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JCheckBox show;
    private javax.swing.JLabel welcome;
    // End of variables declaration//GEN-END:variables

   

   
}
