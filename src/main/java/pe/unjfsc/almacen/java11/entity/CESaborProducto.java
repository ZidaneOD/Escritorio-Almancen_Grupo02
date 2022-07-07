package pe.unjfsc.almacen.java11.entity;

public class CESaborProducto {

    private String idSabor;
    private String nombSabor;

    public CESaborProducto() {
    }

    public CESaborProducto(String idSabor, String nombSabor) {
        this.idSabor = idSabor;
        this.nombSabor = nombSabor;
    }

    public String getNombSabor() {
        return nombSabor;
    }

    public void setNombSabor(String nombSabor) {
        this.nombSabor = nombSabor;
    }

    public String getIdSabor() {
        return idSabor;
    }

    public void setIdSabor(String idSabor) {
        this.idSabor = idSabor;
    }

    @Override
    public String toString() {
        return "CESaborProducto{" + "idSabor=" + idSabor + ", nombSabor=" + nombSabor + '}';
    }

}
