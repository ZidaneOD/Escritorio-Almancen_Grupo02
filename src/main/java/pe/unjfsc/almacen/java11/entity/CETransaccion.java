
package pe.unjfsc.almacen.java11.entity;

public class CETransaccion {
    
    private String idTransaccion;
    private String idAlmacen;
    private String idProducto;
    private String idEmpleado;
    private String idEstado;

    public CETransaccion() {
    }

    public CETransaccion(String idTransaccion, String idAlmacen, String idProducto, String idEmpleado, String idEstado) {
        this.idTransaccion = idTransaccion;
        this.idAlmacen = idAlmacen;
        this.idProducto = idProducto;
        this.idEmpleado = idEmpleado;
        this.idEstado = idEstado;
    }

    public String getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(String idEstado) {
        this.idEstado = idEstado;
    }

    public String getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(String idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public String getIdAlmacen() {
        return idAlmacen;
    }

    public void setIdAlmacen(String idAlmacen) {
        this.idAlmacen = idAlmacen;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    @Override
    public String toString() {
        return "CETransaccion{" + "idTransaccion=" + idTransaccion + ", idAlmacen=" + idAlmacen + ", idProducto=" + idProducto + ", idEmpleado=" + idEmpleado + ", idEstado=" + idEstado + '}';
    }
    
    
    
    
}
