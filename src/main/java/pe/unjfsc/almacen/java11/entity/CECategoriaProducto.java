package pe.unjfsc.almacen.java11.entity;

public class CECategoriaProducto {

    private int idCategoria;
    private String nombCate;

    public CECategoriaProducto() {
    }

    public CECategoriaProducto(int idCategoria, String nombCate) {
        this.idCategoria = idCategoria;
        this.nombCate = nombCate;
    }

    public String getNombCate() {
        return nombCate;
    }

    public void setNombCate(String nombCate) {
        this.nombCate = nombCate;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    @Override
    public String toString() {
        return "CECategoria_Producto{" + "idCategoria=" + idCategoria + ", nombCate=" + nombCate + '}';
    }

}
