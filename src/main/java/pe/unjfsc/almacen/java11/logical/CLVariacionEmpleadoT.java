package pe.unjfsc.almacen.java11.logical;

import java.util.HashSet;

import pe.unjfsc.almacen.java11.entity.CEEmpleadoTransaccion;

public class CLVariacionEmpleadoT {

    public Object[][] convertHashSetArray(HashSet<CEEmpleadoTransaccion> poHsData) {

        String[][] aDataResponse = new String[poHsData.size()][8];
        int iRow = 0;
        for (CEEmpleadoTransaccion oItem : poHsData) {
            aDataResponse[iRow][0] = oItem.getIdEmpl();
            aDataResponse[iRow][1] = oItem.getDniEmpl();
            aDataResponse[iRow][2] = oItem.getNombEmpl();
            aDataResponse[iRow][3] = oItem.getApaEmpl();
            aDataResponse[iRow][4] = oItem.getAmaEmpl();
            aDataResponse[iRow][5] = oItem.getTelfEmpl();
            aDataResponse[iRow][6] = oItem.getMailEmpl();
            aDataResponse[iRow][7] = oItem.getIdCargo();

            iRow++;
        }
        return aDataResponse;
    }
}
