package pe.unjfsc.almacen.java11.model.imp;

import java.util.HashSet;
import java.util.Iterator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.unjfsc.almacen.java11.entity.CEProvinciaAlmacen;
import pe.unjfsc.almacen.java11.model.CICambioAlmacen;

public class CMCambiarProvinciaHashSet implements CICambioAlmacen<CEProvinciaAlmacen> {

    private static final Logger LOG = LoggerFactory.getLogger(CEProvinciaAlmacen.class);

    private HashSet<CEProvinciaAlmacen> oHsData;

    private CEProvinciaAlmacen oProvincia;

    public CMCambiarProvinciaHashSet() {

        LOG.info("FSI] Start CMCambiarProvinciaHashSet before crear la instancia : ()", oHsData);
        oHsData = new HashSet<>();

        LOG.info("[FSI] Count del HashSet :", oHsData.isEmpty());
        oHsData.add(new CEProvinciaAlmacen("PROV001", "HUAURA", "DPT001"));
        oHsData.add(new CEProvinciaAlmacen("PROV002", "HUARAL", "DPT001"));

        LOG.info("[FSI] After - Count del HashSet : {}", oHsData.size());
    }

    @Override
    public void saveAlmacenCIC(CEProvinciaAlmacen poData) {

        LOG.info("[FSI] Start saveAlmacenCIC : ", oProvincia);
        oHsData.add(new CEProvinciaAlmacen(poData.getIdProvincia(), poData.getNombProvincia(), poData.getIdDepartamento()));
    }

    @Override
    public void modificarAlmacenCIC(CEProvinciaAlmacen poData) {

        LOG.info("[FSI] Start modificarAlmacenCIC : {}", poData.getIdProvincia());
        Iterator<CEProvinciaAlmacen> oIt = oHsData.iterator();
        while (oIt.hasNext()) {
            oProvincia = new CEProvinciaAlmacen();
            oProvincia = oIt.next();
            LOG.info("[FSI] Objeto asignado : {}", oProvincia);

            if (oProvincia.getIdProvincia().equals(poData.getIdProvincia())) {
                LOG.info("[FSI] Objeto modificado : {}", oProvincia);
                oProvincia.setIdProvincia(poData.getIdProvincia());
                oProvincia.setNombProvincia(poData.getNombProvincia());
                oProvincia.setIdDepartamento(poData.getIdDepartamento());

                break;
            }
        }
    }

    @Override
    public void eliminarAlmacenCIC(String pId) {

        LOG.info("[FSI] Start eliminarAlmacenCIC : {}", pId);
        Iterator<CEProvinciaAlmacen> oIt = oHsData.iterator();
        while (oIt.hasNext()) {
            oProvincia = new CEProvinciaAlmacen();
            oProvincia = oIt.next();
            LOG.info("[FSI] Objeto asignado : {}", oProvincia);

            if (oProvincia.getIdProvincia().equals(pId)) {
                LOG.info("[FSI] Objeto Elimnado : {}", oProvincia);
                oHsData.remove(oProvincia);
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
