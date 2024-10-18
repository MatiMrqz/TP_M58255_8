package Stock;

public class Categoria {
    protected Long id;
    private String denominacion;
    private Categoria catPadre;

    public Categoria(Long id, String denominacion) {
        this.id = id;
        this.denominacion = denominacion;
    }

    public void setCatPadre(Categoria catPadre){
        this.catPadre = catPadre;
    }
}


