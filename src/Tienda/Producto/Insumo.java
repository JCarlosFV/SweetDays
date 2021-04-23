package Tienda.Producto;

import java.util.Date;

public class Insumo implements Comparable<Insumo>{
    public String id;
    public String nombre;
    public String descripcion;
    public int cantidades;
    public Date fecha_utilizacion;
    public Postre mi_postre;

    public Insumo(String id, String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Postre getMi_postre() {
        return mi_postre;
    }

    public void setMi_postre(Postre mi_postre) {
        this.mi_postre = mi_postre;
    }

    @Override
    public int compareTo(Insumo t) {
        return fecha_utilizacion.compareTo(t.fecha_utilizacion);
    }
}
