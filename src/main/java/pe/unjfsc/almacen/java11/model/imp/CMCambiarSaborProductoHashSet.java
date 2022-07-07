package pe.unjfsc.almacen.java11.model.imp;

import java.util.HashSet;
import java.util.Iterator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.unjfsc.almacen.java11.entity.CESaborProducto;
import pe.unjfsc.almacen.java11.model.CICambioAlmacen;

public class CMCambiarSaborProductoHashSet implements CICambioAlmacen<CESaborProducto> {

    private static final Logger LOG = LoggerFactory.getLogger(CESaborProducto.class);

    private HashSet<CESaborProducto> oHsData;

    private CESaborProducto oProducto;

    public CMCambiarSaborProductoHashSet() {

        LOG.info("FSI] Start CMCambiarSaborProductoHashSet before crear la instancia : ()", oHsData);
        oHsData = new HashSet<>();

        LOG.info("[FSI] Count del HashSet :", oHsData.isEmpty());
        oHsData.add(new CESaborProducto("S001", "CHOCOLATE"));
        oHsData.add(new CESaborProducto("S002", "VAINILLA"));

        LOG.info("[FSI] After - Count del HashSet : {}", oHsData.size());

    }

    @Override
    public void saveAlmacenCIC(CESaborProducto poData) {

        LOG.info("[FSI] Start saveAlmacenCIC : ", oProducto);
        oHsData.add(new CESaborProducto(poData.getIdSabor(), poData.getNombSabor()));
    }

    @Override
    public void modificarAlmacenCIC(CESaborProducto poData) {

        LOG.info("[FSI] Start modificarAlmacenCIC : {}", poData.getIdSabor());
        Iterator<CESaborProducto> oIt = oHsData.iterator();
        while (oIt.hasNext()) {
            oProducto = new CESaborProducto();
            oProducto = oIt.next();
            LOG.info("[FSI] Objeto asignado : {}", oProducto);

            if (oProducto.getIdSabor().equals(poData.getIdSabor())) {
                LOG.info("[FSI] Objeto modificado : {}", oProducto);
                oProducto.setIdSabor(poData.getIdSabor());
                oProducto.setNombSabor(poData.getNombSabor());

                break;
            }
        }
    }

    @Override
    public void eliminarAlmacenCIC(String pId) {

        LOG.info("[FSI] Start eliminarAlmacenCIC : {}", pId);
        Iterator<CESaborProducto> oIt = oHsData.iterator();
        while (oIt.hasNext()) {
            oProducto = new CESaborProducto();
            oProducto = oIt.next();
            LOG.info("[FSI] Objeto asignado : {}", oProducto);

            if (oProducto.getIdSabor().equals(pId)) {
                LOG.info("[FSI] Objeto Elimnado : {}", oProducto);
                oHsData.remove(oProducto);
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
