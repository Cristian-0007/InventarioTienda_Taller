# Sistema de Gestión de Inventario para Tienda

Este proyecto implementa un sistema básico de gestión de inventario para una tienda utilizando principios de Programación Orientada a Objetos (POO) en Java. El sistema permite agregar, mostrar, buscar, eliminar y modificar productos en el inventario el cual contiene productos perecederos y no perecederos.

## Estructura del Proyecto

- **Logica/Producto.java**: Clase base "Producto" define los atributos y métodos para todos los productos.
- **Logica/Perecedero.java**: Clase "Perecedero" que extiende "Producto" y añade atributos específicos para productos perecederos, como la fecha de caducidad y la temperatura de almacenamiento.
- **Logica/NoPerecedero.java**: Clase "NoPerecedero" que extiende "Producto" y añade un atributo específico para productos no perecederos que es la garantía.
- **Logica/GestorInventario.java**: Clase "GestorInventario" donde se hace la lógica del sistema y contiene la lista de productos en el inventario proporcionando métodos para agregar, mostrar, buscar, eliminar y modificar productos.
- **Principal/InventarioTienda.java**: Clase principal que contiene el metodo main proporcionando el menú interactivo para utilizar el sistema de gestión de inventario.

## Funcionalidades

1. **Agregar producto perecedero**: Permite agregar un producto con atributos específicos para perecederos.
2. **Agregar producto no perecedero**: Permite agregar un producto con atributos específicos para no perecederos.
3. **Mostrar inventario**: Muestra todos los productos en el inventario con su información detallada.
4. **Buscar producto por ID**: Busca un producto específico por su ID y muestra su información.
5. **Eliminar producto**: Elimina un producto del inventario utilizando su ID.
6. **Modificar producto**: Permite modificar el nombre, precio o cantidad en inventario de un producto existente.
7. **Salir**: Termina la ejecución del programa.

## Ejecución

Para ejecutar el programa se debe compilar y ejecuta la clase "InventarioTienda" desde un entorno compatible con Java, el usado para el proyecto fue NetBeans.

```bash
javac Principal/InventarioTienda.java
java Principal.InventarioTienda
