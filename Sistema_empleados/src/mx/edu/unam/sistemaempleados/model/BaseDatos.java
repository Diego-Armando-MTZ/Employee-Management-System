package mx.edu.unam.sistemaempleados.model;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.util.ArrayList;


public class BaseDatos {
    private ArrayList<Empleado> listaEmpleados;

    private static final String RUTA_ARCHIVO = "datos/empleados.dat";

    public BaseDatos() {
        this.listaEmpleados = new ArrayList<>();
        cargarArchivo();
    }


    private void guardarArchivo() {
        File carpeta = new File("datos");
        if(!carpeta.exists()) {
            carpeta.mkdirs();
        }
    
    try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(RUTA_ARCHIVO))) {
            oos.writeObject(this.listaEmpleados);
            System.out.println("Datos guardados correctamente.");
        } catch (IOException e) {
            System.err.println("Error al guardar los datos: " + e.getMessage());
        }
    }
    @SuppressWarnings("unchecked")
    private void cargarArchivo() {
        File archivo = new File(RUTA_ARCHIVO);

        if(!archivo.exists()){
            System.out.println("Archivo no encontrado, Iniciando base de datos vacia.");
            return;
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(RUTA_ARCHIVO))) {
            this.listaEmpleados = (ArrayList<Empleado>) ois.readObject();
            System.out.println("Datos cargados correctamente. Empleados recyperados: "+ listaEmpleados.size());
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al cargar los datos: " + e.getMessage());
        }
    }

    public boolean registrarEmpleado(Empleado nuevoEmpleado){
        if (this.listaEmpleados.contains(nuevoEmpleado)) {
            System.out.println("El empleado ya está registrado.");
            return false;
        }
        this.listaEmpleados.add(nuevoEmpleado);
        guardarArchivo();
        return true;
    }
    public Empleado autenticarUsuario(String id, String password) {
        for (Empleado emp : this.listaEmpleados) {
            if (emp.getId().equals(id) && emp.getPassword().equals(password)) {
                return emp; // Devolvemos el objeto real encontrado (puede ser un Empleado o un Gerente)
            }
        }
        return null; // Si el ID o la contraseña no coinciden
    }

    // Getter para que el controlador pueda listar o meter datos en una JTable de Swing
    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

}





