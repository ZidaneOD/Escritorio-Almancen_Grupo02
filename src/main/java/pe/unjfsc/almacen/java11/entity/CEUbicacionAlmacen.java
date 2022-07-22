package pe.unjfsc.almacen.java11.entity;

public class CEUbicacionAlmacen {

    private int idUbicacion;
    private String nombUbic;
    private int idDistrito;

    public CEUbicacionAlmacen() {
    }

    public CEUbicacionAlmacen(int idUbicacion, String nombUbic, int idDistrito) {
        this.idUbicacion = idUbicacion;
        this.nombUbic = nombUbic;
        this.idDistrito = idDistrito;
    }

    public int getIdDistrito() {
        return idDistrito;
    }

    public void setIdDistrito(int idDistrito) {
        this.idDistrito = idDistrito;
    }

    public int getIdUbicacion() {
        return idUbicacion;
    }

    public void setIdUbicacion(int idUbicacion) {
        this.idUbicacion = idUbicacion;
    }

    public String getNombUbic() {
        return nombUbic;
    }

    public void setNombUbic(String nombUbic) {
        this.nombUbic = nombUbic;
    }

    @Override
    public String toString() {
        return "CEUbicacionProducto{" + "idUbicacion=" + idUbicacion + ", nombUbic=" + nombUbic + ", idDistrito=" + idDistrito + '}';
    }

}
