
package Model;

//clase productos y de aqui cargaremos los productosa

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

public class Producto {
    private String codigo;
    private String nombre;
    private String marca;
    private double precio;
    private Date fechaIngreso;

    public Producto() {
    }

    public Producto(String codigo, String nombre, String marca, double precio, Date fechaIngreso) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.fechaIngreso = fechaIngreso;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    
    
    public static Vector<Producto> mostrarProducto() {

        PreparedStatement consulta = null;
        ResultSet resultados = null;
        Vector<Producto> productos = new Vector<Producto>();
                Producto productoFake = new Producto();
                  productoFake.setNombre("Seleccione un Producto");
                productos.add(productoFake);
        try {
            Conexion con = new Conexion();
            Connection conectar = con.getConnection("papeleria");

            consulta = conectar.prepareStatement("select * from productos");
            resultados = consulta.executeQuery();

            while (resultados.next()) {
                Producto prod ;//EN CADA ITERACION SE IRA CREANDO UN OBJKETP Y LO INICIALIZAR GRACIAS A LA CONSULTA con el el result y despues solamento uso el metodo toString en el ComboBoxModel
                  String code = (resultados.getString("codigo"));
             String name= (resultados.getString("nombre"));
            String marca= (resultados.getString("marca"));
            double precio= (resultados.getDouble("precio"));
            Date fecha = (resultados.getDate("fecha_ingreso"));
             
        prod = new Producto(code, name, marca, precio, fecha);
        productos.add(prod);//Agregar un producto en cada iteracion
            }

        } catch (Exception exception) {
            System.err.println("Error " + exception);
        }

        return productos;
    }

    @Override
    public String toString() {
        return nombre; //Para llenar la lista
    }

    
}
