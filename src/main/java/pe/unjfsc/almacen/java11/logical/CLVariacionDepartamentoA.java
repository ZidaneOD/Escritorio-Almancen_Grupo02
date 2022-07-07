package pe.unjfsc.almacen.java11.logical;

import java.util.HashSet;
import pe.unjfsc.almacen.java11.entity.CEDepartamentoAlmacen;

public class CLVariacionDepartamentoA {

    public Object[][] convertHashSetArray(HashSet<CEDepartamentoAlmacen> poHsData) {

        String[][] aDataResponse = new String[poHsData.size()][2];
        int iRow = 0;
        for (CEDepartamentoAlmacen oItem : poHsData) {
            aDataResponse[iRow][0] = oItem.getidDepartamento();
            aDataResponse[iRow][1] = oItem.getNombDepa();

            iRow++;
        }
        return aDataResponse;
    }
}
