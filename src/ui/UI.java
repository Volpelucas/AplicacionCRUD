package ui;

import dao.RegistroDAO;
import models.Registro;

import java.util.List;
import java.util.Scanner;

public class UI {
    private final RegistroDAO registroDAO = new RegistroDAO();
    public final Scanner scanner = new Scanner(System.in);

    public void crearRegistro() {
        System.out.println("Ingrese nombre del registro:");
        String nombre = scanner.nextLine();
        Registro nuevoRegistro = new Registro(0, nombre);
        registroDAO.crearRegistro(nuevoRegistro);
    }

    public void listarRegistros() {
        List<Registro> registros = registroDAO.listarRegistros();
        System.out.println("Registros existentes:");
        for (Registro registro : registros) {
            System.out.println(registro);
        }
    }

    public void actualizarRegistro() {
        // Implementación para actualizar un registro existente
        System.out.println("Ingrese el ID del registro a actualizar:");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea después del nextInt()
        Registro registro = obtenerRegistroPorId(id);
        if (registro != null) {
            System.out.println("Ingrese el nuevo nombre:");
            String nuevoNombre = scanner.nextLine();
            registro.setNombre(nuevoNombre);
            registroDAO.actualizarRegistro(registro);
        } else {
            System.out.println("Registro no encontrado");
        }
    }

    public void borrarRegistro() {
        // Implementación para borrar un registro por ID
        System.out.println("Ingrese el ID del registro a borrar:");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea después del nextInt()
        registroDAO.borrarRegistro(id);
    }

    private Registro obtenerRegistroPorId(int id) {
        List<Registro> registros = registroDAO.listarRegistros();
        for (Registro registro : registros) {
            if (registro.getId() == id) {
                return registro;
            }
        }
        return null;
    }
}
