package pe.unjfsc.almacen.java11.model;

import java.sql.ResultSet;


public interface CICambioAlmacen<Objeto> {

    public void saveAlmacenCIC(Objeto objObjeto) throws Exception;

    public void modificarAlmacenCIC(Objeto objObjeto)throws Exception ;

    public void eliminarAlmacenCIC(Objeto objObjeto) throws Exception ;

   public ResultSet buscar(Object objObject) throws Exception;
}
