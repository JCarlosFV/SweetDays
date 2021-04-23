package Tienda;

import Tienda.Empleados.Gerente;
import Tienda.Producto.Postre;

import java.util.ArrayList;
import java.util.List;

public class Sucursal {
    public String nombre;
    public String direccion;
    public String telefono;
    private Gerente mi_gerente;
    private Pasteleria mi_pasteleria;
    public List<Postre> ventas_Sucursal;

    public Sucursal(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.ventas_Sucursal = new ArrayList<Postre>();
    }

    public Gerente getMi_gerente() {
        return mi_gerente;
    }

    public void setMi_gerente(Gerente mi_gerente) {
        this.mi_gerente = mi_gerente;
    }

    public Pasteleria getMi_pasteleria() {
        return mi_pasteleria;
    }

    public void setMi_pasteleria(Pasteleria mi_pasteleria) {
        this.mi_pasteleria = mi_pasteleria;
    }

}
