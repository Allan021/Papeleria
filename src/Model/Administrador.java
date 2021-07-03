
package Model;

import Model.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Administrador{
    
 private String username;
 private String password;
 private String genero;
 private String estado;

    public Administrador( String username, String password, String genero, String estado) {
     
        this.username = username;
        this.password = password;
        this.genero = genero;
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

   

    public Administrador() {
    }


    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

  
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" + "username=" + username + '}';
    }
 
    public static ArrayList<Administrador> obtenerUsuariosdb(String table){
        PreparedStatement ps;
        ArrayList<Administrador> users = new ArrayList<>();
        try {
            ps=Conexion.getConnection("papeleria").prepareStatement("SELECT * from "+table);
           ResultSet rs= ps.executeQuery();
           //si hay otro elemento entonces creare el nuevo ususairo 
           if(rs.next()){
               
               do {
                    String username=  rs.getString(2);
                   String password=  rs.getString(3);
                   String genero=  rs.getString(4);
                   String estado=  rs.getString(5);
                 
                 Administrador usuario = new Administrador( username, password, genero, estado);
                  users.add(usuario);
               } while (rs.next());
               
               
               
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
          return null;
        }
        return users;
    }
    
 
}
