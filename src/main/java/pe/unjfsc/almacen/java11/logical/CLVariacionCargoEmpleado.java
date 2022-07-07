package pe.unjfsc.almacen.java11.logical;

import java.util.HashSet;
import pe.unjfsc.almacen.java11.entity.CECargoEmpleado;

public class CLVariacionCargoEmpleado {

    public Object[][] convertHashSetArray(HashSet<CECargoEmpleado> poHsData) {

        String[][] aDataResponse = new String[poHsData.size()][2];
        int iRow = 0;
        for (CECargoEmpleado oItem : poHsData) {
            aDataResponse[iRow][0] = oItem.getIdCargo();
            aDataResponse[iRow][1] = oItem.getNombCargo();

            iRow++;
        }
        return aDataResponse;
    }
}
