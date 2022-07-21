package pe.unjfsc.almacen.java11.model.imp;

import conexion.ConMySQL;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import pe.unjfsc.almacen.java11.entity.CECategoriaProducto;
import pe.unjfsc.almacen.java11.model.CICambioAlmacen;

public class CMCambiarCategoria implements CICambioAlmacen<CECategoriaProducto> {

    @Override
    public void saveAlmacenCIC(CECategoriaProducto objObjeto) throws Exception {
        
        Connection cn = ConMySQL.getInstance().getConnection();
        String sql = "CALL sp_insert_categoria(?);";
        CallableStatement cs = cn.prepareCall(sql);
        cs.setString(1, objObjeto.getNombCate());
   
        cs.execute();

    }

    @Override
    public void modificarAlmacenCIC(CECategoriaProducto objObjeto) throws Exception {

         Connection cn = ConMySQL.getInstance().getConnection();
        String sql = "CALL sp_update_categoria(?,?);";
        CallableStatement cs = cn.prepareCall(sql);
        cs.setInt(1, objObjeto.getIdCategoria());
        cs.setString(2, objObjeto.getNombCate());
        cs.execute();
    }

    @Override
    public void eliminarAlmacenCIC(CECategoriaProducto objObjeto) throws Exception {

           Connection cn = ConMySQL.getInstance().getConnection();
        String sql = "CALL sp_delete_categoria(?);";
        CallableStatement cs = cn.prepareCall(sql);
        cs.setInt(1, objObjeto.getIdCategoria());
        
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
