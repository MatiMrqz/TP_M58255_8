package Facturacion;

import Stock.Articulo;

import java.time.LocalDate;
import java.util.HashSet;

public class Factura {
    private static Long n = 0L;
    protected Long id;
    protected Long nroFactura;
    private LocalDate fecha;
    private final HashSet<DetalleFactura> detalles = new HashSet<>();

    public Factura (Long nroFactura, LocalDate fecha) {
        this.id = ++n;
        this.nroFactura = nroFactura;
        this.fecha = fecha;
    }

    public void setDetalle(Articulo articulo, Integer cantidad) {
        DetalleFactura detalle = new DetalleFactura(Long.valueOf(detalles.size()),cantidad,articulo);
        detalles.add(detalle);
    }

    public void calcularTotal(){
        Double total = 0.0;
        for (DetalleFactura detalle : detalles) {
            total += detalle.getSubTotal();
        }
        System.out.println("Total Factura: $" +total);
    }
}
