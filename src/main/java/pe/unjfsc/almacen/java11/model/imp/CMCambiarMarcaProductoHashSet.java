package pe.unjfsc.almacen.java11.model.imp;

import java.util.HashSet;
import java.util.Iterator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.unjfsc.almacen.java11.entity.CEMarcaProducto;
import pe.unjfsc.almacen.java11.model.CICambioAlmacen;

public class CMCambiarMarcaProductoHashSet implements CICambioAlmacen<CEMarcaProducto> {

    private static final Logger LOG = LoggerFactory.getLogger(CEMarcaProducto.class);

    private HashSet<CEMarcaProducto> oHsData;

    private CEMarcaProducto oMarca;

    public CMCambiarMarcaProductoHashSet() {
        LOG.info("FSI] Start CMCambiarMarcaProductoHashSet before crear la instancia : ()", oHsData);
        oHsData = new HashSet<>();

        LOG.info("[FSI] Count del HashSet :", oHsData.isEmpty());
        oHsData.add(new CEMarcaProducto("MR001", "DONOFRIO"));
        oHsData.add(new CEMarcaProducto("MR002", "ALASKA"));
        oHsData.add(new CEMarcaProducto("MR003", " NESTLE"));

        LOG.info("[FSI] After - Count del HashSet : {}", oHsData.size());

    }

    @Override
    public void saveAlmacenCIC(CEMarcaProducto poData) {

        LOG.info("[FSI] Start saveAlmacenCIC : ", oMarca);
        oHsData.add(new CEMarcaProducto(poData.getIdMarca(), poData.getNombMarca()));
    }

    @Override
    public void modificarAlmacenCIC(CEMarcaProducto poData) {

        LOG.info("[FSI] Start modificarAlmacenCIC : {}", poData.getIdMarca());
        Iterator<CEMarcaProducto> oIt = oHsData.iterator();
        while (oIt.hasNext()) {
            oMarca = new CEMarcaProducto();
            oMarca = oIt.next();
            LOG.info("[FSI] Objeto asignado : {}", oMarca);

            if (oMarca.getIdMarca().equals(poData.getIdMarca())) {
                LOG.info("[FSI] Objeto modificado : {}", oMarca);
                oMarca.setIdMarca(poData.getIdMarca());
                oMarca.setNombMarca(poData.getNombMarca());

                break;
            }
        }
    }

    @Override
    public void eliminarAlmacenCIC(String pId) {

        LOG.info("[FSI] Start eliminarAlmacenCIC : {}", pId);
        Iterator<CEMarcaProducto> oIt = oHsData.iterator();
        while (oIt.hasNext()) {
            oMarca = new CEMarcaProducto();
            oMarca = oIt.next();
            LOG.info("[FSI] Objeto asignado : {}", oMarca);

            if (oMarca.getIdMarca().equals(pId)) {
                LOG.info("[FSI] Objeto Elimnado : {}", oMarca);
                oHsData.remove(oMarca);
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
