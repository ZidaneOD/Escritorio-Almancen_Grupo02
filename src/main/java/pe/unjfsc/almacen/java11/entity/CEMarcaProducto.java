
package pe.unjfsc.almacen.java11.entity;

public class CEMarcaProducto {
    
    private int idMarca;
    private String nombMarca;

    public CEMarcaProducto() {
    }

    public CEMarcaProducto(int idMarca, String nombMarca) {
        this.idMarca = idMarca;
        this.nombMarca = nombMarca;
    }

    public String getNombMarca() {
        return nombMarca;
    }

    public void setNombMarca(String nombMarca) {
        this.nombMarca = nombMarca;
    }

    public int getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }

    @Override
    public String toString() {
        return "CEMarca{" + "idMarca=" + idMarca + ", nombMarca=" + nombMarca + '}';
    }
    
    
    
}
