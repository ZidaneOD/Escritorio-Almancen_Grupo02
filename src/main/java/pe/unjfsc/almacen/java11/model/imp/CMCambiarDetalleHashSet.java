package pe.unjfsc.almacen.java11.model.imp;

import conexion.ConMySQL;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.unjfsc.almacen.java11.entity.CESDetalle;
import pe.unjfsc.almacen.java11.model.CICambioAlmacen;

public class CMCambiarDetalleHashSet implements CICambioAlmacen<CESDetalle> {

    private static final Logger LOG = LoggerFactory.getLogger(CMCambiarDetalleHashSet.class);

    @Override
    public void saveAlmacenCIC(CESDetalle objObjeto) throws Exception {
        Connection cn = ConMySQL.getInstance().getConnection();
        String sql = "CALL sp_insert_detalle(?,?)";
        CallableStatement cs = cn.prepareCall(sql);
        cs.setInt(1, objObjeto.getIdkardex());
        cs.setInt(2, objObjeto.getIdporducto());
        cs.execute();
    }

    @Override
    public void modificarAlmacenCIC(CESDetalle objObjeto) throws Exception {
        Connection cn = ConMySQL.getInstance().getConnection();
        String sql = "CALL sp_update_detalle(?,?)";
        CallableStatement cs = cn.prepareCall(sql);
        cs.setInt(1, objObjeto.getIdkardex());
        cs.setInt(2, objObjeto.getIdporducto());
        cs.execute();
    }

    @Override
    public void eliminarAlmacenCIC(CESDetalle objObjeto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ResultSet buscar(Object objObject) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public ResultSet buscarPorFecha(Object objObject1, Object objObject2) throws Exception {
        Connection cn = ConMySQL.getInstance().getConnection();
        String fechaIni = objObject1.toString();
        String fechaFin = objObject2.toString();
        String sql = "select * from vdetalle where date(fecha) between ? and ? order by 1";
        PreparedStatement ps = cn.prepareStatement(sql);
        ps.setString(1, fechaIni);
        ps.setString(2, fechaFin);
        ResultSet rs = ps.executeQuery();
        return rs;
    }

    public ResultSet buscarPorAlmacen(Object objObject) throws Exception {
        Connection cn = ConMySQL.getInstance().getConnection();
        String almacen = objObject.toString();
        String sql = "select * from vdetalle where origen like ?";
        PreparedStatement ps = cn.prepareStatement(sql);
        ps.setString(1, almacen);
        ResultSet rs = ps.executeQuery();
        return rs;
    }

    public ResultSet buscarPorEstado(Object objObject) throws Exception {
        Connection cn = ConMySQL.getInstance().getConnection();
        String estado = objObject.toString();
        String sql = "select * from vdetalle where estado like ?";
        PreparedStatement ps = cn.prepareStatement(sql);
        ps.setString(1, estado);
        ResultSet rs = ps.executeQuery();
        return rs;
    }

    public void modificarARecibido(int id, int esta) throws Exception {
        Connection cn = ConMySQL.getInstance().getConnection();
        String sql = "CALL sp_update_kardex(?,?)";
        CallableStatement cs = cn.prepareCall(sql);
        cs.setInt(1, id);
        cs.setInt(2, esta);
        cs.execute();
    }
    
     public void modificarAAnulado(int id, int esta) throws Exception {
        Connection cn = ConMySQL.getInstance().getConnection();
        String sql = "CALL sp_update_kardex(?,?)";
        CallableStatement cs = cn.prepareCall(sql);
        cs.setInt(1, id);
        cs.setInt(2, esta);
        cs.execute();
    }

}
