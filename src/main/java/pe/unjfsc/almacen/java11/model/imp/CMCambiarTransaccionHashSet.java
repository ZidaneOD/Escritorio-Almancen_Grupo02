package pe.unjfsc.almacen.java11.model.imp;

import conexion.ConMySQL;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.unjfsc.almacen.java11.entity.CETransaccion;
import pe.unjfsc.almacen.java11.model.CICambioAlmacen;

public class CMCambiarTransaccionHashSet implements CICambioAlmacen<CETransaccion> {

    private static final Logger LOG = LoggerFactory.getLogger(CMCambiarTransaccionHashSet.class);

    @Override
    public void saveAlmacenCIC(CETransaccion objObjeto) throws Exception {
        Connection cn = ConMySQL.getInstance().getConnection();
        String sql = "CALL sp_insert_kardex(?,?,?)";
        CallableStatement cs = cn.prepareCall(sql);
        cs.setInt(1, objObjeto.getIdorigen());
        cs.setInt(2, objObjeto.getIddest());
        cs.setInt(3, objObjeto.getIdEmpleado());
        cs.execute();
    }

    @Override
    public void modificarAlmacenCIC(CETransaccion objObjeto) throws Exception {
        Connection cn = ConMySQL.getInstance().getConnection();
        String sql = "CALL sp_update_kardex(?,?,?,?)";
        CallableStatement cs = cn.prepareCall(sql);
        cs.setInt(1, objObjeto.getIdkardex());
        cs.setInt(2, objObjeto.getIdorigen());
        cs.setInt(3, objObjeto.getIddest());
        cs.setInt(4, objObjeto.getIdEmpleado());
        cs.execute();
    }

    @Override
    public void eliminarAlmacenCIC(CETransaccion objObjeto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ResultSet buscar(Object objObject) throws Exception {
        Connection cn = ConMySQL.getInstance().getConnection();
        String nombre = "%" + objObject + "%";
        String sql = "select * from vkardex codigo like ?";
        PreparedStatement ps = cn.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet rs = ps.executeQuery();
        ps.setString(1, nombre);
        return rs;

    }

    public ResultSet mostrar() throws Exception {

        Connection cn = ConMySQL.getInstance().getConnection();
        String sql = "select * from vkardex";
        PreparedStatement ps = cn.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet rs = ps.executeQuery();
        return rs;

    }

    public int obtenerIdKardex() throws Exception {
        Connection cn = ConMySQL.getInstance().getConnection();
        String sql = "select * from vkardex";
        PreparedStatement ps = cn.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet rs = ps.executeQuery();
        rs.last();
        return rs.getInt(1);
    }
}
