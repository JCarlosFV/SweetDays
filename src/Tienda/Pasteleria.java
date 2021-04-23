package Tienda;

import Tienda.Producto.Insumo;
import Tienda.Producto.Postre;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pasteleria {
    public String nombre;
    public String telefono;
    public String correo;
    public List <Insumo> insumos_gastados;
    public List<Sucursal> sucursales;
    public List<Postre> ventas;

    public Pasteleria(String nombre, String telefono, String correo) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.sucursales = new ArrayList<Sucursal>();
        this.ventas = new ArrayList<Postre>();
        this.insumos_gastados = new ArrayList<Insumo>();
    }

    public void sucursales (Sucursal sucursal){
        this.sucursales.add(sucursal);
        sucursal.setMi_pasteleria(this);
    }

    public void Ventas_generales (){
        String a = "";
        System.out.println("\n"+"Ventas Generales de todas las tiendas: " + this.nombre +" **********************************************************"+ "\n");
        Collections.sort(this.ventas);
        for (Postre c: this.ventas) {
            switch (c.fecha_creacion.getMonth()){
                case 0: a = "Enero";
                    break;
                case 1: a = "Febrero";
                    break;
                case 2: a = "Marzo";
                    break;
                case 3: a = "Abril";
                    break;
                case 4: a = "Mayo";
                    break;
                case 5: a = "Junio";
                    break;
                case 6: a = "Julio";
                    break;
                case 7: a = "Agosto";
                    break;
                case 8: a = "Septiembre";
                    break;
                case 9: a = "Octubre";
                    break;
                case 10: a = "Noviembre";
                    break;
                case 11: a = "Diciembre";
                    break;
            }
            System.out.println(c.fecha_creacion.getDate() +" de "+ a +" del "+ c.fecha_creacion.getYear()+" - (ID:" + c.id + ") " + c.nombre + " " + c.cantidad + " | Unit." + c.precio + " | Lps." + c.cantidad*c.precio + " -------> " + c.getMi_creador().getSucursal().get(0).nombre);
        }
        System.out.println("\n"+"***********************************************************************************************************"+"\n");
    }

    public void Ventas_sucursal(Sucursal s){
        String a = "";
        System.out.println("\n"+"Ventas de la tienda: " + s.nombre+" **********************************************************"+ "\n");
        Collections.sort(s.ventas_Sucursal);
        for (Postre c: s.ventas_Sucursal) {
            switch (c.fecha_creacion.getMonth()){
                case 0: a = "Enero";
                    break;
                case 1: a = "Febrero";
                    break;
                case 2: a = "Marzo";
                    break;
                case 3: a = "Abril";
                    break;
                case 4: a = "Mayo";
                    break;
                case 5: a = "Junio";
                    break;
                case 6: a = "Julio";
                    break;
                case 7: a = "Agosto";
                    break;
                case 8: a = "Septiembre";
                    break;
                case 9: a = "Octubre";
                    break;
                case 10: a = "Noviembre";
                    break;
                case 11: a = "Diciembre";
                    break;
            }
            System.out.println(c.fecha_creacion.getDate() +" de "+ a +" del "+ c.fecha_creacion.getYear()+" - (ID:" + c.id + ") " + c.nombre + " " + c.cantidad + " | Unit." + c.precio + " | Lps." + c.cantidad*c.precio);
        }
        System.out.println("\n"+"***********************************************************************************************************"+"\n");
    }

    public void Busqueda_Mes_Año(int Mes,int año){
        String a = "";
        System.out.println("\n"+"Resultados de Busqueda del "+ Mes +"/"+ año +" **********************************************************"+ "\n");
        Collections.sort(this.ventas);
        for (Postre c: this.ventas) {
            if ((c.fecha_creacion.getMonth()+1)== Mes && c.fecha_creacion.getYear()== año){
                switch (c.fecha_creacion.getMonth()){
                    case 0: a = "Enero";
                        break;
                    case 1: a = "Febrero";
                        break;
                    case 2: a = "Marzo";
                        break;
                    case 3: a = "Abril";
                        break;
                    case 4: a = "Mayo";
                        break;
                    case 5: a = "Junio";
                        break;
                    case 6: a = "Julio";
                        break;
                    case 7: a = "Agosto";
                        break;
                    case 8: a = "Septiembre";
                        break;
                    case 9: a = "Octubre";
                        break;
                    case 10: a = "Noviembre";
                        break;
                    case 11: a = "Diciembre";
                        break;
                }
                System.out.println(a +"-"+ c.fecha_creacion.getYear()+" - (ID:" + c.id + ") " + c.nombre + " " + c.cantidad + " | Unit." + c.precio + " | Lps." + c.cantidad*c.precio + " -------> " + c.getMi_creador().getSucursal().get(0).nombre);
            }
        }
        System.out.println("\n"+"***********************************************************************************************************"+"\n");
    }
    public void consumo_insumos(){
        String a = "";
        System.out.println("\n"+"Insumos Consumidos"+" **********************************************************"+ "\n");
        Collections.sort(this.insumos_gastados);

        for (Insumo c: this.insumos_gastados) {
            switch (c.fecha_utilizacion.getMonth()){
                case 0: a = "Enero";
                    break;
                case 1: a = "Febrero";
                    break;
                case 2: a = "Marzo";
                    break;
                case 3: a = "Abril";
                    break;
                case 4: a = "Mayo";
                    break;
                case 5: a = "Junio";
                    break;
                case 6: a = "Julio";
                    break;
                case 7: a = "Agosto";
                    break;
                case 8: a = "Septiembre";
                    break;
                case 9: a = "Octubre";
                    break;
                case 10: a = "Noviembre";
                    break;
                case 11: a = "Diciembre";
                    break;
            }
            System.out.println(c.getMi_postre().fecha_creacion.getDate() + " de " + a  +" del " + c.getMi_postre().fecha_creacion.getYear() + " - (" + c.mi_postre.getMi_creador().getSucursal().get(0).nombre + ") " + c.nombre + " " + c.cantidades);
        }
        System.out.println("\n"+"***********************************************************************************************************"+"\n");
    }
}
