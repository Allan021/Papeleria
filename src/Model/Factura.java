package Model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Time;
import java.util.Vector;

public class Factura {

    private int id;
    private int cantidad;
    private double descuento;
    private double total;
    private double subtotal;
    private Date fechaIngreso;
    private Time horaIngresada;

    public Factura() {
    }

    public Factura(int id, int cantidad, double descuento, double total, double subtotal, Date fechaIngreso, Time horaIngresada) {
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

    public Factura(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    
    public static Vector<Factura> mostrarFacturas() {

        PreparedStatement consulta = null;
        ResultSet resultados = null;
        Vector<Factura> facturas = new Vector<Factura>();
        try {
            Conexion con = new Conexion();
            Connection conectar = con.getConnection("papeleria");

            consulta = conectar.prepareStatement("select DISTINCT fechaIngresada from factura ");
            resultados = consulta.executeQuery();

            while (resultados.next()) {
                Factura factu;
               
                Date fecha = (resultados.getDate("fechaIngresada"));
              

                factu = new Factura(fecha);
                facturas.add(factu);
            }

        } catch (Exception exception) {
            System.err.println("Error " + exception);
        }

        return facturas;
    }

  
    @Override
    public String toString() {
        return String.valueOf(fechaIngreso);
    }

}
