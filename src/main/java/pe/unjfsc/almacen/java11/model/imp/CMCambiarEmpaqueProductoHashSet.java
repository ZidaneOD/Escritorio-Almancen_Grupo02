package pe.unjfsc.almacen.java11.model.imp;

import java.util.HashSet;
import java.util.Iterator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.unjfsc.almacen.java11.entity.CEEmpaqueProducto;
import pe.unjfsc.almacen.java11.model.CICambioAlmacen;

public class CMCambiarEmpaqueProductoHashSet implements CICambioAlmacen<CEEmpaqueProducto> {

    private static final Logger LOG = LoggerFactory.getLogger(CEEmpaqueProducto.class);

    private HashSet<CEEmpaqueProducto> oHsData;

    private CEEmpaqueProducto oEmpaqueProducto;

    public CMCambiarEmpaqueProductoHashSet() {

        LOG.info("FSI] Start CMCambiarEmpaqueProductoHashSet before crear la instancia : ()", oHsData);
        oHsData = new HashSet<>();

        LOG.info("[FSI] Count del HashSet :", oHsData.isEmpty());
        oHsData.add(new CEEmpaqueProducto("EM001", "CAJA"));
        oHsData.add(new CEEmpaqueProducto("EM002", "BOLSA"));

        LOG.info("[FSI] After - Count del HashSet : {}", oHsData.size());

    }

    @Override
    public void saveAlmacenCIC(CEEmpaqueProducto poData) {

          LOG.info("[FSI] Start saveAlmacenCIC : ", oEmpaqueProducto);
        oHsData.add(new CEEmpaqueProducto(poData.getIdEmpaque(), poData.getNombEmpa()));
    }

    @Override
    public void modificarAlmacenCIC(CEEmpaqueProducto poData) {

        LOG.info("[FSI] Start modificarAlmacenCIC : {}", poData.getIdEmpaque());
        Iterator<CEEmpaqueProducto> oIt = oHsData.iterator();
        while (oIt.hasNext()) {
            oEmpaqueProducto = new CEEmpaqueProducto();
            oEmpaqueProducto = oIt.next();
            LOG.info("[FSI] Objeto asignado : {}", oEmpaqueProducto);

            if (oEmpaqueProducto.getIdEmpaque().equals(poData.getIdEmpaque())) {
                LOG.info("[FSI] Objeto modificado : {}", oEmpaqueProducto);
                oEmpaqueProducto.setIdEmpaque(poData.getIdEmpaque());
                oEmpaqueProducto.setNombEmpa(poData.getNombEmpa());

                break;
            }
        }

    }

    @Override
    public void eliminarAlmacenCIC(String pId) {

        LOG.info("[FSI] Start eliminarAlmacenCIC : {}", pId);
        Iterator<CEEmpaqueProducto> oIt = oHsData.iterator();
        while (oIt.hasNext()) {
            oEmpaqueProducto = new CEEmpaqueProducto();
            oEmpaqueProducto = oIt.next();
            LOG.info("[FSI] Objeto asignado : {}", oEmpaqueProducto);

            if (oEmpaqueProducto.getIdEmpaque().equals(pId)) {
                LOG.info("[FSI] Objeto Elimnado : {}", oEmpaqueProducto);
                oHsData.remove(oEmpaqueProducto);
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
