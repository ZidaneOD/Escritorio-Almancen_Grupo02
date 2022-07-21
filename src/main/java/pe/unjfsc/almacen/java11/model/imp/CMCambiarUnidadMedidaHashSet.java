package pe.unjfsc.almacen.java11.model.imp;

import conexion.ConMySQL;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.unjfsc.almacen.java11.entity.CEUnidadMedidaProducto;
import pe.unjfsc.almacen.java11.model.CICambioAlmacen;

public class CMCambiarUnidadMedidaHashSet implements CICambioAlmacen<CEUnidadMedidaProducto> {

    private static final Logger LOG = LoggerFactory.getLogger(CEUnidadMedidaProducto.class);

    @Override
    public void saveAlmacenCIC(CEUnidadMedidaProducto objObjeto) throws Exception {

        Connection cn = ConMySQL.getInstance().getConnection();
        String sql = "CALL sp_insert_distrito(?,?);";
        CallableStatement cs = cn.prepareCall(sql);
        cs.setString(1, objObjeto.getNombUnid());
      //  cs.setString(2, objObjeto.getObsvprod());
        cs.execute();
    }

    @Override
    public void modificarAlmacenCIC(CEUnidadMedidaProducto objObjeto) throws Exception {

         Connection cn = ConMySQL.getInstance().getConnection();
        String sql = "CALL sp_update_distrito(?,?,?);";
        CallableStatement cs = cn.prepareCall(sql);
        cs.setInt(1, objObjeto.getIdUnidadM());
        cs.setString(2, objObjeto.getNombUnid());
        //cs.setString(3, objObjeto.getObsvprod());
        cs.execute();
    }

    @Override
    public void eliminarAlmacenCIC(CEUnidadMedidaProducto objObjeto) throws Exception {

        Connection cn = ConMySQL.getInstance().getConnection();
        String sql = "CALL sp_delete_distrito(?);";
        CallableStatement cs = cn.prepareCall(sql);
        cs.setInt(1, objObjeto.getIdUnidadM());
        cs.execute();
    }

    @Override
    public ResultSet buscar(Object objObject) throws Exception {

            Connection cn = ConMySQL.getInstance().getConnection();
        String nombre = "%" + objObject + "%";
        String sql = "select * from vdistrito where nombdist like ?";
        PreparedStatement ps = cn.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ps.setString(1, nombre);
        ResultSet rs = ps.executeQuery();
        return rs;
    }

}
