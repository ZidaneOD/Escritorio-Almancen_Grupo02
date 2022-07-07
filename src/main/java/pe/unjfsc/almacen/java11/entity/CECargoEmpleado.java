
package pe.unjfsc.almacen.java11.entity;

public class CECargoEmpleado {
    
    private String idCargo;
    private String nombCargo;

    public CECargoEmpleado() {
    }

    public CECargoEmpleado(String idCargo, String nombCargo) {
        this.idCargo = idCargo;
        this.nombCargo = nombCargo;
    }

    public String getNombCargo() {
        return nombCargo;
    }

    public void setNombCargo(String nombCargo) {
        this.nombCargo = nombCargo;
    }

    public String getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(String idCargo) {
        this.idCargo = idCargo;
    }

    @Override
    public String toString() {
        return "CECargoEmpleado{" + "idCargo=" + idCargo + ", nombCargo=" + nombCargo + '}';
    }
    
    
    
}
