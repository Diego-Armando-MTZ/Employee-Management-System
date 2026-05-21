package mx.edu.unam.sistemaempleados.model;

public class Gefedepartamento extends Empleado {
    private static final long serialVersionUID = 3L;

    private String departamento;
    private String equipoempleados;
    private double bonoproductividad;

    public Gefedepartamento(String id, String nombres, String apellidos, double salario, String area,
         String password, String departamento, String equipoempleados, double bonoproductividad) {
        super(id, nombres, apellidos, salario, "Gefe de Departamento", area, password);
        this.departamento = departamento;
        this.equipoempleados = equipoempleados;
        this.bonoproductividad = bonoproductividad;
    }   

    public String getDepartamento() {return departamento;}
    public String getEquipoempleados() {return equipoempleados;}
    public double getBonoproductividad() {return bonoproductividad;}

    public void setDepartamento(String departamento) {this.departamento = departamento;}
    public void setEquipoempleados(String equipoempleados) {this.equipoempleados = equipoempleados;}
    public void setBonoproductividad(double bonoproductividad) {this.bonoproductividad = bonoproductividad;}


    @Override
    public double calcularSalario() {return getSalario() + this.bonoproductividad;}
}

