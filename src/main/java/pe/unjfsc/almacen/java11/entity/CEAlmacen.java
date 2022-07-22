package pe.unjfsc.almacen.java11.entity;

public class CEAlmacen {

    private int idAlmacen;
    private String nombAlm;
    private int idUbicacion;

    public CEAlmacen() {
    }

    public CEAlmacen(int idAlmacen, String nombAlm, int idUbicacion) {
        this.idAlmacen = idAlmacen;
        this.nombAlm = nombAlm;
        this.idUbicacion = idUbicacion;
    }

    public int getIdAlmacen() {
        return idAlmacen;
    }

    public void setIdAlmacen(int idAlmacen) {
        this.idAlmacen = idAlmacen;
    }

    public String getNombAlm() {
        return nombAlm;
    }

    public void setNombAlm(String nombAlm) {
        this.nombAlm = nombAlm;
    }

    public int getIdUbicacion() {
        return idUbicacion;
    }

    public void setIdUbicacion(int idUbicacion) {
        this.idUbicacion = idUbicacion;
    }

    @Override
    public String toString() {
        return "CEAlmacen{" + "idAlmacen=" + idAlmacen + ", nombAlm=" + nombAlm + ", idUbicacion=" + idUbicacion + '}';
    }

}
