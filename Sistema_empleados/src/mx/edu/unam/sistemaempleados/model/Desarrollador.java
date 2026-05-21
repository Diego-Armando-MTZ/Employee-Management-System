package mx.edu.unam.sistemaempleados.model;

public class Desarrollador extends Empleado {
    private static final long serialVersionUID = 3L;

    private String lenguajeprogramacion;
    private String proyectosasignados;
    private double horasextras;

    public Desarrollador(String id, String nombres, String apellidos, double salario, String area,
        String password, String lenguajeprogramacion, String proyectosasignados, double horasextras) {
        super(id, nombres, apellidos, salario, "Desarrollador", area, password);
        this.lenguajeprogramacion = lenguajeprogramacion;
        this.proyectosasignados = proyectosasignados;
        this.horasextras = horasextras;
    }

    public String getLenguajeprogramacion() {return lenguajeprogramacion;}
    public String getProyectosasignados() {return proyectosasignados;}
    public double getHorasextras() {return horasextras;}

    public void setLenguajeprogramacion(String lenguajeprogramacion) {this.lenguajeprogramacion = lenguajeprogramacion;}
    public void setProyectosasignados(String proyectosasignados) {this.proyectosasignados = proyectosasignados;}
    public void setHorasextras(double horasextras) {this.horasextras = horasextras;}


     
    @Override
    public double calcularSalario() {return getSalario() + this.horasextras;}
}
