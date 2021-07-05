
package Model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Time;
import java.util.Vector;


public class FacturaHora {
      private int id;
    private int cantidad;
    private double descuento;
    private double total;
    private double subtotal;
    private Date fechaIngreso;
    private Time horaIngresada;

    public FacturaHora() {
    }

    public FacturaHora(int id, int cantidad, double descuento, double total, double subtotal, Date fechaIngreso, Time horaIngresada) {
        this.id = id;
        this.cantidad = cantidad;
        this.descuento = descuento;
        this.total = total;
        this.subtotal = subtotal;
        this.fechaIngreso = fechaIngreso;
        this.horaIngresada = horaIngresada;
    }

    public Time getHoraIngresada() {
        return horaIngresada;
    }

    public void setHoraIngresada(Time horaIngresada) {
        this.horaIngresada = horaIngresada;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public static Vector<FacturaHora> mostrarFacturas(Date fechas) {

        PreparedStatement consulta = null;
        ResultSet resultados = null;
        Vector<FacturaHora> facturas = new Vector<FacturaHora>();
        try {
            Conexion con = new Conexion();
            Connection conectar = con.getConnection("papeleria");

            consulta = conectar.prepareStatement("select * from factura where fechaIngresada = ?");
            consulta.setDate(1, fechas);
            resultados = consulta.executeQuery();

            while (resultados.next()) {
                FacturaHora factu;
                int code = (resultados.getInt("idFactura"));
                double subTotal = (resultados.getDouble("subtotal"));
                double total = (resultados.getDouble("total"));
                double descuento = (resultados.getDouble("descuento"));
                int cantidad = (resultados.getInt("cantidadProductos"));
                Date fecha = (resultados.getDate("fechaIngresada"));
                Time hora = (resultados.getTime("horaIngresada"));

                factu = new FacturaHora(code, cantidad, descuento, total, subTotal, fecha, hora);
                facturas.add(factu);
            }

        } catch (Exception exception) {
            System.err.println("Error " + exception);
        }

        return facturas;
    }

  
    @Override
    public String toString() {
        return String.valueOf(horaIngresada);
    }

}
