package Tienda.Empleados;

import Tienda.Cliente;
import Tienda.Producto.Insumo;
import Tienda.Producto.Postre;
import Tienda.Sucursal;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Vendedor extends Empleado{

    public List <Cliente> clientes_atendidos;
    public List<Postre> productos_vendidos;

    public Vendedor(String id, String nombre, String apellido, String telefono, String correo, String direccion, Date fechNac) {
        super(id, nombre, apellido, telefono, correo, direccion, fechNac);
        this.productos_vendidos = new ArrayList<Postre>();
        this.clientes_atendidos = new ArrayList<Cliente>();
    }

    public void asignar_cliente (Cliente cliente){
        this.clientes_atendidos.add(cliente);
    }

    public void asignar_orden (int cantidad, Postre pedido_cliente,Cocinero cocinero_asginado, Date fecha){

        pedido_cliente.cantidad = cantidad;
        pedido_cliente.fecha_creacion = fecha;

        pedido_cliente.mi_sucursal = getSucursal().get(0).nombre;

        this.productos_vendidos.add(pedido_cliente);
        cocinero_asginado.productos_hechos.add(pedido_cliente);

        for (Insumo b: pedido_cliente.receta) {
            b.cantidades = b.cantidades* pedido_cliente.cantidad;
            b.fecha_utilizacion = fecha;
        }

        getMi_superior().getSucursal().get(0).ventas_Sucursal.add(pedido_cliente);
        getMi_superior().getSucursal().get(0).getMi_pasteleria().insumos_gastados.addAll(pedido_cliente.receta);
        getMi_superior().getSucursal().get(0).getMi_pasteleria().ventas.add(pedido_cliente);

        pedido_cliente.setMi_creador(cocinero_asginado);
    }

    public void Productos_vendidos (){
        System.out.println("Productos vendidos de: " + super.getNombre());
        for (Postre c:this.productos_vendidos) {
            System.out.println(c.cantidad +" - " + c.nombre +" " + c.mi_sucursal + " " + c.fecha_creacion.getDate() + "/"+(c.fecha_creacion.getMonth()+1) + "/"+c.fecha_creacion.getYear());
        }
    }

}
