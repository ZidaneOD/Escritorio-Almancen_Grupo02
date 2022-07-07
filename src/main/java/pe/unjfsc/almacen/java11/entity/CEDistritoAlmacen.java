package pe.unjfsc.almacen.java11.entity;

public class CEDistritoAlmacen {

    private String idDistrito;
    private String nombDistrito;
    private String idProvincia;

    public CEDistritoAlmacen() {
    }

    public CEDistritoAlmacen(String idDistrito, String nombDistrito, String idProvincia) {
        this.idDistrito = idDistrito;
        this.nombDistrito = nombDistrito;
        this.idProvincia = idProvincia;
    }

    public String getIdProvincia() {
        return idProvincia;
    }

    public void setIdProvincia(String idProvincia) {
        this.idProvincia = idProvincia;
    }

    public String getIdDistrito() {
        return idDistrito;
    }

    public void setIdDistrito(String idDistrito) {
        this.idDistrito = idDistrito;
    }

    public String getNombDistrito() {
        return nombDistrito;
    }

    public void setNombDistrito(String nombDistrito) {
        this.nombDistrito = nombDistrito;
    }

    @Override
    public String toString() {
        return "CEDistritoAlmacen{" + "idDistrito=" + idDistrito + ", nombDistrito=" + nombDistrito + ", idProvincia=" + idProvincia + '}';
    }

}
