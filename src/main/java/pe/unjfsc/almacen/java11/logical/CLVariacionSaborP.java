package pe.unjfsc.almacen.java11.logical;

import java.util.HashSet;
import pe.unjfsc.almacen.java11.entity.CESaborProducto;

public class CLVariacionSaborP {

    public Object[][] convertHashSetArray(HashSet<CESaborProducto> poHsData) {

        String[][] aDataResponse = new String[poHsData.size()][2];
        int iRow = 0;
        for (CESaborProducto oItem : poHsData) {
            aDataResponse[iRow][0] = oItem.getIdSabor();
            aDataResponse[iRow][1] = oItem.getNombSabor();

            iRow++;
        }
        return aDataResponse;
    }
}
