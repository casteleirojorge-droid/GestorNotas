# GestorNotas

**Alumno:** Jorge Casteleiro Monagas 

**Descripción breve:**
Aplicación de consola en Java para gestionar notas de texto, permitiendo crear notas, validarlas, listar todas las notas y filtrar por notas importantes.

**Listado de ramas creadas:**
1. `feature-estructura`
2. `feature-alta-notas`
3. `feature-validacion-alta` (derivada)
4. `feature-listado`
5. `feature-filtro-importancia` (derivada)

**Explicación del conflicto resuelto:**
Se provocó un conflicto intencionado al modificar la cabecera principal (`System.out.println`) del menú en el archivo `Main.java` de forma simultánea y con textos distintos en las ramas `main` y `feature-listado`. Se resolvió usando la herramienta de merge de IntelliJ, unificando ambas versiones para dejar el título definitivo como "VERSIÓN FINAL" y manteniendo las opciones del menú correctas.

**Funcionalidad final implementada:**
* Creación de notas con validación de datos (no permite textos vacíos ni opciones no válidas).
* Listado general de todas las notas.
* Filtrado específico para mostrar solo las notas marcadas como importantes.