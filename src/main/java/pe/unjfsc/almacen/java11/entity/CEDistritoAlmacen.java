package pe.unjfsc.almacen.java11.entity;

public class CEDistritoAlmacen {

    private int idDistrito;
    private String nombDistrito;
    private int idProvincia;

    public CEDistritoAlmacen() {
    }

    public CEDistritoAlmacen(int idDistrito, String nombDistrito, int idProvincia) {
        this.idDistrito = idDistrito;
        this.nombDistrito = nombDistrito;
        this.idProvincia = idProvincia;
    }

    public int getIdProvincia() {
        return idProvincia;
    }

    public void setIdProvincia(int idProvincia) {
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
