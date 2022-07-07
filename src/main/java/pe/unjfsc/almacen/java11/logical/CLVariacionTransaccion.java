package pe.unjfsc.almacen.java11.logical;

import java.util.HashSet;
import pe.unjfsc.almacen.java11.entity.CETransaccion;

public class CLVariacionTransaccion {

    public Object[][] convertHashSetArray(HashSet<CETransaccion> poHsData) {

        String[][] aDataResponse = new String[poHsData.size()][5];
        int iRow = 0;
        for (CETransaccion oItem : poHsData) {
            aDataResponse[iRow][0] = oItem.getIdTransaccion();
            aDataResponse[iRow][1] = oItem.getIdAlmacen();
            aDataResponse[iRow][2] = oItem.getIdProducto();
            aDataResponse[iRow][3] = oItem.getIdEmpleado();
            aDataResponse[iRow][4] = oItem.getIdEstado();

            iRow++;
        }
        return aDataResponse;
    }
}
