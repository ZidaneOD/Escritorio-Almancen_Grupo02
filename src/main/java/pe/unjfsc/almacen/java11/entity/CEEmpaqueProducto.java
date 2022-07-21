package pe.unjfsc.almacen.java11.entity;

public class CEEmpaqueProducto {

    private int idEmpaque;
    private String nombEmpa;

    public CEEmpaqueProducto() {
    }

    public CEEmpaqueProducto(int idEmpaque, String nombEmpa) {
        this.idEmpaque = idEmpaque;
        this.nombEmpa = nombEmpa;
    }

    public int getIdEmpaque() {
        return idEmpaque;
    }

    public void setIdEmpaque(int idEmpaque) {
        this.idEmpaque = idEmpaque;
    }

    public String getNombEmpa() {
        return nombEmpa;
    }

    public void setNombEmpa(String nombEmpa) {
        this.nombEmpa = nombEmpa;
    }

    @Override
    public String toString() {
        return "CEEmpaqueProducto{" + "idEmpaque=" + idEmpaque + ", nombEmpa=" + nombEmpa + '}';
    }

}
