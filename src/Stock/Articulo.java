package Stock;

public class Articulo {
    protected Long id;
    private String denominacion;
    private Double precioVenta;
    private Double precioCompra;
    private Integer stockActual;
    private Integer stockMaximo;
    private UnidadMedida unidadMedida;
    private Categoria pertenecen;

    public Articulo(Long id, String denominacion, Double precioVenta, Double precioCompra, Integer stockActual, Integer stockMaximo, UnidadMedida unidadMedida, Categoria pertenecen) {
        this.id = id;
        this.denominacion = denominacion;
        this.precioVenta = precioVenta;
        this.precioCompra = precioCompra;
        this.stockActual = stockActual;
        if(stockActual > stockMaximo){
            this.stockMaximo = stockActual;
        }else{
            this.stockMaximo = stockMaximo;
        }
        this.unidadMedida = unidadMedida;
        this.pertenecen = pertenecen;
    }

    public Double getPrecioVenta() {
        return precioVenta;
    }
}
