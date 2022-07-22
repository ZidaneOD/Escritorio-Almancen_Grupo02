package pe.unjfsc.almacen.java11.entity;

public class CEProvinciaAlmacen {

    private int idProvincia;
    private String nombProvincia;
    private int idDepartamento;

    public CEProvinciaAlmacen() {
    }

    public CEProvinciaAlmacen(int idProvincia, String nombProvincia, int idDepartamento) {
        this.idProvincia = idProvincia;
        this.nombProvincia = nombProvincia;
        this.idDepartamento = idDepartamento;
    }

    public int getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public int getIdProvincia() {
        return idProvincia;
    }

    public void setIdProvincia(int idProvincia) {
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
