import mx.edu.unam.sistemaempleados.model.Empleado;
import mx.edu.unam.sistemaempleados.model.Gerente;

import java.util.ArrayList;
import java.util.Scanner;

import datos.BaseDatos;
public class Mainprueba {
    public static void main(String[] args) {
        System.out.println("Iniciando el sistema de gestión de empleados...");
        System.out.println("Creando instancia de BaseDatos...");
        BaseDatos bd = new BaseDatos();

        Scanner scanner = new Scanner(System.in);

        System.out.println("que deseas hacer? (1) Registrar nuevo gerente, (2) ver la base de datos,");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            if(opcion == 1) {

                System.out.println("registro de nuevo gerente: ");
                System.out.print("ingresar ID: ");
                String id = scanner.nextLine();
        
                System.out.print("ingresar nombre: ");
                String nombre = scanner.nextLine();
        
                System.out.print("ingresar apellidos: ");
                String apellidos = scanner.nextLine();
        
                System.out.print("ingresar salario: ");
                double salario = scanner.nextDouble();
                scanner.nextLine();
        
                System.out.print("ingresar Area/Departamento: ");
                String areadepartamento = scanner.nextLine();
        
                System.out.print("ingresar contraseña: ");
                String password = scanner.nextLine();
        
                System.out.print("ingresar bono anual: ");
                double bonoanual = scanner.nextDouble();
                scanner.nextLine();
        
                System.out.print("ingresar presupuesto: ");
                double presupuesto = scanner.nextDouble();
                scanner.nextLine();
        
                System.out.print("ingresar departamentos a cargo: ");
                String departamentos = scanner.nextLine();
                
                
                
                Gerente gerenteDinamico = new Gerente(
                    id, nombre, apellidos, salario, areadepartamento, password, bonoanual, presupuesto, departamentos
                );
        
                boolean registrado = bd.registrarEmpleado(gerenteDinamico);
                if(registrado) {
                    System.out.println("Gerente registrado exitosamente.");
                } else {
                    System.out.println("Error al registrar el gerente. Verifique los datos e intente nuevamente.");
                }
            }else if(opcion == 2) {
                System.out.println("\n==================================================");
                System.out.println("      MOSTRANDO BASE DE DATOS COMPLETA (.dat)     ");
                System.out.println("==================================================");
                
                // 1. Le pedimos al modelo la lista que se cargó del archivo .dat
                ArrayList<Empleado> todasLasPersonas = bd.getListaEmpleados();
                
                // 2. Validamos si está vacía
                if (todasLasPersonas.isEmpty()) {
                    System.out.println("La base de datos está vacía actualmente.");
                } else {
                    // 3. El truco: Recorremos la lista con un ciclo for-each
                    for (Empleado emp : todasLasPersonas) {
                        // Java llamará automáticamente al método toString() de cada objeto
                        System.out.println(emp); 
                    }
                    System.out.println("\nTotal de registros encontrados: " + todasLasPersonas.size());
                }
                System.out.println("==================================================");
            }
                
    
            

        
        scanner.close();
    }
}



