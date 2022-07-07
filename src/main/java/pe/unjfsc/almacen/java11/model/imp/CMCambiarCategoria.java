package pe.unjfsc.almacen.java11.model.imp;

import java.util.HashSet;
import java.util.Iterator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.unjfsc.almacen.java11.entity.CECategoriaProducto;
import pe.unjfsc.almacen.java11.model.CICambioAlmacen;

public class CMCambiarCategoria implements CICambioAlmacen<CECategoriaProducto> {

    private static final Logger LOG = LoggerFactory.getLogger(CMCambiarCategoria.class);

    private HashSet<CECategoriaProducto> oHsData;

    private CECategoriaProducto oCategoriaProducto;

    public CMCambiarCategoria() {
        LOG.info("FSI] Start CMCambiarCategoria before crear la instancia : ()", oHsData);
        oHsData = new HashSet<>();

        LOG.info("[FSI] Count del HashSet :", oHsData.isEmpty());
        oHsData.add(new CECategoriaProducto("ALM01", "HELADOS"));
        oHsData.add(new CECategoriaProducto("ALM01", "INSUMOS"));

        LOG.info("[FSI] After - Count del HashSet : {}", oHsData.size());

    }

    @Override
    public void saveAlmacenCIC(CECategoriaProducto poData) {
        LOG.info("[FSI] Start saveAlmacenCIC : ", oCategoriaProducto);
        oHsData.add(new CECategoriaProducto(poData.getIdCategoria(), poData.getNombCate()));

    }

    @Override
    public void modificarAlmacenCIC(CECategoriaProducto poData) {
        LOG.info("[FSI] Start modificarAlmacenCIC : {}", poData.getIdCategoria());
        Iterator<CECategoriaProducto> oIt = oHsData.iterator();
        while (oIt.hasNext()) {
            oCategoriaProducto = new CECategoriaProducto();
            oCategoriaProducto = oIt.next();
            LOG.info("[FSI] Objeto asignado : {}", oCategoriaProducto);

            if (oCategoriaProducto.getIdCategoria().equals(poData.getIdCategoria())) {
                LOG.info("[FSI] Objeto modificado : {}", oCategoriaProducto);
                oCategoriaProducto.setIdCategoria(poData.getIdCategoria());
                oCategoriaProducto.setNombCate(poData.getNombCate());

                break;
            }
        }
    }

    @Override
    public void eliminarAlmacenCIC(String pId) {
        LOG.info("[FSI] Start eliminarAlmacenCIC : {}", pId);
        Iterator<CECategoriaProducto> oIt = oHsData.iterator();
        while (oIt.hasNext()) {
            oCategoriaProducto = new CECategoriaProducto();
            oCategoriaProducto = oIt.next();
            LOG.info("[FSI] Objeto asignado : {}", oCategoriaProducto);

            if (oCategoriaProducto.getIdCategoria().equals(pId)) {
                LOG.info("[FSI] Objeto Elimnado : {}", oCategoriaProducto);
                oHsData.remove(oCategoriaProducto);
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
