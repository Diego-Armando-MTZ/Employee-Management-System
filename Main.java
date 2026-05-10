public class Main {
    public static void main(String[] args) {
        // Creamos al objeto (instancia)
        Empleado emp1 = new Empleado("Sadi", 25, "Desarrollador");

        // Usamos sus métodos
        emp1.presentarse();
        emp1.ascender("Líder de Proyecto");
        emp1.presentarse();
    }
}