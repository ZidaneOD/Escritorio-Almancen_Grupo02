package pe.unjfsc.almacen.java11.entity;

public class CEProducto {

    private String idProducto;
    private String nombProd;
    private String descProd;
    private String idCategoria;
    private String idSabor;
    private String idMarca;
    private double pesoProd;
    private String idUnidadM;
    private int presxe;
    private String undpxc;
    private String idEmpaque;
    private int unidad;
    private String imagProd;

    public CEProducto() {
    }

    public CEProducto(String idProducto, String nombProd, String descProd, String idCategoria, String idSabor, String idMarca, double pesoProd, String idUnidadM, int presxe, String undpxc, String idEmpaque, int unidad, String imagProd) {
        this.idProducto = idProducto;
        this.nombProd = nombProd;
        this.descProd = descProd;
        this.idCategoria = idCategoria;
        this.idSabor = idSabor;
        this.idMarca = idMarca;
        this.pesoProd = pesoProd;
        this.idUnidadM = idUnidadM;
        this.presxe = presxe;
        this.undpxc = undpxc;
        this.idEmpaque = idEmpaque;
        this.unidad = unidad;
        this.imagProd = imagProd;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombProd() {
        return nombProd;
    }

    public void setNombProd(String nombProd) {
        this.nombProd = nombProd;
    }

    public String getDescProd() {
        return descProd;
    }

    public void setDescProd(String descProd) {
        this.descProd = descProd;
    }

    public String getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(String idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getIdSabor() {
        return idSabor;
    }

    public void setIdSabor(String idSabor) {
        this.idSabor = idSabor;
    }

    public String getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(String idMarca) {
        this.idMarca = idMarca;
    }

    public double getPesoProd() {
        return pesoProd;
    }

    public void setPesoProd(double pesoProd) {
        this.pesoProd = pesoProd;
    }

    public String getIdUnidadM() {
        return idUnidadM;
    }

    public void setIdUnidadM(String idUnidadM) {
        this.idUnidadM = idUnidadM;
    }

    public int getPresxe() {
        return presxe;
    }

    public void setPresxe(int presxe) {
        this.presxe = presxe;
    }

    public String getUndpxc() {
        return undpxc;
    }

    public void setUndpxc(String undpxc) {
        this.undpxc = undpxc;
    }

    public String getIdEmpaque() {
        return idEmpaque;
    }

    public void setIdEmpaque(String idEmpaque) {
        this.idEmpaque = idEmpaque;
    }

    public int getUnidad() {
        return unidad;
    }

    public void setUnidad(int unidad) {
        this.unidad = unidad;
    }

    public String getImagProd() {
        return imagProd;
    }

    public void setImagProd(String imagProd) {
        this.imagProd = imagProd;
    }

    @Override
    public String toString() {
        return "CEProducto{" + "idProducto=" + idProducto + ", nombProd=" + nombProd + ", descProd=" + descProd + ", idCategoria=" + idCategoria + ", idSabor=" + idSabor + ", idMarca=" + idMarca + ", pesoProd=" + pesoProd + ", idUnidadM=" + idUnidadM + ", presxe=" + presxe + ", undpxc=" + undpxc + ", idEmpaque=" + idEmpaque + ", unidad=" + unidad + ", imagProd=" + imagProd + '}';
    }

}
