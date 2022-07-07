package pe.unjfsc.almacen.java11.model.imp;

import java.util.HashSet;
import java.util.Iterator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.unjfsc.almacen.java11.entity.CEEmpleadoTransaccion;
import pe.unjfsc.almacen.java11.model.CICambioAlmacen;

public class CMCambiarEmpleadoHashSet implements CICambioAlmacen<CEEmpleadoTransaccion> {

    private static final Logger LOG = LoggerFactory.getLogger(CMCambiarEmpleadoHashSet.class);

    private HashSet<CEEmpleadoTransaccion> oHsData;

    private CEEmpleadoTransaccion oEmpleado;

    public CMCambiarEmpleadoHashSet() {
        LOG.info("FSI] Start CMCambiarEmpleadoHashSet before crear la instancia : ()", oHsData);
        oHsData = new HashSet<>();

        LOG.info("[FSI] Count del HashSet :", oHsData.isEmpty());
        oHsData.add(new CEEmpleadoTransaccion("EM01", "74108529", "GUSTAVO", "DURAND", "VASQUEZ", "963852741", "DURANDGUSTAVO@GMAIL.COM", "P0003"));
        oHsData.add(new CEEmpleadoTransaccion("EM02", "78945612", "ZIDANE", "ORTIZ", "DIAZ", "968523126", "ORTIZZIDANE@GMAIL.COM", "P0002"));
        oHsData.add(new CEEmpleadoTransaccion("EM03", "73625140", "FREDDY", "MOYA", "PACHECHO", "951623487", "MOYAFREDDY@GMAIL.COM", "P0004"));
        oHsData.add(new CEEmpleadoTransaccion("EM04", "61526301", "ANDY", "FERNANDEZ", "ERAZO", "935214798", "FERNANDEZANDY@GMAIL.COM", "P0003"));
        oHsData.add(new CEEmpleadoTransaccion("EM05", "41578963", "TATIANA", "QUESQUEN", "CARVALLO", "937419549", "QUESQUENTATIANA@GMAIL.COM", "P0001"));
        LOG.info("[FSI] After - Count del HashSet : {}", oHsData.size());

    }

    @Override
    public void saveAlmacenCIC(CEEmpleadoTransaccion poData) {
        LOG.info("[FSI] Start saveAlmacenCIC : ", oEmpleado);
        oHsData.add(new CEEmpleadoTransaccion(poData.getIdEmpl(), poData.getDniEmpl(), poData.getNombEmpl(), poData.getApaEmpl(), poData.getAmaEmpl(), poData.getTelfEmpl(), poData.getMailEmpl(), poData.getIdCargo()));

    }

    @Override
    public void modificarAlmacenCIC(CEEmpleadoTransaccion poData) {
        LOG.info("[FSI] Start modificarAlmacenCIC : {}", poData.getIdEmpl());
        Iterator<CEEmpleadoTransaccion> oIt = oHsData.iterator();
        while (oIt.hasNext()) {
            oEmpleado = new CEEmpleadoTransaccion();
            oEmpleado = oIt.next();
            LOG.info("[FSI] Objeto asignado : {}", oEmpleado);

            if (oEmpleado.getIdEmpl().equals(poData.getIdEmpl())) {
                LOG.info("[FSI] Objeto modificado : {}", oEmpleado);
                oEmpleado.setDniEmpl(poData.getDniEmpl());
                oEmpleado.setNombEmpl(poData.getNombEmpl());
                oEmpleado.setApaEmpl(poData.getApaEmpl());
                oEmpleado.setAmaEmpl(poData.getAmaEmpl());
                oEmpleado.setTelfEmpl(poData.getTelfEmpl());
                oEmpleado.setMailEmpl(poData.getMailEmpl());
                oEmpleado.setIdCargo(poData.getIdCargo());
                break;
            }
        }
    }

    @Override
    public void eliminarAlmacenCIC(String pId) {
        LOG.info("[FSI] Start eliminarAlmacenCIC : {}", pId);
        Iterator<CEEmpleadoTransaccion> oIt = oHsData.iterator();
        while (oIt.hasNext()) {
            oEmpleado = new CEEmpleadoTransaccion();
            oEmpleado = oIt.next();
            LOG.info("[FSI] Objeto asignado : {}", oEmpleado);

            if (oEmpleado.getIdEmpl().equals(pId)) {
                LOG.info("[FSI] Objeto Elimnado : {}", oEmpleado);
                oHsData.remove(oEmpleado);
                break;
            }
        }
    }

    @Override
    public HashSet<Object> consultAllAlmacenCIC() {
        LOG.info("[FSI] Start consultAllAlmacenCIC : {}", oHsData.size());
        LOG.info(String.valueOf(oHsData));
        return (HashSet<Object>) (Object) oHsData;
    }
}
