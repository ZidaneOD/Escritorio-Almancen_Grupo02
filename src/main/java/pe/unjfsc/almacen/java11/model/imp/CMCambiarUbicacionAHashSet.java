package pe.unjfsc.almacen.java11.model.imp;

import java.util.HashSet;
import java.util.Iterator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.unjfsc.almacen.java11.entity.CEUbicacionAlmacen;
import pe.unjfsc.almacen.java11.model.CICambioAlmacen;

public class CMCambiarUbicacionAHashSet implements CICambioAlmacen<CEUbicacionAlmacen> {

    private static final Logger LOG = LoggerFactory.getLogger(CEUbicacionAlmacen.class);

    private HashSet<CEUbicacionAlmacen> oHsData;

    private CEUbicacionAlmacen oUbicacion;

    public CMCambiarUbicacionAHashSet() {
        LOG.info("FSI] Start CMCambiarCategoria before crear la instancia : ()", oHsData);
        oHsData = new HashSet<>();

        LOG.info("[FSI] Count del HashSet :", oHsData.isEmpty());
        oHsData.add(new CEUbicacionAlmacen("UB001", "ALMACEN A", "DI001"));
        oHsData.add(new CEUbicacionAlmacen("UB002", "ALMACEN B", "DI001"));

        LOG.info("[FSI] After - Count del HashSet : {}", oHsData.size());

    }

    @Override
    public void saveAlmacenCIC(CEUbicacionAlmacen poData) {

        LOG.info("[FSI] Start saveAlmacenCIC : ", oUbicacion);
        oHsData.add(new CEUbicacionAlmacen(poData.getIdUbicacion(), poData.getNombUbic(), poData.getIdDistrito()));
    }

    @Override
    public void modificarAlmacenCIC(CEUbicacionAlmacen poData) {

        LOG.info("[FSI] Start modificarAlmacenCIC : {}", poData.getIdUbicacion());
        Iterator<CEUbicacionAlmacen> oIt = oHsData.iterator();
        while (oIt.hasNext()) {
            oUbicacion = new CEUbicacionAlmacen();
            oUbicacion = oIt.next();
            LOG.info("[FSI] Objeto asignado : {}", oUbicacion);

            if (oUbicacion.getIdUbicacion().equals(poData.getIdUbicacion())) {
                LOG.info("[FSI] Objeto modificado : {}", oUbicacion);
                oUbicacion.setIdUbicacion(poData.getIdUbicacion());
                oUbicacion.setNombUbic(poData.getNombUbic());
                oUbicacion.setIdDistrito(poData.getIdDistrito());

                break;
            }
        }
    }

    @Override
    public void eliminarAlmacenCIC(String pId) {

        LOG.info("[FSI] Start eliminarAlmacenCIC : {}", pId);
        Iterator<CEUbicacionAlmacen> oIt = oHsData.iterator();
        while (oIt.hasNext()) {
            oUbicacion = new CEUbicacionAlmacen();
            oUbicacion = oIt.next();
            LOG.info("[FSI] Objeto asignado : {}", oUbicacion);

            if (oUbicacion.getIdUbicacion().equals(pId)) {
                LOG.info("[FSI] Objeto Elimnado : {}", oUbicacion);
                oHsData.remove(oUbicacion);
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
