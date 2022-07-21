package pe.unjfsc.almacen.java11.logical;

import java.util.HashSet;
import pe.unjfsc.almacen.java11.entity.CEProducto;

public class CLVariacionProducto {

    public Object[][] convertHashSetArray(HashSet<CEProducto> poHsData) {

        String[][] aDataResponse = new String[poHsData.size()][13];
        int iRow = 0;
        for (CEProducto oItem : poHsData) {
            aDataResponse[iRow][0] = String.valueOf(oItem.getIdProducto());
            aDataResponse[iRow][1] = oItem.getNombProd();
            aDataResponse[iRow][2] = oItem.getDescProd();
            aDataResponse[iRow][3] = String.valueOf(oItem.getIdCategoria());
            aDataResponse[iRow][4] = String.valueOf(oItem.getIdSabor());
            aDataResponse[iRow][5] = String.valueOf(oItem.getIdMarca());
            aDataResponse[iRow][6] = String.valueOf(oItem.getPesoProd());
            aDataResponse[iRow][7] = String.valueOf(oItem.getIdUnidadM());
            aDataResponse[iRow][8] = String.valueOf(oItem.getPresxe());
            aDataResponse[iRow][9] = oItem.getUndpxc();
            aDataResponse[iRow][10] = String.valueOf(oItem.getIdEmpaque());
            aDataResponse[iRow][11] = String.valueOf(oItem.getUnidad());
            aDataResponse[iRow][12] = oItem.getImagProd();

            iRow++;
        }
        return aDataResponse;
    }
}
