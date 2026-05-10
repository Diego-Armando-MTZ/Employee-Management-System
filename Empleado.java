public class Empleado {
    private String nombre;
    private int edad;
    private String puesto;

    public Empleado(String nombre, int edad, String puesto) {
        this.nombre = nombre;
        this.edad = edad;
        this.puesto = puesto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    public void presentarse() {
        System.out.println("Soy " + nombre + ", tengo " + edad + " años y trabajo como " + puesto + ".");
    }
    
    // Método para cambiar el puesto (Ascenso)
    public void ascender(String nuevoPuesto) {
        this.puesto = nuevoPuesto;
        System.out.println("¡Felicidades! " + nombre + " ha sido ascendido a " + nuevoPuesto);
    }
}
