
package pe.unjfsc.almacen.java11.entity;

public class CESDetalle {
    private int idkardex;
    private int idporducto;

    public CESDetalle(int idkardex, int idporducto) {
        this.idkardex = idkardex;
        this.idporducto = idporducto;
    }

    public CESDetalle() {
    }

    public int getIdkardex() {
        return idkardex;
    }

    public void setIdkardex(int idkardex) {
        this.idkardex = idkardex;
    }

    public int getIdporducto() {
        return idporducto;
    }

    public void setIdporducto(int idporducto) {
        this.idporducto = idporducto;
    }
}
