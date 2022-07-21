
package pe.unjfsc.almacen.java11.entity;

public class CECargoEmpleado {
    
    private int idCargo;
    private String nombCargo;

    public CECargoEmpleado() {
    }

    public CECargoEmpleado(int idCargo, String nombCargo) {
        this.idCargo = idCargo;
        this.nombCargo = nombCargo;
    }

    public String getNombCargo() {
        return nombCargo;
    }

    public void setNombCargo(String nombCargo) {
        this.nombCargo = nombCargo;
    }

    public int getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(int idCargo) {
        this.idCargo = idCargo;
    }

    @Override
    public String toString() {
        return "CECargoEmpleado{" + "idCargo=" + idCargo + ", nombCargo=" + nombCargo + '}';
    }
    
    
    
}
