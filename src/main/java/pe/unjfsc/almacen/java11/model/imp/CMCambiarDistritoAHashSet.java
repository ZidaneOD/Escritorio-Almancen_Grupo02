package pe.unjfsc.almacen.java11.model.imp;

import java.util.HashSet;
import java.util.Iterator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.unjfsc.almacen.java11.entity.CEDistritoAlmacen;
import pe.unjfsc.almacen.java11.model.CICambioAlmacen;

public class CMCambiarDistritoAHashSet implements CICambioAlmacen<CEDistritoAlmacen> {

    private static final Logger LOG = LoggerFactory.getLogger(CEDistritoAlmacen.class);

    private HashSet<CEDistritoAlmacen> oHsData;

    private CEDistritoAlmacen oDistritoAlmacen;

    public CMCambiarDistritoAHashSet() {

        LOG.info("FSI] Start CMCambiarDistritoAHashSet before crear la instancia : ()", oHsData);
        oHsData = new HashSet<>();

        LOG.info("[FSI] Count del HashSet :", oHsData.isEmpty());
        oHsData.add(new CEDistritoAlmacen("DI001", "HUACHO", "HUAURA"));
        oHsData.add(new CEDistritoAlmacen("DI002", "SANTA MARIA", "HUAURA"));

        LOG.info("[FSI] After - Count del HashSet : {}", oHsData.size());
    }

    @Override
    public void saveAlmacenCIC(CEDistritoAlmacen poData) {
        LOG.info("[FSI] Start saveAlmacenCIC : ", oDistritoAlmacen);
        oHsData.add(new CEDistritoAlmacen(poData.getIdDistrito(), poData.getNombDistrito(), poData.getIdProvincia()));

    }

    @Override
    public void modificarAlmacenCIC(CEDistritoAlmacen poData) {

        LOG.info("[FSI] Start modificarAlmacenCIC : {}", poData.getIdDistrito());
        Iterator<CEDistritoAlmacen> oIt = oHsData.iterator();
        while (oIt.hasNext()) {
            oDistritoAlmacen = new CEDistritoAlmacen();
            oDistritoAlmacen = oIt.next();
            LOG.info("[FSI] Objeto asignado : {}", oDistritoAlmacen);

            if (oDistritoAlmacen.getIdDistrito().equals(poData.getIdDistrito())) {
                LOG.info("[FSI] Objeto modificado : {}", oDistritoAlmacen);
                oDistritoAlmacen.setIdDistrito(poData.getIdDistrito());
                oDistritoAlmacen.setNombDistrito(poData.getNombDistrito());
                oDistritoAlmacen.setIdProvincia(poData.getIdProvincia());

                break;
            }
        }

    }

    @Override
    public void eliminarAlmacenCIC(String pId) {

             LOG.info("[FSI] Start eliminarAlmacenCIC : {}", pId);
        Iterator<CEDistritoAlmacen> oIt = oHsData.iterator();
        while (oIt.hasNext()) {
            oDistritoAlmacen = new CEDistritoAlmacen();
            oDistritoAlmacen = oIt.next();
            LOG.info("[FSI] Objeto asignado : {}", oDistritoAlmacen);

            if (oDistritoAlmacen.getIdDistrito().equals(pId)) {
                LOG.info("[FSI] Objeto Elimnado : {}", oDistritoAlmacen);
                oHsData.remove(oDistritoAlmacen);
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
