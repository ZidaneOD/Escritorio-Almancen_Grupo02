
package pe.unjfsc.almacen.java11.entity;

public class CEEstadoTransaccion {
    private String idEstado;
    private String nombEstado;

    public CEEstadoTransaccion() {
    }

    public CEEstadoTransaccion(String idEstado, String nombEstado) {
        this.idEstado = idEstado;
        this.nombEstado = nombEstado;
    }

    public String getNombEstado() {
        return nombEstado;
    }

    public void setNombEstado(String nombEstado) {
        this.nombEstado = nombEstado;
    }

    public String getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(String idEstado) {
        this.idEstado = idEstado;
    }

    @Override
    public String toString() {
        return "CEEstadoTransaccion{" + "idEstado=" + idEstado + ", nombEstado=" + nombEstado + '}';
    }
    
    
    
}
