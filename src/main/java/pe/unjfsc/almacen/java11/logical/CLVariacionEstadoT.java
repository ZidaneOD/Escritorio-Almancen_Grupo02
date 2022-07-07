package pe.unjfsc.almacen.java11.logical;

import java.util.HashSet;
import pe.unjfsc.almacen.java11.entity.CEEstadoTransaccion;

public class CLVariacionEstadoT {

    public Object[][] convertHashSetArray(HashSet<CEEstadoTransaccion> poHsData) {

        String[][] aDataResponse = new String[poHsData.size()][2];
        int iRow = 0;
        for (CEEstadoTransaccion oItem : poHsData) {
            aDataResponse[iRow][0] = oItem.getIdEstado();
            aDataResponse[iRow][1] = oItem.getNombEstado();

            iRow++;
        }
        return aDataResponse;
    }
}
