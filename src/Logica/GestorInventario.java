
package Logica;

import java.util.ArrayList;
import java.util.Scanner;

//Creacion de la parte lógica del sistema, clase la cual permite gestionar
//el inventario de productos de la tienda mediante los metodos creados que 
//van a permitir agregar, mostrar, buscar, eliminar y modificar
//productos en el inventario
public class GestorInventario {
    
    //Creacion de nuestra lista que almacenara los peoductos en el inventario
    private ArrayList<Producto> productos;
    
    //Creacion del constructor de la clase GestorInventario
    //Inicialización de la lista de productos como ArrayList
    public GestorInventario (){
        productos = new ArrayList<>();
    }
    
    //Metodo que permite agregar los productos a nuestra lista
    public void agregarProducto(Producto products){
        productos.add(products);
    }
    
    //Metodo que muestra todos los productos en el inventario
    public void mostrarIventario(){
        //recorre la lista de productos 
        for(Producto producto : productos){
            //muestra la informacion de cada uno de los productos
            producto.mostrarInformacion();
            System.out.println("");
        }
    }
    
    //Busca un producto especifico por su ID
    public Producto buscarPorID (int ID){
        //Recorre la lista de productos
        for(Producto producto : productos){
            //Si el ID dado es igual al ID en el inventario retornara el producto
            if(producto.getID() == ID){
                return producto;
            }
        }
        return null;
    }
    
    //MEtodo para eliminar un producto por ID
    public void eliminarProducto(int idProducto){
        //Buscamos el producto en la lista mediante el ID proporcionado
        //por el usuario
        Producto producto = buscarPorID(idProducto);
        //Si el producto no es nulo y es encontrado se eliminara
        if(producto != null){
            //funcion que elimina el producto de la lista
            productos.remove(producto);
            System.out.println("Producto eliminado del inventario");
        }else{
            //Si no se encuentra el producto con el ID proporcionado 
            //se informará al usuario mediante elmmensaje
            System.out.println("Producto con el ID " +idProducto+ " no encontrado");
        }
        
    }
    
    //Metodo para modificar un producto mediante un menu
    public void modificarProducto (){
        Scanner S = new Scanner(System.in);

        //Se solicita al usuario ingresar el ID del producto que desea modificar
        //y se almacena en la variable idProducto
        System.out.print("Ingrese el ID del producto que desea modificar: ");
        int idProducto = S.nextInt();

        //Busca el producto por su ID con el ID que pedimos anteriormente
        Producto producto = buscarPorID(idProducto);

        if (producto != null) {
            //Muestra la información actual del producto para que pueda ver
            //el estado actual antes de actualizarlo
            System.out.println("Información actual del producto: ");
            producto.mostrarInformacion();

            //Solicitamos al usuario elegir una opción para modificar algun atributo 
            System.out.println("Seleccione el elemento del producto que desea modificar");
            System.out.println("1. Nombre");
            System.out.println("2. Precio");
            System.out.println("3. Cantidad en Inventario");
            int op = S.nextInt();
            S.nextLine(); 

            switch (op) {
                case 1:
                    //Opción para modificar el nombre
                    System.out.print("Ingrese el nuevo nombre del producto: ");
                    String nuevoNombre = S.nextLine();
                    producto.setNombre(nuevoNombre);
                    System.out.println("Nombre del producto actualizado.");
                    break;
                case 2:
                    //Opción para modificar el precio
                    System.out.print("Ingrese el nuevo precio del producto: ");
                    double nuevoPrecio = S.nextInt();
                    producto.setPrecio(nuevoPrecio);
                    System.out.println("Precio del producto actualizado.");
                    break;
                case 3:
                    //Opción para modificar el inventario
                    System.out.print("Ingrese la nueva cantidad en inventario del producto: ");
                    int nuevaCantidad = S.nextInt();
                    producto.setCantidadEnInventario(nuevaCantidad);
                    System.out.println("Cantidad en inventario del producto actualizada.");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
            //Si el ID proporcionado no se encuentra en la lista se genera el siguiente mensaje
        } else {
            System.out.println("Producto con ID " + idProducto + " no encontrado.");
        }
    }
}
    
    

