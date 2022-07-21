package pe.unjfsc.almacen.java11.entity;

public class CEDistritoAlmacen {

    private int idDistrito;
    private String nombDistrito;
    private String idProvincia;

    public CEDistritoAlmacen() {
    }

    public CEDistritoAlmacen(int idDistrito, String nombDistrito, String idProvincia) {
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

    public int getIdDistrito() {
        return idDistrito;
    }

    public void setIdDistrito(int idDistrito) {
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
