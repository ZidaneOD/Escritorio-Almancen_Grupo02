
package pe.unjfsc.almacen.java11.model.imp;

import conexion.ConMySQL;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.unjfsc.almacen.java11.entity.CEAlmacen;
import pe.unjfsc.almacen.java11.model.CICambioAlmacen;

public class CMCambiarAlmacen implements CICambioAlmacen<CEAlmacen> {

    private static final Logger LOG = LoggerFactory.getLogger(CMCambiarAlmacen.class);

   
    @Override
    public void saveAlmacenCIC(CEAlmacen objObjeto) throws Exception {

        Connection cn = ConMySQL.getInstance().getConnection();
        String sql = "CALL sp_insert_almacen(?,?);";
        CallableStatement cs = cn.prepareCall(sql);
        cs.setString(1, objObjeto.getNombAlm());
        cs.setString(2, objObjeto.getIdUbicacion());
        cs.execute();
    }

    @Override
    public void modificarAlmacenCIC(CEAlmacen objObjeto) throws Exception {

          Connection cn = ConMySQL.getInstance().getConnection();
        String sql = "CALL sp_update_almacen(?,?,?);";
        CallableStatement cs = cn.prepareCall(sql);
        cs.setString(1, objObjeto.getIdAlmacen());
        cs.setString(2, objObjeto.getNombAlm());
        cs.setString(3, objObjeto.getIdUbicacion());
        cs.execute();
    }

    @Override
    public void eliminarAlmacenCIC(CEAlmacen objObjeto) throws Exception {
        
          Connection cn = ConMySQL.getInstance().getConnection();
        String sql = "CALL sp_delete_almacen(?);";
        CallableStatement cs = cn.prepareCall(sql);
        cs.setString(1, objObjeto.getIdAlmacen());
        cs.execute();
    }

    @Override
    public ResultSet buscar(Object objObject) throws Exception {

        Connection cn = ConMySQL.getInstance().getConnection();
        String nombre = "%" + objObject + "%";
        String sql = "select * from almacen where nombalma like ?";
        PreparedStatement ps = cn.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ps.setString(1, nombre);
        ResultSet rs = ps.executeQuery();
        return rs;
    }

}


