import java.util.ArrayList;
import java.util.List;

public class GestorNotas {

    private List<Nota> notas;

    public GestorNotas() {
        this.notas = new ArrayList<>();
    }

    //  implementar alta de notas
    public void crearNota(String titulo, String contenido, boolean importante) {
        // Generamos un ID automático basado en la cantidad de notas
        int id = notas.size() + 1;
        Nota nuevaNota = new Nota(id, titulo, contenido, importante);
        notas.add(nuevaNota);
        System.out.println("¡Nota creada con éxito con el ID: " + id + "!");
    }

    //  implementar listado
    public void listarNotas() {
        if (notas.isEmpty()) {
            System.out.println("No hay notas guardadas.");
        } else {
            System.out.println("\n--- LISTA DE NOTAS ---");
            for (Nota nota : notas) {
                System.out.println(nota);
            }
        }
    }

    //  implementar filtro
    public void listarImportantes() {
        // implementar en la fase correspondiente
    }
}