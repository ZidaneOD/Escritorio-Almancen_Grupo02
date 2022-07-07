package pe.unjfsc.almacen.java11.model.imp;

import java.util.HashSet;
import java.util.Iterator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.unjfsc.almacen.java11.entity.CEAlmacen;
import pe.unjfsc.almacen.java11.model.CICambioAlmacen;

public class CMCambiarAlmacen implements CICambioAlmacen<CEAlmacen> {

    private static final Logger LOG = LoggerFactory.getLogger(CMCambiarAlmacen.class);

    private HashSet<CEAlmacen> oHsData;

    private CEAlmacen oAlmacen;

    public CMCambiarAlmacen() {
        LOG.info("FSI] Start CMCambiarAlmacen before crear la instancia : ()", oHsData);
        oHsData = new HashSet<>();

        LOG.info("[FSI] Count del HashSet :", oHsData.isEmpty());
        oHsData.add(new CEAlmacen("ALM01", "HELADOS", "UB001"));
        oHsData.add(new CEAlmacen("ALM01", "INSUMOS", "UB002"));

        LOG.info("[FSI] After - Count del HashSet : {}", oHsData.size());

    }

    @Override
    public void saveAlmacenCIC(CEAlmacen poData) {
        LOG.info("[FSI] Start saveAlmacenCIC : ", oAlmacen);
        oHsData.add(new CEAlmacen(poData.getIdAlmacen(), poData.getNombAlm(), poData.getIdUbicacion()));

    }

    @Override
    public void modificarAlmacenCIC(CEAlmacen poData) {
        LOG.info("[FSI] Start modificarAlmacenCIC : {}", poData.getIdAlmacen());
        Iterator<CEAlmacen> oIt = oHsData.iterator();
        while (oIt.hasNext()) {
            oAlmacen = new CEAlmacen();
            oAlmacen = oIt.next();
            LOG.info("[FSI] Objeto asignado : {}", oAlmacen);

            if (oAlmacen.getIdAlmacen().equals(poData.getIdAlmacen())) {
                LOG.info("[FSI] Objeto modificado : {}", oAlmacen);
                oAlmacen.setIdAlmacen(poData.getIdAlmacen());
                oAlmacen.setNombAlm(poData.getNombAlm());
                oAlmacen.setIdUbicacion(poData.getIdUbicacion());

                break;
            }
        }
    }

    @Override
    public void eliminarAlmacenCIC(String pId) {
        LOG.info("[FSI] Start eliminarAlmacenCIC : {}", pId);
        Iterator<CEAlmacen> oIt = oHsData.iterator();
        while (oIt.hasNext()) {
            oAlmacen = new CEAlmacen();
            oAlmacen = oIt.next();
            LOG.info("[FSI] Objeto asignado : {}", oAlmacen);

            if (oAlmacen.getIdAlmacen().equals(pId)) {
                LOG.info("[FSI] Objeto Elimnado : {}", oAlmacen);
                oHsData.remove(oAlmacen);
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
