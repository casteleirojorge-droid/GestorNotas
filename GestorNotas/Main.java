import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        GestorNotas gestor = new GestorNotas();

        boolean salir = false;

        while (!salir) {

            System.out.println("\n=== GESTOR DE NOTAS - VERSION LISTADO ===");
            System.out.println("1. Crear nota");
            System.out.println("2. Listar notas");
            System.out.println("3. Listar importantes");
            System.out.println("0. Salir");

            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    String titulo = "";
                    while (titulo.trim().isEmpty()) {
                        System.out.print("Introduce el título: ");
                        titulo = scanner.nextLine();
                        if (titulo.trim().isEmpty()) System.out.println("Error: El título no puede estar vacío.");
                    }

                    String contenido = "";
                    while (contenido.trim().isEmpty()) {
                        System.out.print("Introduce el contenido: ");
                        contenido = scanner.nextLine();
                        if (contenido.trim().isEmpty()) System.out.println("Error: El contenido no puede estar vacío.");
                    }

                    String impStr = "";
                    boolean importante = false;
                    while (!impStr.equalsIgnoreCase("s") && !impStr.equalsIgnoreCase("n")) {
                        System.out.print("¿Es importante? (s/n): ");
                        impStr = scanner.nextLine().trim();
                        if (impStr.equalsIgnoreCase("s")) {
                            importante = true;
                        } else if (impStr.equalsIgnoreCase("n")) {
                            importante = false;
                        } else {
                            System.out.println("Error: Respuesta no válida. Introduce 's' o 'n'.");
                        }
                    }

                    gestor.crearNota(titulo, contenido, importante);
                    break;
                case "2":
                    gestor.listarNotas();
                    break;
                case "3":
                    gestor.listarNotasImportantes();
                    break;
                case "0":
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }

        scanner.close();
    }
}