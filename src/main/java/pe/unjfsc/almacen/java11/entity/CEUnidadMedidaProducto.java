package pe.unjfsc.almacen.java11.entity;

public class CEUnidadMedidaProducto {

    private int idUnidadM;
    private String nombUnid;

    public CEUnidadMedidaProducto() {
    }

    public CEUnidadMedidaProducto(int codiUnid, String nombUnid) {
        this.idUnidadM = codiUnid;
        this.nombUnid = nombUnid;
    }

    public int getIdUnidadM() {
        return idUnidadM;
    }

    public void setIdUnidadM(int idUnidadM) {
        this.idUnidadM = idUnidadM;
    }

    public String getNombUnid() {
        return nombUnid;
    }

    public void setNombUnid(String nombUnid) {
        this.nombUnid = nombUnid;
    }

    @Override
    public String toString() {
        return "CEUnidad_Medida_Producto{" + "codiUnid=" + idUnidadM + ", nombUnid=" + nombUnid + '}';
    }

}
