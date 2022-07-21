package pe.unjfsc.almacen.java11.model.imp;

import conexion.ConMySQL;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.unjfsc.almacen.java11.entity.CEProducto;
import pe.unjfsc.almacen.java11.model.CICambioAlmacen;

public class CMCambiarProductoHashSet implements CICambioAlmacen<CEProducto> {

    private static final Logger LOG = LoggerFactory.getLogger(CEProducto.class);

    @Override
    public void saveAlmacenCIC(CEProducto objObjeto) throws Exception {

       Connection cn = ConMySQL.getInstance().getConnection();
        String sql = "CALL sp_insert_distrito(?,?);";
        CallableStatement cs = cn.prepareCall(sql);
        cs.setString(1, objObjeto.getNombProd());
        cs.setString(2, objObjeto.getDescProd());
        cs.setInt(3, objObjeto.getIdCategoria());
        cs.setInt(4, objObjeto.getIdSabor());
        cs.setInt(5, objObjeto.getIdMarca());
        cs.setDouble(6, objObjeto.getPesoProd());
        cs.setInt(7, objObjeto.getIdUnidadM());
        cs.setInt(8, objObjeto.getPresxe());
        cs.setString(9, objObjeto.getUndpxc());
        cs.setInt(10, objObjeto.getIdEmpaque());
        cs.setInt(11, objObjeto.getUnidad());
        cs.setString(12, objObjeto.getImagProd());
        //cs.setInt(2, objObjeto.getIdEmpaque());
        
        cs.execute();
    }

    @Override
    public void modificarAlmacenCIC(CEProducto objObjeto) throws Exception {

              Connection cn = ConMySQL.getInstance().getConnection();
        String sql = "CALL sp_update_distrito(?,?,?);";
        CallableStatement cs = cn.prepareCall(sql);
        cs.setInt(1, objObjeto.getIdProducto());
         cs.setString(2, objObjeto.getNombProd());
       cs.setString(3, objObjeto.getDescProd());
        cs.setInt(4, objObjeto.getIdCategoria());
        cs.setInt(5, objObjeto.getIdSabor());
        cs.setInt(6, objObjeto.getIdMarca());
        cs.setDouble(7, objObjeto.getPesoProd());
        cs.setInt(8, objObjeto.getIdUnidadM());
        cs.setInt(9, objObjeto.getPresxe());
        cs.setString(10, objObjeto.getUndpxc());
        cs.setInt(11, objObjeto.getIdEmpaque());
        cs.setInt(12, objObjeto.getUnidad());
        cs.setString(13, objObjeto.getImagProd());
        cs.execute();
    }

    @Override
    public void eliminarAlmacenCIC(CEProducto objObjeto) throws Exception {
         Connection cn = ConMySQL.getInstance().getConnection();
        String sql = "CALL sp_delete_distrito(?);";
        CallableStatement cs = cn.prepareCall(sql);
        cs.setInt(1, objObjeto.getIdProducto());
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
