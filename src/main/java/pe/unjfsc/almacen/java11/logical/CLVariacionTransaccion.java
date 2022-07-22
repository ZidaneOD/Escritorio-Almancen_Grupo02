package pe.unjfsc.almacen.java11.logical;

import java.util.HashSet;
import pe.unjfsc.almacen.java11.entity.CETransaccion;

public class CLVariacionTransaccion {

    public Object[][] convertHashSetArray(HashSet<CETransaccion> poHsData) {

        String[][] aDataResponse = new String[poHsData.size()][4];
        int iRow = 0;
        for (CETransaccion oItem : poHsData) {
            aDataResponse[iRow][0] = String.valueOf(oItem.getIdkardex());
            aDataResponse[iRow][1] = String.valueOf(oItem.getIdorigen());
            aDataResponse[iRow][2] = String.valueOf(oItem.getIddest());
            aDataResponse[iRow][3] = String.valueOf(oItem.getIdEmpleado());

            iRow++;
        }
        return aDataResponse;
    }
}
