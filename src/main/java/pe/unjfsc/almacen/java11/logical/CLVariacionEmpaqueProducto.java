package pe.unjfsc.almacen.java11.logical;

import java.util.HashSet;
import pe.unjfsc.almacen.java11.entity.CEEmpaqueProducto;

public class CLVariacionEmpaqueProducto {

    public Object[][] convertHashSetArray(HashSet<CEEmpaqueProducto> poHsData) {

        String[][] aDataResponse = new String[poHsData.size()][2];
        int iRow = 0;
        for (CEEmpaqueProducto oItem : poHsData) {
            aDataResponse[iRow][0] = oItem.getIdEmpaque();
            aDataResponse[iRow][1] = oItem.getNombEmpa();

            iRow++;
        }
        return aDataResponse;
    }
}
