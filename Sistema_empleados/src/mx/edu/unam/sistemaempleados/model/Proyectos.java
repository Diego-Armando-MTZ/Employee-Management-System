package mx.edu.unam.sistemaempleados.model;
import java.io.Serializable;
import java.util.ArrayList;
public class Proyectos implements Serializable {
    private static final long serialVersionUID = 5L;

    private String idProyecto;
    private String nombreProyecto;
    private String descripcion;
    private String fechaInicio;
    private String fechaFin;
    private ArrayList<Empleado> empleadosAsignados;

    public Proyectos(String idProyecto, String nombreProyecto, String descripcion, String fechaInicio, String fechaFin) {
        this.idProyecto = idProyecto;
        this.nombreProyecto = nombreProyecto;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.empleadosAsignados = new ArrayList<>();
    }

    public String getIDproyecto() {return idProyecto;}
    public String getNombreProyecto() {return nombreProyecto;}
    public String getDescripcion() {return descripcion;}
    public String getFechaInicio() {return fechaInicio;}
    public String getFechaFin() {return fechaFin;}
    public ArrayList<Empleado> getEmpleadosAsignados() {return empleadosAsignados;}

    public void setNombreProyecto(String nombreProyecto) {this.nombreProyecto = nombreProyecto;}
    public void setDescripcion(String descripcion) {this.descripcion = descripcion;}
    public void setFechaInicio(String fechaInicio) {this.fechaInicio = fechaInicio;}
    public void setFechaFin(String fechaFin) {this.fechaFin = fechaFin;}

    public void listarEmpleadosAsignados() {
        System.out.println("\n Empleados asignados al proyecto: " + this.nombreProyecto);
        if (this.empleadosAsignados.isEmpty()){
            System.out.println("No hay empleados asignados a este proyecto.");
        return;
        } 
        for (Empleado emp : this.empleadosAsignados) {
            System.out.println(emp.obtenerinfoDepartamento());
        }
        System.out.println("Total empleados asignados al proyecto: " + this.empleadosAsignados.size());
        System.out.println("--------------------------------------------------");
    }



}
