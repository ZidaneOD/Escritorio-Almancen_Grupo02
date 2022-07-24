package pe.unjfsc.almacen.java11.model.imp;

import conexion.ConMySQL;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.unjfsc.almacen.java11.entity.CEProvinciaAlmacen;
import pe.unjfsc.almacen.java11.model.CICambioAlmacen;

public class CMCambiarProvinciaHashSet implements CICambioAlmacen<CEProvinciaAlmacen> {

    private static final Logger LOG = LoggerFactory.getLogger(CEProvinciaAlmacen.class);

    @Override
    public void saveAlmacenCIC(CEProvinciaAlmacen objObjeto) throws Exception {
        Connection cn = ConMySQL.getInstance().getConnection();
        String sql = "CALL sp_insert_provincia(?,?);";
        CallableStatement cs = cn.prepareCall(sql);
        cs.setString(1, objObjeto.getNombProvincia());
        cs.setInt(2, objObjeto.getIdDepartamento());
        cs.execute();
    }

    @Override
    public void modificarAlmacenCIC(CEProvinciaAlmacen objObjeto) throws Exception {

        Connection cn = ConMySQL.getInstance().getConnection();
        String sql = "CALL sp_update_provincia(?,?,?);";
        CallableStatement cs = cn.prepareCall(sql);
        cs.setInt(1, objObjeto.getIdProvincia());
        cs.setString(2, objObjeto.getNombProvincia());
        cs.setInt(3, objObjeto.getIdDepartamento());
        cs.execute();
    }

    @Override
    public void eliminarAlmacenCIC(CEProvinciaAlmacen objObjeto) throws Exception {

        Connection cn = ConMySQL.getInstance().getConnection();
        String sql = "CALL sp_delete_provincia(?);";
        CallableStatement cs = cn.prepareCall(sql);
        cs.setInt(1, objObjeto.getIdProvincia());
        cs.execute();
    }

    @Override
    public ResultSet buscar(Object objObject) throws Exception {

        Connection cn = ConMySQL.getInstance().getConnection();
        String nombre = "%" + objObject + "%";
        String sql = "select * from vprovincia where departamento like ?";
        PreparedStatement ps = cn.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ps.setString(1, nombre);
        ResultSet rs = ps.executeQuery();
        return rs;
    }
       public ResultSet mostrar() throws Exception {
        Connection cn = ConMySQL.getInstance().getConnection();
        String sql = "select * from vprovincia";
        PreparedStatement ps = cn.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet rs = ps.executeQuery();
        return rs;

    }

}
