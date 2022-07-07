package pe.unjfsc.almacen.java11.logical;

import java.util.HashSet;
import pe.unjfsc.almacen.java11.entity.CEUnidadMedidaProducto;

public class CLVariacionUnidadMedida {

    public Object[][] convertHashSetArray(HashSet<CEUnidadMedidaProducto> poHsData) {

        String[][] aDataResponse = new String[poHsData.size()][2];
        int iRow = 0;
        for (CEUnidadMedidaProducto oItem : poHsData) {
            aDataResponse[iRow][0] = oItem.getIdUnidadM();
            aDataResponse[iRow][1] = oItem.getNombUnid();

            iRow++;
        }
        return aDataResponse;
    }
}
