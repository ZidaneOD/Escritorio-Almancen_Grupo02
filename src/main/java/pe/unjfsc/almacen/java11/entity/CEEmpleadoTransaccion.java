
package pe.unjfsc.almacen.java11.entity;

public class CEEmpleadoTransaccion {
    
    private String idEmpl;
    private String dniEmpl;
    private String nombEmpl;
    private String apaEmpl;
    private String amaEmpl;
    private String telfEmpl;
    private String mailEmpl;
    private String idCargo;

    public CEEmpleadoTransaccion() {
    }

    public CEEmpleadoTransaccion(String idEmpl, String dniEmpl, String nombEmpl, String apaEmpl, String amaEmpl, String telfEmpl, String mailEmpl, String idPuesto) {
        this.idEmpl = idEmpl;
        this.dniEmpl = dniEmpl;
        this.nombEmpl = nombEmpl;
        this.apaEmpl = apaEmpl;
        this.amaEmpl = amaEmpl;
        this.telfEmpl = telfEmpl;
        this.mailEmpl = mailEmpl;
        this.idCargo = idPuesto;
    }

    public String getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(String idCargo) {
        this.idCargo = idCargo;
    }

    public String getIdEmpl() {
        return idEmpl;
    }

    public void setIdEmpl(String idEmpl) {
        this.idEmpl = idEmpl;
    }

    public String getDniEmpl() {
        return dniEmpl;
    }

    public void setDniEmpl(String dniEmpl) {
        this.dniEmpl = dniEmpl;
    }

    public String getNombEmpl() {
        return nombEmpl;
    }

    public void setNombEmpl(String nombEmpl) {
        this.nombEmpl = nombEmpl;
    }

    public String getApaEmpl() {
        return apaEmpl;
    }

    public void setApaEmpl(String apaEmpl) {
        this.apaEmpl = apaEmpl;
    }

    public String getAmaEmpl() {
        return amaEmpl;
    }

    public void setAmaEmpl(String amaEmpl) {
        this.amaEmpl = amaEmpl;
    }

    public String getTelfEmpl() {
        return telfEmpl;
    }

    public void setTelfEmpl(String telfEmpl) {
        this.telfEmpl = telfEmpl;
    }

    public String getMailEmpl() {
        return mailEmpl;
    }

    public void setMailEmpl(String mailEmpl) {
        this.mailEmpl = mailEmpl;
    }

    @Override
    public String toString() {
        return "CEEmpleadoTransaccion{" + "idEmpl=" + idEmpl + ", dniEmpl=" + dniEmpl + ", nombEmpl=" + nombEmpl + ", apaEmpl=" + apaEmpl + ", amaEmpl=" + amaEmpl + ", telfEmpl=" + telfEmpl + ", mailEmpl=" + mailEmpl + ", idPuesto=" + idCargo + '}';
    }
    
    
    
    
}
