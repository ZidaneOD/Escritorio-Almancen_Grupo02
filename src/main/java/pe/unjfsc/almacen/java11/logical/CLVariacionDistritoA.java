package pe.unjfsc.almacen.java11.logical;

import java.util.HashSet;
import pe.unjfsc.almacen.java11.entity.CEDistritoAlmacen;

public class CLVariacionDistritoA {

    public Object[][] convertHashSetArray(HashSet<CEDistritoAlmacen> poHsData) {

        String[][] aDataResponse = new String[poHsData.size()][3];
        int iRow = 0;
        for (CEDistritoAlmacen oItem : poHsData) {
            aDataResponse[iRow][0] = oItem.getIdDistrito();
            aDataResponse[iRow][1] = oItem.getNombDistrito();
            aDataResponse[iRow][2] = oItem.getIdProvincia();
            iRow++;
        }
        return aDataResponse;
    }
}
