package pe.unjfsc.almacen.java11.model.imp;

import java.util.HashSet;
import java.util.Iterator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.unjfsc.almacen.java11.entity.CETransaccion;
import pe.unjfsc.almacen.java11.model.CICambioAlmacen;

public class CMCambiarTransaccionHashSet implements CICambioAlmacen<CETransaccion> {

    private static final Logger LOG = LoggerFactory.getLogger(CETransaccion.class);

    private HashSet<CETransaccion> oHsData;

    private CETransaccion oTransaccion;

    public CMCambiarTransaccionHashSet() {
        LOG.info("FSI] Start CMCambiarCategoria before crear la instancia : ()", oHsData);
        oHsData = new HashSet<>();

        LOG.info("[FSI] Count del HashSet :", oHsData.isEmpty());
        oHsData.add(new CETransaccion("TRA001", "ALM01", "93132401", "EM01", "ES001"));
        oHsData.add(new CETransaccion("TRA002", "ALM01", "93132401", "EM01", "ES002"));

        LOG.info("[FSI] After - Count del HashSet : {}", oHsData.size());
    }

    @Override
    public void saveAlmacenCIC(CETransaccion poData) {

        LOG.info("[FSI] Start saveAlmacenCIC : ", oTransaccion);
        oHsData.add(new CETransaccion(poData.getIdTransaccion(), poData.getIdAlmacen(), poData.getIdProducto(),
                poData.getIdEmpleado(), poData.getIdEstado()));
    }

    @Override
    public void modificarAlmacenCIC(CETransaccion poData) {

        LOG.info("[FSI] Start modificarAlmacenCIC : {}", poData.getIdTransaccion());
        Iterator<CETransaccion> oIt = oHsData.iterator();
        while (oIt.hasNext()) {
            oTransaccion = new CETransaccion();
            oTransaccion = oIt.next();
            LOG.info("[FSI] Objeto asignado : {}", oTransaccion);

            if (oTransaccion.getIdTransaccion().equals(poData.getIdTransaccion())) {
                LOG.info("[FSI] Objeto modificado : {}", oTransaccion);
                oTransaccion.setIdTransaccion(poData.getIdTransaccion());
                oTransaccion.setIdAlmacen(poData.getIdAlmacen());
                oTransaccion.setIdProducto(poData.getIdProducto());
                oTransaccion.setIdEmpleado(poData.getIdEmpleado());
                oTransaccion.setIdEstado(poData.getIdEstado());

                break;
            }
        }
    }

    @Override
    public void eliminarAlmacenCIC(String pId) {

        LOG.info("[FSI] Start eliminarAlmacenCIC : {}", pId);
        Iterator<CETransaccion> oIt = oHsData.iterator();
        while (oIt.hasNext()) {
            oTransaccion = new CETransaccion();
            oTransaccion = oIt.next();
            LOG.info("[FSI] Objeto asignado : {}", oTransaccion);

            if (oTransaccion.getIdTransaccion().equals(pId)) {
                LOG.info("[FSI] Objeto Elimnado : {}", oTransaccion);
                oHsData.remove(oTransaccion);
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
