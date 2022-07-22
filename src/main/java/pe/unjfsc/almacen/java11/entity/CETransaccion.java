
package pe.unjfsc.almacen.java11.entity;

public class CETransaccion {
    
    private int idkardex;
    private int idorigen;
    private int iddest;
    private int idEmpleado;

    public CETransaccion(int idkardex, int idorigen, int iddest, int idEmpleado) {
        this.idkardex = idkardex;
        this.idorigen = idorigen;
        this.iddest = iddest;
        this.idEmpleado = idEmpleado;
    }

    public CETransaccion() {
    }

    public int getIdkardex() {
        return idkardex;
    }

    public void setIdkardex(int idkardex) {
        this.idkardex = idkardex;
    }

    public int getIdorigen() {
        return idorigen;
    }

    public void setIdorigen(int idorigen) {
        this.idorigen = idorigen;
    }

    public int getIddest() {
        return iddest;
    }

    public void setIddest(int iddest) {
        this.iddest = iddest;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

   
    
    
    
}
