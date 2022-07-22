package pe.unjfsc.almacen.java11.model.imp;

import conexion.ConMySQL;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.unjfsc.almacen.java11.entity.CECargoEmpleado;
import pe.unjfsc.almacen.java11.model.CICambioAlmacen;

public class CMCambiarCargoEmpleado implements CICambioAlmacen<CECargoEmpleado> {

    private static final Logger LOG = LoggerFactory.getLogger(CMCambiarCargoEmpleado.class);

    @Override
    public void saveAlmacenCIC(CECargoEmpleado objObjeto) throws Exception {

        Connection cn = ConMySQL.getInstance().getConnection();
        String sql = "CALL sp_insert_puesto(?)";
        CallableStatement cs = cn.prepareCall(sql);
        cs.setString(1, objObjeto.getNombCargo());
        cs.execute();
    }

    @Override
    public void modificarAlmacenCIC(CECargoEmpleado objObjeto) throws Exception {

        Connection cn = ConMySQL.getInstance().getConnection();
        String sql = "CALL sp_update_puesto(?,?);";
        CallableStatement cs = cn.prepareCall(sql);
        cs.setInt(1, objObjeto.getIdCargo());
        cs.setString(2, objObjeto.getNombCargo());
        cs.execute();

    }

    @Override
    public void eliminarAlmacenCIC(CECargoEmpleado objObjeto) throws Exception {

        Connection cn = ConMySQL.getInstance().getConnection();
        String sql = "CALL sp_delete_puesto(?);";
        CallableStatement cs = cn.prepareCall(sql);
        cs.setInt(1, objObjeto.getIdCargo());
        cs.execute();
    }

    @Override
    public ResultSet buscar(Object objObject) throws Exception {

        Connection cn = ConMySQL.getInstance().getConnection();
        String nombre = "%" + objObject + "%";
        String sql = "select * from vpuesto where puesto like ?";
        PreparedStatement ps = cn.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ps.setString(1, nombre);
        ResultSet rs = ps.executeQuery();
        return rs;

    }
    
    public ResultSet mostrar() throws Exception {

        Connection cn = ConMySQL.getInstance().getConnection();
        String sql = "select * from vpuesto";
        PreparedStatement ps = cn.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet rs = ps.executeQuery();
        return rs;

    }
}
