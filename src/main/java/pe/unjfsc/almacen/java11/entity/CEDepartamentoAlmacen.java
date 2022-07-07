package pe.unjfsc.almacen.java11.entity;

public class CEDepartamentoAlmacen {

    private String idDepartamento;
    private String nombDepa;

    public CEDepartamentoAlmacen() {
    }

    public CEDepartamentoAlmacen(String idDepartamento, String nombDepa) {
        this.idDepartamento = idDepartamento;
        this.nombDepa = nombDepa;
    }

    public String getNombDepa() {
        return nombDepa;
    }

    public void setNombDepa(String nombDepa) {
        this.nombDepa = nombDepa;
    }

    public String getidDepartamento() {
        return idDepartamento;
    }

    public void setidDepartamento(String idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    @Override
    public String toString() {
        return "CEDepartamentoAlmacen{" + "idDepartamento=" + idDepartamento + ", nombDepa=" + nombDepa + '}';
    }

}
