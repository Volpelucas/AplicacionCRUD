package main;

import ui.UI;

public class Main {
    public static void main(String[] args) {
        UI ui = new UI();

        // Lógica para mostrar un menú y permitir que el usuario realice operaciones CRUD
        while (true) {
            System.out.println("Menú:");
            System.out.println("1. Crear Registro");
            System.out.println("2. Listar Registros");
            System.out.println("3. Actualizar Registro");
            System.out.println("4. Borrar Registro");
            System.out.println("5. Salir");

            System.out.println("Ingrese su opción:");
            int opcion = ui.scanner.nextInt();
            String String; // Consumir la nueva línea después del nextInt()
            String = ui.scanner.nextLine();

            switch (opcion) {
                case 1:
                    ui.crearRegistro();
                    break;
                case 2:
                    ui.listarRegistros();
                    break;
                case 3:
                    ui.actualizarRegistro();
                    break;
                case 4:
                    ui.borrarRegistro();
                    break;
                case 5:
                    System.out.println("Saliendo de la aplicación. ¡Hasta luego!");
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }
    }
}
