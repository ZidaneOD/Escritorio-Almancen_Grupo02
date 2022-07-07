package pe.unjfsc.almacen.java11.logical;

import java.util.HashSet;
import pe.unjfsc.almacen.java11.entity.CECategoriaProducto;

public class CLVariacionCategoriaProducto {

    public Object[][] convertHashSetArray(HashSet<CECategoriaProducto> poHsData) {

        String[][] aDataResponse = new String[poHsData.size()][2];
        int iRow = 0;
        for (CECategoriaProducto oItem : poHsData) {
            aDataResponse[iRow][0] = oItem.getIdCategoria();
            aDataResponse[iRow][1] = oItem.getNombCate();

            iRow++;
        }
        return aDataResponse;
    }
}
