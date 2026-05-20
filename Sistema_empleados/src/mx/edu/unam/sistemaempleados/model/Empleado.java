package mx.edu.unam.sistemaempleados.model;
import java.io.Serializable;
public class Empleado implements Serializable{
    private static final long serialVersionUID = 1L;

    protected String id;
    protected String nombre;
    protected double salario;
    protected String puesto;
    protected String area;
    protected String password;

    public Empleado(String id, String nombre, double salario, String puesto, String area, String password) {
        this.id = id;
        this.nombre = nombre;
        this.salario = salario;
        this.puesto = puesto;
        this.area = area;
        this.password = password;
    }
    public String getId() {return id;}
    public String getNombre() {return nombre;}
    public String getPuesto() {return puesto;}
    public double getSalario() {return salario;}
    public String getArea() {return area;}
    public String getPassword() {return password;}

    public void setNombre(String nombre) {this.nombre = nombre;}
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

    public int hashCode() {return (this.id == null) ? 0 : this.id.hashCode();}

    public String toString() {return this.nombre + " (" + this.puesto + ") - ID: " + this.id;}
}
