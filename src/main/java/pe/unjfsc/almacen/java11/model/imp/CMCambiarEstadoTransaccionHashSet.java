package pe.unjfsc.almacen.java11.model.imp;

import java.util.HashSet;
import java.util.Iterator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.unjfsc.almacen.java11.entity.CEEstadoTransaccion;
import pe.unjfsc.almacen.java11.model.CICambioAlmacen;

public class CMCambiarEstadoTransaccionHashSet implements CICambioAlmacen<CEEstadoTransaccion> {

    private static final Logger LOG = LoggerFactory.getLogger(CEEstadoTransaccion.class);

    private HashSet<CEEstadoTransaccion> oHsData;

    private CEEstadoTransaccion oEstado;

    public CMCambiarEstadoTransaccionHashSet() {

        LOG.info("FSI] Start CMCambiarEstadoTransaccionHashSet before crear la instancia : ()", oHsData);
        oHsData = new HashSet<>();

        LOG.info("[FSI] Count del HashSet :", oHsData.isEmpty());
        oHsData.add(new CEEstadoTransaccion("ES001", "ACTIVO"));
        oHsData.add(new CEEstadoTransaccion("ES002", "BAJA"));

        LOG.info("[FSI] After - Count del HashSet : {}", oHsData.size());

    }

    @Override
    public void saveAlmacenCIC(CEEstadoTransaccion poData) {
        LOG.info("[FSI] Start saveAlmacenCIC : ", oEstado);
        oHsData.add(new CEEstadoTransaccion(poData.getIdEstado(), poData.getNombEstado()));
    }

    @Override
    public void modificarAlmacenCIC(CEEstadoTransaccion poData) {

        LOG.info("[FSI] Start modificarAlmacenCIC : {}", poData.getIdEstado());
        Iterator<CEEstadoTransaccion> oIt = oHsData.iterator();
        while (oIt.hasNext()) {
            oEstado = new CEEstadoTransaccion();
            oEstado = oIt.next();
            LOG.info("[FSI] Objeto asignado : {}", oEstado);

            if (oEstado.getIdEstado().equals(poData.getIdEstado())) {
                LOG.info("[FSI] Objeto modificado : {}", oEstado);
                oEstado.setIdEstado(poData.getIdEstado());
                oEstado.setNombEstado(poData.getNombEstado());

                break;
            }
        }
    }

    @Override
    public void eliminarAlmacenCIC(String pId) {

        LOG.info("[FSI] Start eliminarAlmacenCIC : {}", pId);
        Iterator<CEEstadoTransaccion> oIt = oHsData.iterator();
        while (oIt.hasNext()) {
            oEstado = new CEEstadoTransaccion();
            oEstado = oIt.next();
            LOG.info("[FSI] Objeto asignado : {}", oEstado);

            if (oEstado.getIdEstado().equals(pId)) {
                LOG.info("[FSI] Objeto Elimnado : {}", oEstado);
                oHsData.remove(oEstado);
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
