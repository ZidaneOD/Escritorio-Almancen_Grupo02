package pe.unjfsc.almacen.java11.entity;

public class CEAlmacen {

    private String idAlmacen;
    private String nombAlm;
    private String idUbicacion;

    public CEAlmacen() {
    }

    public CEAlmacen(String idAlmacen, String nombAlm, String idUbicacion) {
        this.idAlmacen = idAlmacen;
        this.nombAlm = nombAlm;
        this.idUbicacion = idUbicacion;
    }

    public String getIdAlmacen() {
        return idAlmacen;
    }

    public void setIdAlmacen(String idAlmacen) {
        this.idAlmacen = idAlmacen;
    }

    public String getNombAlm() {
        return nombAlm;
    }

    public void setNombAlm(String nombAlm) {
        this.nombAlm = nombAlm;
    }

    public String getIdUbicacion() {
        return idUbicacion;
    }

    public void setIdUbicacion(String idUbicacion) {
        this.idUbicacion = idUbicacion;
    }

    @Override
    public String toString() {
        return "CEAlmacen{" + "idAlmacen=" + idAlmacen + ", nombAlm=" + nombAlm + ", idUbicacion=" + idUbicacion + '}';
    }

}
