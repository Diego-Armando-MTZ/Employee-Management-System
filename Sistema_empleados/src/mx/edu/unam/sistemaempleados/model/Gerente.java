package mx.edu.unam.sistemaempleados.model;

public class Gerente extends Empleado {
    private static final long serialVersionUID = 1L;
    
    private double bonoanual;
    private double presupuesto;
    private String departamentos;

    public Gerente(String id, String nombre, double salario, String puesto, String area,
         String password, double bonoanual, double presupuesto, String departamentos) {
        super(id, nombre, salario, "Gerente", area, password);
        this.bonoanual = bonoanual;
        this.presupuesto = presupuesto;
        this.departamentos = departamentos;
    }

    public double getBonoanual() {return bonoanual;}                            
    public double getPresupuesto() {return presupuesto;}
    public String getDepartamentos() {return departamentos;}

    public void setBonoanual(double bonoanual) {this.bonoanual = bonoanual;}
    public void setPresupuesto(double presupuesto) {this.presupuesto = presupuesto;}
    public void setDepartamentos(String departamentos) {this.departamentos = departamentos;}

    public double calcularSalario() {return this.salario + this.bonoanual;}
}
