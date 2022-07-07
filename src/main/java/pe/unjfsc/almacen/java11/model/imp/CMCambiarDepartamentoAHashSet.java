package pe.unjfsc.almacen.java11.model.imp;

import java.util.HashSet;
import java.util.Iterator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.unjfsc.almacen.java11.entity.CEDepartamentoAlmacen;
import pe.unjfsc.almacen.java11.model.CICambioAlmacen;

public class CMCambiarDepartamentoAHashSet implements CICambioAlmacen<CEDepartamentoAlmacen> {

    private static final Logger LOG = LoggerFactory.getLogger(CEDepartamentoAlmacen.class);

    private HashSet<CEDepartamentoAlmacen> oHsData;

    private CEDepartamentoAlmacen oEmpleado;

    public CMCambiarDepartamentoAHashSet() {

        LOG.info("FSI] Start CMCambiarDepartamentoAHashSet before crear la instancia : ()", oHsData);
        oHsData = new HashSet<>();

        LOG.info("[FSI] Count del HashSet :", oHsData.isEmpty());
        oHsData.add(new CEDepartamentoAlmacen("DPT001", "LIMA REGIÓN"));
        oHsData.add(new CEDepartamentoAlmacen("DPT002", "LAMBAYEQUE"));

        LOG.info("[FSI] After - Count del HashSet : {}", oHsData.size());

    }

    @Override
    public void saveAlmacenCIC(CEDepartamentoAlmacen poData) {
        LOG.info("[FSI] Start saveAlmacenCIC : ", oEmpleado);
        oHsData.add(new CEDepartamentoAlmacen(poData.getidDepartamento(), poData.getNombDepa()));

    }

    @Override
    public void modificarAlmacenCIC(CEDepartamentoAlmacen poData) {
        LOG.info("[FSI] Start modificarAlmacenCIC : {}", poData.getidDepartamento());
        Iterator<CEDepartamentoAlmacen> oIt = oHsData.iterator();
        while (oIt.hasNext()) {
            oEmpleado = new CEDepartamentoAlmacen();
            oEmpleado = oIt.next();
            LOG.info("[FSI] Objeto asignado : {}", oEmpleado);

            if (oEmpleado.getidDepartamento().equals(poData.getidDepartamento())) {
                LOG.info("[FSI] Objeto modificado : {}", oEmpleado);
                oEmpleado.setNombDepa(poData.getNombDepa());

                break;
            }
        }
    }

    @Override
    public void eliminarAlmacenCIC(String pId) {

        LOG.info("[FSI] Start eliminarAlmacenCIC : {}", pId);
        Iterator<CEDepartamentoAlmacen> oIt = oHsData.iterator();
        while (oIt.hasNext()) {
            oEmpleado = new CEDepartamentoAlmacen();
            oEmpleado = oIt.next();
            LOG.info("[FSI] Objeto asignado : {}", oEmpleado);

            if (oEmpleado.getidDepartamento().equals(pId)) {
                LOG.info("[FSI] Objeto Elimnado : {}", oEmpleado);
                oHsData.remove(oEmpleado);
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
