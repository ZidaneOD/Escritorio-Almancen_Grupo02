package pe.unjfsc.almacen.java11.entity;

public class CEProvinciaAlmacen {

    private String idProvincia;
    private String nombProvincia;
    private String idDepartamento;

    public CEProvinciaAlmacen() {
    }

    public CEProvinciaAlmacen(String idProvincia, String nombProvincia, String idDepartamento) {
        this.idProvincia = idProvincia;
        this.nombProvincia = nombProvincia;
        this.idDepartamento = idDepartamento;
    }

    public String getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(String idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public String getIdProvincia() {
        return idProvincia;
    }

    public void setIdProvincia(String idProvincia) {
        this.idProvincia = idProvincia;
    }

    public String getNombProvincia() {
        return nombProvincia;
    }

    public void setNombProvincia(String nombProvincia) {
        this.nombProvincia = nombProvincia;
    }

    @Override
    public String toString() {
        return "CEProvinciaAlmacen{" + "idProvincia=" + idProvincia + ", nombProvincia=" + nombProvincia + ", idDepartamento=" + idDepartamento + '}';
    }

}
