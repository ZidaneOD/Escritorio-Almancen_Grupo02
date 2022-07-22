package pe.unjfsc.almacen.java11.model.imp;

import conexion.ConMySQL;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.unjfsc.almacen.java11.entity.CEEmpleadoTransaccion;
import pe.unjfsc.almacen.java11.model.CICambioAlmacen;

public class CMCambiarEmpleadoHashSet implements CICambioAlmacen<CEEmpleadoTransaccion> {

    private static final Logger LOG = LoggerFactory.getLogger(CMCambiarEmpleadoHashSet.class);

    @Override
    public void saveAlmacenCIC(CEEmpleadoTransaccion objObjeto) throws Exception {

        Connection cn = ConMySQL.getInstance().getConnection();
        String sql = "CALL sp_insert_empleado(?,?,?,?,?,?,?);";
        CallableStatement cs = cn.prepareCall(sql);
        cs.setString(1, objObjeto.getDniEmpl());
        cs.setString(2, objObjeto.getNombEmpl());
        cs.setString(3, objObjeto.getApaEmpl());
        cs.setString(4, objObjeto.getAmaEmpl());
        cs.setString(5, objObjeto.getTelfEmpl());
        cs.setString(6, objObjeto.getMailEmpl());
        cs.setInt(7, objObjeto.getIdCargo());
        cs.execute();
    }

    @Override
    public void modificarAlmacenCIC(CEEmpleadoTransaccion objObjeto) throws Exception {

        Connection cn = ConMySQL.getInstance().getConnection();
        String sql = "CALL sp_update_empleado(?,?,?,?,?,?,?,?);";
        CallableStatement cs = cn.prepareCall(sql);
        cs.setInt(1, objObjeto.getIdEmpl());
        cs.setString(2, objObjeto.getDniEmpl());
        cs.setString(3, objObjeto.getNombEmpl());
        cs.setString(4, objObjeto.getApaEmpl());
        cs.setString(5, objObjeto.getAmaEmpl());
        cs.setString(6, objObjeto.getTelfEmpl());
        cs.setString(7, objObjeto.getMailEmpl());
        cs.setInt(8, objObjeto.getIdCargo());
        cs.execute();
    }

    @Override
    public void eliminarAlmacenCIC(CEEmpleadoTransaccion objObjeto) throws Exception {

        Connection cn = ConMySQL.getInstance().getConnection();
        String sql = "CALL sp_delete_empleado(?);";
        CallableStatement cs = cn.prepareCall(sql);
        cs.setInt(1, objObjeto.getIdEmpl());
        cs.execute();
    }

    @Override
    public ResultSet buscar(Object objObject) throws Exception {

        Connection cn = ConMySQL.getInstance().getConnection();
        String nombre = "%" + objObject + "%";
        String sql = "select * from vempleado where nombre like ?";
        PreparedStatement ps = cn.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ps.setString(1, nombre);
        ResultSet rs = ps.executeQuery();
        return rs;
    }
    
    public ResultSet mostrar() throws Exception {
        Connection cn = ConMySQL.getInstance().getConnection();
        String sql = "select * from vempleado;";
        PreparedStatement ps = cn.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet rs = ps.executeQuery();
        return rs;

    }
}
