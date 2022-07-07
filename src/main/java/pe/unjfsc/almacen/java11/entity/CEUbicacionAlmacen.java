package pe.unjfsc.almacen.java11.entity;

public class CEUbicacionAlmacen {

    private String idUbicacion;
    private String nombUbic;
    private String idDistrito;

    public CEUbicacionAlmacen() {
    }

    public CEUbicacionAlmacen(String idUbicacion, String nombUbic, String idDistrito) {
        this.idUbicacion = idUbicacion;
        this.nombUbic = nombUbic;
        this.idDistrito = idDistrito;
    }

    public String getIdDistrito() {
        return idDistrito;
    }

    public void setIdDistrito(String idDistrito) {
        this.idDistrito = idDistrito;
    }

    public String getIdUbicacion() {
        return idUbicacion;
    }

    public void setIdUbicacion(String idUbicacion) {
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
