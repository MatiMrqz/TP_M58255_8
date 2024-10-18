import Facturacion.Clientes;
import Facturacion.Factura;
import Stock.Articulo;
import Stock.Categoria;
import Stock.UnidadMedida;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Crear Categorias Pizzas, Sandwich
        Categoria pizza = new Categoria(1L,"Pizzas");
        Categoria sandwich = new Categoria(2L,"Sandwich");
        // Crear subcategoría Pizas Gripicales que dependa de su categoría padre Pizzas
        Categoria pizzasTropicales = new Categoria(3L,"Pizzas Tropicales");
        pizzasTropicales.setCatPadre(pizza);
        // Crear subcategoría Lomos Tropicales que dependa de su categoría Padre Sandwich
        Categoria lomosTropicales = new Categoria(4L,"Lomos Tropicales");
        lomosTropicales.setCatPadre(sandwich);
        // Crear unidad de medida 250gr, 500gr, entera, mitad
        UnidadMedida u250gr = new UnidadMedida(1L,"250 gramos");
        UnidadMedida u500gr = new UnidadMedida(2L,"500 gramos");
        UnidadMedida uEntera = new UnidadMedida(3L,"Entera");
        UnidadMedida uMitad = new UnidadMedida(4L,"Mitad");
        // Crear articulos
        // Pizza Hawaiana
        Articulo pHawaiana = new Articulo(11111111L,"Pizza Hawaiana",111.00,100.00,10,15,uEntera,pizzasTropicales);
        // Lomo Completo
        Articulo lCompleto = new Articulo(22222222L,"Lomo Completo", 555.00,300.0,5,8,u250gr,lomosTropicales);
        // Cliente 1
        Clientes cliente1 = new Clientes("Lucas","Gonzales");

        //Simulacion de compra
        Factura demoCompra = new Factura(12345678L, LocalDate.now());
        //Detalle 1 con 2 Pizzas Hawaianas
        demoCompra.setDetalle(pHawaiana,2);
        //Detalle 2 con 1 Lomo Completo
        demoCompra.setDetalle(lCompleto,1);

        demoCompra.calcularTotal();

    }
}