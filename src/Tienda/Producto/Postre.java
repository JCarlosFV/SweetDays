package Tienda.Producto;

import Tienda.Empleados.Cocinero;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Postre implements Comparable<Postre> {
    public String id;
    public String nombre;
    public String descripcion;
    public double precio;
    public int cantidad;
    public Date fecha_creacion;
    public String mi_sucursal;
    public Cocinero mi_creador;
    public List<Insumo> receta;

    public Postre(String id, String nombre, String descripcion, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cantidad = 0;
        this.precio = precio;
        this.receta = new ArrayList<Insumo>();
    }

    public void Receta (Insumo insumos,int cantidad){
        insumos.cantidades = cantidad;
        this.receta.add(insumos);
        insumos.setMi_postre(this);
    }

    public void Ingredientes (){
        System.out.println("Ingredientes de la Receta: " + this.nombre);
        for (Insumo c:this.receta) {
            System.out.println(c.id +" - " + c.nombre + " " + c.cantidades );
        }
    }

    public Cocinero getMi_creador() {
        return mi_creador;
    }

    public void setMi_creador(Cocinero mi_creador) {
        this.mi_creador = mi_creador;
    }

    @Override
    public int compareTo(Postre t) {
        return fecha_creacion.compareTo(t.fecha_creacion);
    }
}
