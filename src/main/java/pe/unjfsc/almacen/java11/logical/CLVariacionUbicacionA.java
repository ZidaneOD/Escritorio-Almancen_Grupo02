package pe.unjfsc.almacen.java11.logical;

import java.util.HashSet;
import pe.unjfsc.almacen.java11.entity.CEUbicacionAlmacen;

public class CLVariacionUbicacionA {

    public Object[][] convertHashSetArray(HashSet<CEUbicacionAlmacen> poHsData) {

        String[][] aDataResponse = new String[poHsData.size()][3];
        int iRow = 0;
        for (CEUbicacionAlmacen oItem : poHsData) {
            aDataResponse[iRow][0] = oItem.getIdUbicacion();
            aDataResponse[iRow][1] = oItem.getNombUbic();
            aDataResponse[iRow][2] = oItem.getIdDistrito();

            iRow++;
        }
        return aDataResponse;
    }
}
