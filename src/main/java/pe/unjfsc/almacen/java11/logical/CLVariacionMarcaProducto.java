package pe.unjfsc.almacen.java11.logical;

import java.util.HashSet;
import pe.unjfsc.almacen.java11.entity.CEMarcaProducto;

public class CLVariacionMarcaProducto {

    public Object[][] convertHashSetArray(HashSet<CEMarcaProducto> poHsData) {

        String[][] aDataResponse = new String[poHsData.size()][2];
        int iRow = 0;
        for (CEMarcaProducto oItem : poHsData) {
            aDataResponse[iRow][0] = oItem.getIdMarca();
            aDataResponse[iRow][1] = oItem.getNombMarca();

            iRow++;
        }
        return aDataResponse;
    }
}
