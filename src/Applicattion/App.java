package Applicattion;

import Tienda.Cliente;
import Tienda.Empleados.Cocinero;
import Tienda.Empleados.Gerente;
import Tienda.Empleados.Vendedor;
import Tienda.Pasteleria;
import Tienda.Producto.Insumo;
import Tienda.Producto.Postre;
import Tienda.Sucursal;

import java.util.Calendar;
import java.util.Date;

public class App {
    public static void main(String[] args){

        //CREAMOS LA PASTELERIA Y SUS SUCURSALES
        Pasteleria SweetDays = new Pasteleria("SweetDays","22348266","sweetdays@gmail.com");

        Sucursal SweetDays_Tegucigalpa = new Sucursal("Sweet Days Tegucigalpa","Col.La pradera","22345611");
        Sucursal SweetDays_Copan = new Sucursal("Sweet Days Copan","Col. Nueva Esperanza","22332131");
        Sucursal SweetDays_SPS = new Sucursal("Sweet Days S.P.S","Col. Nueva Arcadia","22321321");

        SweetDays.sucursales(SweetDays_Tegucigalpa);
        SweetDays.sucursales(SweetDays_Copan);
        SweetDays.sucursales(SweetDays_SPS);

        //CREAMOS LOS EMPLEADOS
        Gerente g1 = new Gerente("0816199432987","Carlos David ","Velasquez","22341542","carlos01@gmail.com","Col.San Miguel",new Date(1994,5,12));
        Vendedor v1 = new Vendedor("0816200100289","Juan Carlos","Funez","97145532","jcfunez14@gmail.com","Col.Luis Andres",new Date(2001,6,19));
        Cocinero c1 = new Cocinero("1012199032321","Daniel","Ramirez Figueroa","33234521","Daniel08@yahoo.com","Col. Las Brisas",new Date(1990,11,01));
        Gerente g2 = new Gerente("0816199432923","Adam","Velasquez","89341542","ada01@gmail.com","Col.San Miguel",new Date(1991,6,15));
        Vendedor v2 = new Vendedor("0816200100245","Gerson","Avila","83145532","g1294@gmail.com","Col.Luis Andres",new Date(2000,9,20));
        Cocinero c2 = new Cocinero("1012199032367","Jesus","Rodriguez","22434521","jesul08@yahoo.com","Col. Las Brisas",new Date(1995,1,9));
        Gerente g3 = new Gerente("1816199433423","Lucia","Gonzales","89341512","luc1@gmail.com","Col.San Miguel",new Date(1991,06,15));
        Vendedor v3 = new Vendedor("0816200112245","Carol Lizeth","Martinez","83245532","carol12@gmail.com","Col.Luis Andres",new Date(2000,9,13));
        Cocinero c3 = new Cocinero("1012199032231","Angie Camila","Rodriguez","22544521","cami08@yahoo.com","Col. Las Brisas",new Date(1995,1,7));

        //CREAMOS LOS PRODUCTOS Y AÑADIMOS LOS INSUMOS A SU RECETA
        Postre Flan = new Postre("10001","Flan","Dulce sabroso",200);

        Insumo Huevos1 = new Insumo("1029","Huevos","Huevos");
        Insumo Azucar1 = new Insumo("1030","Azucar","Azucar morena");
        Insumo Leche1 = new Insumo("1032","Leche","Leche Leyde");
        Insumo Nata1 = new Insumo("1033","Nata","Nata");
        Flan.Receta(Huevos1,5);
        Flan.Receta(Azucar1,15);
        Flan.Receta(Leche1,1);
        Flan.Receta(Nata1,1);

        Postre Galletas = new Postre("10002","Galletas de Mantequilla","Deliciosas galletas",100);

        Insumo Mantequilla1 = new Insumo("1027","Mantequilla","Mantequilla Sula");
        Insumo Harina1 = new Insumo("1025","Harina","Harina Normal");
        Insumo Azucar2 = new Insumo("1030","Azucar","Azucar morena");
        Insumo Chocolate1 = new Insumo("1034","Chocolate","Chocolate blanco");

        Galletas.Receta(Mantequilla1,200);
        Galletas.Receta(Harina1,280);
        Galletas.Receta(Azucar2,180);
        Galletas.Receta(Chocolate1,1);

        Postre Pastel_Chocolate = new Postre("10003","Pastel de Chocolate","Pastel de choloate para disfrutar en familia",400);

        Insumo Huevos2 = new Insumo("1029","Huevos","Huevos");
        Insumo Leche2 = new Insumo("1032","Leche","Leche Leyde");
        Insumo Chocolate2 = new Insumo("1034","Chocolate","Chocolate blanco");
        Insumo Azucar3 = new Insumo("1030","Azucar","Azucar morena");
        Insumo Mantequilla2 = new Insumo("1027","Mantequilla","Mantequilla Sula");
        Insumo Aceite1 = new Insumo("1028","Aceite","Aceite oliva");
        Insumo Harina2 = new Insumo("1025","Harina","Harina Normal");
        Insumo Levadura1 = new Insumo("1026","Levadura","Levadura en polvo");

        Pastel_Chocolate.Receta(Huevos2,5);
        Pastel_Chocolate.Receta(Leche2,5);
        Pastel_Chocolate.Receta(Chocolate2,4);
        Pastel_Chocolate.Receta(Azucar3,200);
        Pastel_Chocolate.Receta(Mantequilla2,100);
        Pastel_Chocolate.Receta(Aceite1,50);
        Pastel_Chocolate.Receta(Harina2,210);
        Pastel_Chocolate.Receta(Levadura1,15);

        Postre Arroz_Leche = new Postre("10004","Arroz Con Leche","Arroz con un toque leve de canela",70);

        Insumo Arroz1 = new Insumo("1035","Arroz","Arroz Blanco");
        Insumo Leche3= new Insumo("1032","Leche","Leche Leyde");
        Insumo Azucar4 = new Insumo("1030","Azucar","Azucar morena");
        Insumo Mantequilla3 = new Insumo("1027","Mantequilla","Mantequilla Sula");
        Insumo Canela1 = new Insumo("1031","Canela","Canela en Polvo");

        Arroz_Leche.Receta(Arroz1,100);
        Arroz_Leche.Receta(Leche3,3);
        Arroz_Leche.Receta(Azucar4,70);
        Arroz_Leche.Receta(Mantequilla3,1);
        Arroz_Leche.Receta(Canela1,15);

        Postre Crepa = new Postre("10005","Crepas","Ricas Crepas",150);

        Insumo Huevos3 = new Insumo("1029","Huevos","Huevos");
        Insumo Harina3 = new Insumo("1025","Harina","Harina Normal");
        Insumo Azucar5 = new Insumo("1030","Azucar","Azucar morena");
        Insumo Leche4 = new Insumo("1032","Leche","Leche Leyde");
        Insumo Chocolate3 = new Insumo("1034","Chocolate","Chocolate blanco");
        Insumo Mantequilla4 = new Insumo("1027","Mantequilla","Mantequilla Sula");

        Crepa.Receta(Huevos3,6);
        Crepa.Receta(Harina3,240);
        Crepa.Receta(Azucar5,35);
        Crepa.Receta(Leche4,3);
        Crepa.Receta(Chocolate3,15);
        Crepa.Receta(Mantequilla4,60);

        //CREAMOS LOS CLIENTE
        Cliente Cliente1 = new Cliente("0816200100289","Juan Carlos","Funez","97145532","jcfunez@14gmail.com","Col.Luis Andres",new Date(2001,06,19));
        Cliente Cliente2 = new Cliente("0816199400289","Andres","Funez Vasquez","98645532","andresfunez@14gmail.com","Col.Luis Andres",new Date(2996,07,23));


        //Asignacion de los empleados a sus puesto -----> Segun cree los empleados tengo (g) para gerente (v) para vendedor (c) para cocinero
        g1.asignar_sucursal(SweetDays_Tegucigalpa);
        g2.asignar_sucursal(SweetDays_Copan);
        g3.asignar_sucursal(SweetDays_SPS);

        g1.AsignarEmpleado(v1,SweetDays_Tegucigalpa);
        g1.AsignarEmpleado(c1,SweetDays_Tegucigalpa);

        g2.AsignarEmpleado(v2,SweetDays_Copan);
        g2.AsignarEmpleado(c2,SweetDays_Copan);

        g3.AsignarEmpleado(v3,SweetDays_SPS);
        g3.AsignarEmpleado(c3,SweetDays_SPS);


        //***************** Primer Pedido *****************
        v1.asignar_cliente(Cliente1);
        Cliente1.nuevo_pedido(Crepa,5);
        Cliente1.nuevo_pedido(Galletas,10);

        v1.asignar_orden(5,Crepa,c1,new Date(2020,Calendar.DECEMBER,10));
        v1.asignar_orden(10,Galletas,c1, new Date(2020,Calendar.DECEMBER,12));


        //***************** Segundo Pedido *****************
        v2.asignar_cliente(Cliente1);
        Cliente1.nuevo_pedido(Arroz_Leche,3);
        Cliente1.nuevo_pedido(Flan,3);

        v2.asignar_orden(3,Arroz_Leche,c2,new Date(2018,Calendar.JANUARY,15));
        v2.asignar_orden(3,Flan,c2,new Date(2021,Calendar.APRIL,13));


        //***************** Tercer Pedido *****************
        v3.asignar_cliente(Cliente2);
        v3.asignar_cliente(Cliente1);
        Cliente1.nuevo_pedido(Pastel_Chocolate,1);

        v3.asignar_orden(1,Pastel_Chocolate,c3,new Date(2020,Calendar.DECEMBER,24));


        //***************** Llamado de los metodos ************
        SweetDays.Ventas_generales();
        //SweetDays.Ventas_sucursal(SweetDays_Tegucigalpa); //-----> OPCIONAL PARA VER VENTAS POR SUCURSAL
        SweetDays.Busqueda_Mes_Año(12,2020);
        SweetDays.consumo_insumos();


        /*
        ***************** Otros Metodos ****************

        Pastel_Chocolate.Ingredientes();
        g1.Ventas_empleado(v1);
        g1.Productos_hecho(c1);
        g1.setEmpleadoSalario(v1,28000);
        v1.Productos_vendidos();
        c1.Productos_Hechos();

        ************************************************
        */


    }
}
