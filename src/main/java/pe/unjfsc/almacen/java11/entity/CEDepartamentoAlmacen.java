package pe.unjfsc.almacen.java11.entity;

public class CEDepartamentoAlmacen {

    private int idDepartamento;
    private String nombDepa;

    public CEDepartamentoAlmacen() {
    }

    public CEDepartamentoAlmacen(int idDepartamento, String nombDepa) {
        this.idDepartamento = idDepartamento;
        this.nombDepa = nombDepa;
    }

    public String getNombDepa() {
        return nombDepa;
    }

    public void setNombDepa(String nombDepa) {
        this.nombDepa = nombDepa;
    }

    public int getidDepartamento() {
        return idDepartamento;
    }

    public void setidDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    @Override
    public String toString() {
        return "CEDepartamentoAlmacen{" + "idDepartamento=" + idDepartamento + ", nombDepa=" + nombDepa + '}';
    }

}
