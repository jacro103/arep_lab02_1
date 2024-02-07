# Taller #2 - Aplicaciones Distribuidas

Este proyecto corresponde al Taller #2 de la asignatura de Aplicaciones Distribuidas, realizado por José Alejandro Correa Rodríguez.

## Descripción del Reto

El reto consiste en escribir un servidor web que sea capaz de manejar múltiples solicitudes de manera seguida (no concurrentes). Este servidor debe tener la capacidad de leer archivos del disco local y retornar todos los archivos solicitados, incluyendo páginas HTML, archivos JavaScript, CSS e imágenes. Además, se requiere construir una aplicación web utilizando JavaScript, CSS e imágenes para probar el servidor. La aplicación web debe incluir comunicación asíncrona con unos servicios REST en el backend. Es importante destacar que no se permite el uso de frameworks web como Spark o Spring, únicamente se debe emplear Java y las librerías necesarias para el manejo de la red.

## En Funcionamiento

### ¿Cómo funciona?

1. Dirígete al directorio `example`.
2. Ejecuta la clase `Main`.
3. En tu navegador preferido (por ejemplo, Firefox), visita `localhost:35000`, que es el puerto del socket que se abre.

## Descripción del Proyecto

Este proyecto consta de 4 clases, siendo la principal `Main`, seguida de `HttpServer`. Permite manejar múltiples solicitudes de manera seguida.

## Herramientas Utilizadas

- **Maven:** Herramienta de gestión de proyectos utilizada para la construcción y gestión de dependencias del proyecto.
- **Git:** Sistema de control de versiones distribuido utilizado para el control de cambios y colaboración en el desarrollo del proyecto.
- **NetBeans:** Entorno de desarrollo integrado (IDE) utilizado para escribir, compilar y depurar el código del proyecto.

