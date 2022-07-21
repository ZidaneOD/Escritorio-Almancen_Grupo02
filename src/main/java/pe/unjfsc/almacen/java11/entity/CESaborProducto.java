package pe.unjfsc.almacen.java11.entity;

public class CESaborProducto {

    private int idSabor;
    private String nombSabor;

    public CESaborProducto() {
    }

    public CESaborProducto(int idSabor, String nombSabor) {
        this.idSabor = idSabor;
        this.nombSabor = nombSabor;
    }

    public String getNombSabor() {
        return nombSabor;
    }

    public void setNombSabor(String nombSabor) {
        this.nombSabor = nombSabor;
    }

    public int getIdSabor() {
        return idSabor;
    }

    public void setIdSabor(int idSabor) {
        this.idSabor = idSabor;
    }

    @Override
    public String toString() {
        return "CESaborProducto{" + "idSabor=" + idSabor + ", nombSabor=" + nombSabor + '}';
    }

}
