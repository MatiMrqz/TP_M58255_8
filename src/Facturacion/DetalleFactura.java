package Facturacion;

import Stock.Articulo;

public class DetalleFactura {
    private Long id;
    private Integer cantidad;
    private Double subTotal;
    private Articulo articulo;

    public DetalleFactura(Long id, Integer cantidad, Articulo articulo) {
        this.id = id;
        this.cantidad = cantidad;
        this.articulo = articulo;
        this.subTotal = cantidad * articulo.getPrecioVenta();
    }

    public Double getSubTotal() {
        return subTotal;
    }
}
