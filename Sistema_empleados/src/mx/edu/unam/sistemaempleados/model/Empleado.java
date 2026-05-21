package mx.edu.unam.sistemaempleados.model;
import java.io.Serializable;
public class Empleado implements Serializable{
    private static final long serialVersionUID = 1L;

    protected String id;
    protected String nombres;
    protected String apellidos;
    protected double salario;
    protected String puesto;
    protected String area;
    protected String password;

    public Empleado(String id, String nombres, String apellidos, double salario, String puesto, String area, String password) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.salario = salario;
        this.puesto = puesto;
        this.area = area;
        this.password = password;
    }
    public String getId() {return id;}
    public String getNombres() {return nombres;}
    public String getApellidos() {return apellidos;}
    public String getPuesto() {return puesto;}
    public double getSalario() {return salario;}
    public String getArea() {return area;}
    public String getPassword() {return password;}

    public void setNombres(String nombres) {this.nombres = nombres;}
    public void setApellidos(String apellidos) {this.apellidos = apellidos;}
    public void setPuesto(String puesto) {this.puesto = puesto;}
    public void setSalario(double salario) {this.salario = salario;}
    public void setArea(String area) {this.area = area;}
    public void setPassword(String password) {this.password = password;}

    public double calcularSalario() {return this.salario;}

    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Empleado)) return false;
        Empleado otroEmpleado = (Empleado) obj; 
        return this.id.equals(otroEmpleado.id);
    }
    public String obtenerinfoDepartamento() {
        return "ID: " + this.id +
                " | Nombre: " + this.nombres + " " + this.apellidos +
                " | Puesto: " + this.puesto +
                " | Área: " + this.area; 
    }

    public int hashCode() {return (this.id == null) ? 0 : this.id.hashCode();}

    public String toString() {return this.nombres + " " + this.apellidos + " (" + this.puesto + ") - ID: " + this.id;}
}
