package pe.unjfsc.almacen.java11.logical;

import java.util.HashSet;
import pe.unjfsc.almacen.java11.entity.CEProducto;

public class CLVariacionProducto {

    public Object[][] convertHashSetArray(HashSet<CEProducto> poHsData) {

        String[][] aDataResponse = new String[poHsData.size()][13];
        int iRow = 0;
        for (CEProducto oItem : poHsData) {
            aDataResponse[iRow][0] = oItem.getIdProducto();
            aDataResponse[iRow][1] = oItem.getNombProd();
            aDataResponse[iRow][2] = oItem.getDescProd();
            aDataResponse[iRow][3] = oItem.getIdCategoria();
            aDataResponse[iRow][4] = oItem.getIdSabor();
            aDataResponse[iRow][5] = oItem.getIdMarca();
            aDataResponse[iRow][6] = String.valueOf(oItem.getPesoProd());
            aDataResponse[iRow][7] = oItem.getIdUnidadM();
            aDataResponse[iRow][8] = String.valueOf(oItem.getPresxe());
            aDataResponse[iRow][9] = oItem.getUndpxc();
            aDataResponse[iRow][10] = oItem.getIdEmpaque();
            aDataResponse[iRow][11] = String.valueOf(oItem.getUnidad());
            aDataResponse[iRow][12] = oItem.getImagProd();

            iRow++;
        }
        return aDataResponse;
    }
}
