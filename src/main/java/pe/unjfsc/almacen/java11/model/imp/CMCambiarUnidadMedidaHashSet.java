package pe.unjfsc.almacen.java11.model.imp;

import java.util.HashSet;
import java.util.Iterator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.unjfsc.almacen.java11.entity.CEUnidadMedidaProducto;
import pe.unjfsc.almacen.java11.model.CICambioAlmacen;

public class CMCambiarUnidadMedidaHashSet implements CICambioAlmacen<CEUnidadMedidaProducto> {

    private static final Logger LOG = LoggerFactory.getLogger(CEUnidadMedidaProducto.class);

    private HashSet<CEUnidadMedidaProducto> oHsData;

    private CEUnidadMedidaProducto oUnidadMedida;

    public CMCambiarUnidadMedidaHashSet() {
        LOG.info("FSI] Start CMCambiarUnidadMedidaHashSet before crear la instancia : ()", oHsData);
        oHsData = new HashSet<>();

        LOG.info("[FSI] Count del HashSet :", oHsData.isEmpty());
        oHsData.add(new CEUnidadMedidaProducto("UN001", "G"));
        oHsData.add(new CEUnidadMedidaProducto("UN002", "ML"));

        LOG.info("[FSI] After - Count del HashSet : {}", oHsData.size());

    }

    @Override
    public void saveAlmacenCIC(CEUnidadMedidaProducto poData) {

        LOG.info("[FSI] Start saveAlmacenCIC : ", oUnidadMedida);
        oHsData.add(new CEUnidadMedidaProducto(poData.getIdUnidadM(), poData.getNombUnid()));
    }

    @Override
    public void modificarAlmacenCIC(CEUnidadMedidaProducto poData) {

        LOG.info("[FSI] Start modificarAlmacenCIC : {}", poData.getIdUnidadM());
        Iterator<CEUnidadMedidaProducto> oIt = oHsData.iterator();
        while (oIt.hasNext()) {
            oUnidadMedida = new CEUnidadMedidaProducto();
            oUnidadMedida = oIt.next();
            LOG.info("[FSI] Objeto asignado : {}", oUnidadMedida);

            if (oUnidadMedida.getIdUnidadM().equals(poData.getIdUnidadM())) {
                LOG.info("[FSI] Objeto modificado : {}", oUnidadMedida);
                oUnidadMedida.setIdUnidadM(poData.getIdUnidadM());
                oUnidadMedida.setNombUnid(poData.getIdUnidadM());

                break;
            }
        }
    }

    @Override
    public void eliminarAlmacenCIC(String pId) {

        LOG.info("[FSI] Start eliminarAlmacenCIC : {}", pId);
        Iterator<CEUnidadMedidaProducto> oIt = oHsData.iterator();
        while (oIt.hasNext()) {
            oUnidadMedida = new CEUnidadMedidaProducto();
            oUnidadMedida = oIt.next();
            LOG.info("[FSI] Objeto asignado : {}", oUnidadMedida);

            if (oUnidadMedida.getIdUnidadM().equals(pId)) {
                LOG.info("[FSI] Objeto Elimnado : {}", oUnidadMedida);
                oHsData.remove(oUnidadMedida);
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
