package Tienda.Empleados;

import Tienda.Producto.Postre;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cocinero extends Empleado{
    public List<Postre>productos_hechos;

    public Cocinero(String id, String nombre, String apellido, String telefono, String correo, String direccion, Date fechNac) {
        super(id, nombre, apellido, telefono, correo, direccion, fechNac);
        this.productos_hechos = new ArrayList<Postre>();
    }

    public void Productos_Hechos (){
        System.out.println("Productos hechos de: " + super.getNombre());
        for (Postre c:this.productos_hechos) {
            System.out.println(c.cantidad +" - " + c.nombre + " " + c.mi_sucursal + "" + c.fecha_creacion.getDate() + "/"+(c.fecha_creacion.getMonth()+1) + "/"+c.fecha_creacion.getYear());
        }
    }

}
