package pe.unjfsc.almacen.java11.model.imp;

import conexion.ConMySQL;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.unjfsc.almacen.java11.entity.CEMarcaProducto;
import pe.unjfsc.almacen.java11.model.CICambioAlmacen;

public class CMCambiarMarcaProductoHashSet implements CICambioAlmacen<CEMarcaProducto> {

    private static final Logger LOG = LoggerFactory.getLogger(CEMarcaProducto.class);

    @Override
    public void saveAlmacenCIC(CEMarcaProducto objObjeto) throws Exception {
        Connection cn = ConMySQL.getInstance().getConnection();
        String sql = "CALL sp_insert_marca(?);";
        CallableStatement cs = cn.prepareCall(sql);
        cs.setString(1, objObjeto.getNombMarca());
        cs.execute();
    }

    @Override
    public void modificarAlmacenCIC(CEMarcaProducto objObjeto) throws Exception {

          Connection cn = ConMySQL.getInstance().getConnection();
        String sql = "CALL sp_update_marca(?,?);";
        CallableStatement cs = cn.prepareCall(sql);
        cs.setInt(1, objObjeto.getIdMarca());
        cs.setString(2, objObjeto.getNombMarca());
        cs.execute();
    }

    @Override
    public void eliminarAlmacenCIC(CEMarcaProducto objObjeto) throws Exception {

          Connection cn = ConMySQL.getInstance().getConnection();
        String sql = "CALL sp_delete_marca(?);";
        CallableStatement cs = cn.prepareCall(sql);
        cs.setInt(1, objObjeto.getIdMarca());
        cs.execute();
    }

    @Override
    public ResultSet buscar(Object objObject) throws Exception {

        Connection cn = ConMySQL.getInstance().getConnection();
        String nombre = "%" + objObject + "%";
        String sql = "select * from vmarca where marca like ?";
        PreparedStatement ps = cn.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ps.setString(1, nombre);
        ResultSet rs = ps.executeQuery();
        return rs;
    }
    
     public ResultSet mostrar() throws Exception {
        Connection cn = ConMySQL.getInstance().getConnection();
        String sql = "select * from vmarca;";
        PreparedStatement ps = cn.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet rs = ps.executeQuery();
        return rs;

    }

   
}
