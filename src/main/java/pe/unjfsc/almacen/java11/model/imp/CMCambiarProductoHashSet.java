package pe.unjfsc.almacen.java11.model.imp;

import java.util.HashSet;
import java.util.Iterator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.unjfsc.almacen.java11.entity.CEProducto;
import pe.unjfsc.almacen.java11.model.CICambioAlmacen;

public class CMCambiarProductoHashSet implements CICambioAlmacen<CEProducto> {

    private static final Logger LOG = LoggerFactory.getLogger(CEProducto.class);

    private HashSet<CEProducto> oHsData;

    private CEProducto oProducto;

    public CMCambiarProductoHashSet() {
        LOG.info("FSI] Start CMCambiarProductoHashSet before crear la instancia : ()", oHsData);
        oHsData = new HashSet<>();

        LOG.info("[FSI] Count del HashSet :", oHsData.isEmpty());
        
        oHsData.add(new CEProducto("93132401", "TURBO", "MAX", "CA001", "S005", "MR001", 65.0, "UN002", 30, "UND", "EM001", 1, System.getProperty("user.dir") + "\\src\\main\\resources\\productos_de_almacen\\TURBO.PNG"));
        oHsData.add(new CEProducto("79088558", "FRIO RICO", "CON ALMENDRA", "CA003", "S002", "MR001", 93.0, "UN002", 15, "UND", "EM001", 1, System.getProperty("user.dir") + "\\src\\main\\resources\\productos_de_almacen\\FRIO_RICO.PNG"));

        LOG.info("[FSI] After - Count del HashSet : {}", oHsData.size());
    }

    @Override
    public void saveAlmacenCIC(CEProducto poData) {

        LOG.info("[FSI] Start saveAlmacenCIC : ", oProducto);
        oHsData.add(new CEProducto(poData.getIdProducto(), poData.getNombProd(), poData.getDescProd(), poData.getIdCategoria(),
                poData.getIdSabor(), poData.getIdMarca(), poData.getPesoProd(), poData.getIdUnidadM(),
                poData.getPresxe(), poData.getUndpxc(), poData.getIdEmpaque(), poData.getUnidad(), poData.getImagProd()));
    }

    @Override
    public void modificarAlmacenCIC(CEProducto poData) {

        LOG.info("[FSI] Start modificarAlmacenCIC : {}", poData.getIdProducto());
        Iterator<CEProducto> oIt = oHsData.iterator();
        while (oIt.hasNext()) {
            oProducto = new CEProducto();
            oProducto = oIt.next();
            LOG.info("[FSI] Objeto asignado : {}", oProducto);

            if (oProducto.getIdProducto().equals(poData.getIdProducto())) {
                LOG.info("[FSI] Objeto modificado : {}", oProducto);
                oProducto.setIdProducto(poData.getIdProducto());
                oProducto.setNombProd(poData.getNombProd());
                oProducto.setDescProd(poData.getDescProd());
                oProducto.setIdCategoria(poData.getIdCategoria());
                oProducto.setIdSabor(poData.getIdSabor());
                oProducto.setIdMarca(poData.getIdMarca());
                oProducto.setPesoProd(poData.getPesoProd());
                oProducto.setIdUnidadM(poData.getIdUnidadM());
                oProducto.setPresxe(poData.getPresxe());
                oProducto.setUndpxc(poData.getUndpxc());
                oProducto.setIdEmpaque(poData.getIdEmpaque());
                oProducto.setUnidad(poData.getUnidad());
                oProducto.setImagProd(poData.getImagProd());

                break;
            }
        }
    }

    @Override
    public void eliminarAlmacenCIC(String pId) {
        LOG.info("[FSI] Start eliminarAlmacenCIC : {}", pId);
        Iterator<CEProducto> oIt = oHsData.iterator();
        while (oIt.hasNext()) {
            oProducto = new CEProducto();
            oProducto = oIt.next();
            LOG.info("[FSI] Objeto asignado : {}", oProducto);

            if (oProducto.getIdProducto().equals(pId)) {
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
