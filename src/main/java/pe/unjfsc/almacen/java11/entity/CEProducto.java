package pe.unjfsc.almacen.java11.entity;

public class CEProducto {

    private int idProducto;
    private String nombProd;
    private String descProd;
    private int idCategoria;
    private int idSabor;
    private int idMarca;
    private double pesoProd;
    private int idUnidadM;
    private int presxe;
    private String undpxc;
    private int idEmpaque;
    private int unidad;
    private String imagProd;

    public CEProducto() {
    }

    public CEProducto(int idProducto, String nombProd, String descProd, int idCategoria, int idSabor, int idMarca, double pesoProd, int idUnidadM, int presxe, String undpxc, int idEmpaque, int unidad, String imagProd) {
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
    
    

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
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

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public int getIdSabor() {
        return idSabor;
    }

    public void setIdSabor(int idSabor) {
        this.idSabor = idSabor;
    }

    public int getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }

    public double getPesoProd() {
        return pesoProd;
    }

    public void setPesoProd(double pesoProd) {
        this.pesoProd = pesoProd;
    }

    public int getIdUnidadM() {
        return idUnidadM;
    }

    public void setIdUnidadM(int idUnidadM) {
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

    public int getIdEmpaque() {
        return idEmpaque;
    }

    public void setIdEmpaque(int idEmpaque) {
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


}
