package pe.unjfsc.almacen.java11.model;

import java.util.HashSet;

public interface CICambioAlmacen<Objeto> {

    public void saveAlmacenCIC(Objeto objObjeto);

    public void modificarAlmacenCIC(Objeto objObjeto);

    public void eliminarAlmacenCIC(String poData);

    public HashSet<Object> consultAllAlmacenCIC();
}
