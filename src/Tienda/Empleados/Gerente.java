package Tienda.Empleados;

import Tienda.Producto.Postre;
import Tienda.Sucursal;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Gerente extends Empleado{
    private List<Empleado> empleados;
    private List<Sucursal> sucursal;

    public Gerente(String id, String nombre, String apellido, String telefono, String correo, String direccion, Date fechNac) {
        super(id, nombre, apellido, telefono, correo, direccion, fechNac);
        this.empleados = new ArrayList<Empleado>();
        this.sucursal = new ArrayList<Sucursal>();
    }

    @Override
    public List<Sucursal> getSucursal() {
        return sucursal;
    }

    public void setSucursal(List<Sucursal> sucursal) {
        this.sucursal = sucursal;
    }

    public void asignar_sucursal (Sucursal s){
            this.sucursal.add(s);
            s.setMi_gerente(this);
    }

    public void AsignarEmpleado (Empleado e,Sucursal s){
            e.setSucursal(s);
            this.empleados.add(e);
            e.setMi_superior(this);
    }

    public void setEmpleadoSalario(Empleado e, float s){
        if( this.getId() == e.getMi_superior().getId() ){
            e.salario = s;
        }else{
            System.out.println("No tiene Acceso");
        }
    }

    public void Ventas_empleado(Vendedor vendedor){
        System.out.println("\n" + "Productos vendidos por el empleado: " + vendedor.getNombre());
        for (Postre p: vendedor.productos_vendidos) {
            System.out.println(p.cantidad + " " + p.nombre + " " + p.fecha_creacion.getDate() + "/"+ (p.fecha_creacion.getMonth()+1) + "/" + p.fecha_creacion.getYear());
        }
    }

    public void Productos_hecho(Cocinero cocinero){
        System.out.println("\n" + "Productos hechos por el empleado: " + cocinero.getNombre());
        for (Postre p: cocinero.productos_hechos) {
            System.out.println(p.cantidad + " " + p.nombre + " " + p.fecha_creacion.getDate() + "/"+ (p.fecha_creacion.getMonth()+1) + "/" + p.fecha_creacion.getYear());
        }
    }

}
