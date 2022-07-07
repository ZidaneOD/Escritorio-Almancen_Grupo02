package pe.unjfsc.almacen.java11.model.imp;

import java.util.HashSet;
import java.util.Iterator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.unjfsc.almacen.java11.entity.CECargoEmpleado;
import pe.unjfsc.almacen.java11.model.CICambioAlmacen;

public class CMCambiarCargoEmpleado implements CICambioAlmacen<CECargoEmpleado> {

    private static final Logger LOG = LoggerFactory.getLogger(CMCambiarCargoEmpleado.class);

    private HashSet<CECargoEmpleado> oHsData;

    private CECargoEmpleado oCargoEmpleado;

    public CMCambiarCargoEmpleado() {
        LOG.info("FSI] Start CMCambiarCargoEmpleado before crear la instancia : ()", oHsData);
        oHsData = new HashSet<>();

        LOG.info("[FSI] Count del HashSet :", oHsData.isEmpty());
        oHsData.add(new CECargoEmpleado("P0001", "Administración"));
        oHsData.add(new CECargoEmpleado("P0002", "Jefe de Almacén"));
        oHsData.add(new CECargoEmpleado("P0003", "Contador de recepción"));
        oHsData.add(new CECargoEmpleado("P0004", "Auxiliar de Almacén."));
        oHsData.add(new CECargoEmpleado("P0005", "Personal de mantenimiento"));
        LOG.info("[FSI] After - Count del HashSet : {}", oHsData.size());

    }

    @Override
    public void saveAlmacenCIC(CECargoEmpleado poData) {
        LOG.info("[FSI] Start saveAlmacenCIC : ", oCargoEmpleado);
        oHsData.add(new CECargoEmpleado(poData.getIdCargo(), poData.getNombCargo()));

    }

    @Override
    public void modificarAlmacenCIC(CECargoEmpleado poData) {
        LOG.info("[FSI] Start modificarAlmacenCIC : {}", poData.getIdCargo());
        Iterator<CECargoEmpleado> oIt = oHsData.iterator();
        while (oIt.hasNext()) {
            oCargoEmpleado = new CECargoEmpleado();
            oCargoEmpleado = oIt.next();
            LOG.info("[FSI] Objeto asignado : {}", oCargoEmpleado);

            if (oCargoEmpleado.getIdCargo().equals(poData.getIdCargo())) {
                LOG.info("[FSI] Objeto modificado : {}", oCargoEmpleado);
                oCargoEmpleado.setIdCargo(poData.getIdCargo());
                oCargoEmpleado.setNombCargo(poData.getNombCargo());

                break;
            }
        }
    }

    @Override
    public void eliminarAlmacenCIC(String pId) {
        LOG.info("[FSI] Start eliminarAlmacenCIC : {}", pId);
        Iterator<CECargoEmpleado> oIt = oHsData.iterator();
        while (oIt.hasNext()) {
            oCargoEmpleado = new CECargoEmpleado();
            oCargoEmpleado = oIt.next();
            LOG.info("[FSI] Objeto asignado : {}", oCargoEmpleado);

            if (oCargoEmpleado.getIdCargo().equals(pId)) {
                LOG.info("[FSI] Objeto Elimnado : {}", oCargoEmpleado);
                oHsData.remove(oCargoEmpleado);
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
