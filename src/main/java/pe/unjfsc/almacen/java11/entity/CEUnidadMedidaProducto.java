package pe.unjfsc.almacen.java11.entity;

public class CEUnidadMedidaProducto {

    private String idUnidadM;
    private String nombUnid;

    public CEUnidadMedidaProducto() {
    }

    public CEUnidadMedidaProducto(String codiUnid, String nombUnid) {
        this.idUnidadM = codiUnid;
        this.nombUnid = nombUnid;
    }

    public String getIdUnidadM() {
        return idUnidadM;
    }

    public void setIdUnidadM(String idUnidadM) {
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
