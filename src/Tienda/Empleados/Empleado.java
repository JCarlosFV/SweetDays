package Tienda.Empleados;

import Tienda.Sucursal;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Empleado {
    private String id;
    private String nombre;
    private String apellido;
    protected float salario;
    private String telefono;
    private String correo;
    private String direccion;
    private Date fechNac;
    private Gerente mi_superior;
    private List<Sucursal> sucursal;

    public Empleado(String id, String nombre, String apellido, String telefono, String correo, String direccion, Date fechNac) {
        this.setId(id);
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.salario = 20000;
        this.setTelefono(telefono);
        this.setCorreo(correo);
        this.direccion = direccion;
        this.fechNac = fechNac;
        this.sucursal = new ArrayList<Sucursal>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        Pattern pat = Pattern.compile("^[0|1]\\d{12}$");
        Matcher mat = pat.matcher(id);
        if(!mat.find()){
            System.out.println("El id " + id +" No es Válido, ingrese uno correcto sin guiones" + "\n");
            id = "Incorrecto";
        }
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {

        Pattern pat = Pattern.compile("[A-Z][a-zA-Z]\\s{0,1}");
        Matcher mat = pat.matcher(nombre);
        if(!mat.find()){
            System.out.println("El nombre " + nombre +" No es Válido, por favor verifique que empiece con mayuscula" + "\n");
            nombre = "Incorrecto";
        }
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        Pattern pat = Pattern.compile("[A-Z][a-zA-Z]\\s{0,1}");
        Matcher mat = pat.matcher(apellido);
        if(!mat.find()){
            System.out.println("El Apellido " + apellido +" No es Válido, por favor verifique que empiece con Mayuscula" + "\n");
            apellido = "Incorrecto";
        }
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        Pattern pat = Pattern.compile("^[9|8|7|3|2]\\d{7}$");
        Matcher mat = pat.matcher(telefono);
        if(!mat.find()){
            System.out.println("El telefono " + telefono +" No es Válido, ingrese un telefono de dominio Hondureño " + "\n");
            telefono = "Incorrecto";
        }
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        Pattern pat = Pattern.compile("^[\\w-]+(\\.[\\w-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher mat = pat.matcher(correo);
        if(!mat.find()){
            System.out.println("El Correo " + correo +" No es Válido" + "\n");
            correo = "Incorrecto";
        }
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getFechNac() {
        return fechNac;
    }

    public void setFechNac(Date fechNac) {
        this.fechNac = fechNac;
    }

    public Gerente getMi_superior() {
        return mi_superior;
    }

    public void setMi_superior(Gerente mi_superior) {
        this.mi_superior = mi_superior;
    }

    public List<Sucursal> getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal s) {
        this.sucursal.add(s);
    }


}
