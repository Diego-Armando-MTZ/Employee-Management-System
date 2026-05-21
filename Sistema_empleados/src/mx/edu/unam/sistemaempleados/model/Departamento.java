package mx.edu.unam.sistemaempleados.model;
import java.io.Serializable;
import java.util.ArrayList;
public class Departamento implements Serializable {

    private static final long serialVersionUID = 4L;

    private String nombreDepartamento;
    private String idDepartamento;
    private ArrayList<Empleado> empleados;
    private String descripcion;

    public Departamento(String idDepartamento, String nombreDepartamento, String descripcion) {
        this.idDepartamento = idDepartamento;
        this.nombreDepartamento = nombreDepartamento;
        this.descripcion = descripcion;
        this.empleados = new ArrayList<>();
    }

    public String getNombreDepartamento() {return nombreDepartamento;}
    public String getIdDepartamento() {return idDepartamento;}
    public String getDescripcion() {return descripcion;}
    public ArrayList<Empleado> getEmpleados() {return empleados;}

    public void setNombreDepartamento(String nombreDepartamento) {this.nombreDepartamento = nombreDepartamento;}
    public void setDescripcion(String descripcion) {this.descripcion = descripcion;}


    //metodos para gestionar los empleados del departamento
    public void agregarEmpleado(Empleado emp) {this.empleados.add(emp);}
    public void eliminarEmpleado(Empleado emp) {this.empleados.remove(emp);}

    //metodo para listar los empleados que estan adentro del departramento
    public void listarEmpleados() {
        System.out.println("\n Empleados de: " + this.nombreDepartamento);
        if (this.empleados.isEmpty()){
            System.out.println("No hay empleados en este departamento.");
        return;
        } 
        for (Empleado emp : this.empleados) {
            System.out.println(emp.obtenerinfoDepartamento());
        }
        System.out.println("Total empleados en departamento: " + this.empleados.size());
        System.out.println("--------------------------------------------------");
    }
}

