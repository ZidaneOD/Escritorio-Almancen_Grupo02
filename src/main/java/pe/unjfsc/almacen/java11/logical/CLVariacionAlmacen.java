package pe.unjfsc.almacen.java11.logical;

import java.util.HashSet;
import pe.unjfsc.almacen.java11.entity.CEAlmacen;

public class CLVariacionAlmacen {

    public Object[][] convertHashSetArray(HashSet<CEAlmacen> poHsData) {

        String[][] aDataResponse = new String[poHsData.size()][3];
        int iRow = 0;
        for (CEAlmacen oItem : poHsData) {
            aDataResponse[iRow][0] = oItem.getIdAlmacen();
            aDataResponse[iRow][1] = oItem.getNombAlm();
            aDataResponse[iRow][2] = oItem.getIdUbicacion();
            iRow++;
        }
        return aDataResponse;
    }
}
