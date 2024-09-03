
package Principal;

import Logica.GestorInventario;
import Logica.Perecedero;
import Logica.NoPerecedero;
import Logica.Producto;        
import java.util.InputMismatchException;
import java.util.Scanner;


public class InventarioTienda {
    
    
    public static void main(String[] args) {
        //Constructor de la clase
        GestorInventario gestor = new GestorInventario();
        Scanner S = new Scanner(System.in);
        
        //Creación del menú para el sistema
        while(true){
            //Bloque try catch para manejo de excepciones
            try{
            System.out.println("\n Menu del inventario de la tienda");
            System.out.println("");
            System.out.println("-----------------------------------");
            System.out.println("");
            System.out.println("Seleccione una opcion");
            System.out.println("1. Agregar producto perecedero");
            System.out.println("2. Agregar producto no perecedero");
            System.out.println("3. Mostrar inventario");
            System.out.println("4. Buscar producto por ID");
            System.out.println("5. Eliminar producto");
            System.out.println("6. Modificar producto");
            System.out.println("7. Salir");
            int op = S.nextInt();
            
            switch(op){
                //Se le pide ingresar los datos de productos Perecederos al usuario
                case 1:
                    System.out.println("Ingrese ID del producto");
                    int idPerecedero = S.nextInt();
                    System.out.println("Ingrese el nombre del producto");
                    String nombrePerecedero = S.next();
                    S.nextLine();
                    System.out.println("Ingrese el precio del producto");
                    double precioPerecedero = S.nextDouble();
                    System.out.println("Ingrese la cantidad en inventario");
                    int cantidadPerecedero = S.nextInt();
                    System.out.println("Ingrese la fecha de caducidad");
                    String fechaPerecedero = S.next();
                    S.nextLine();
                    System.out.println("Ingrese la temperatura de almacenamiento");
                    double tempAlmacenamiento = S.nextDouble();
                    gestor.agregarProducto(new Perecedero(idPerecedero, nombrePerecedero, precioPerecedero, cantidadPerecedero, fechaPerecedero, tempAlmacenamiento));
                    System.out.println("Producto perecedero agregado exitosamente");
                    break;
                    
                //Se le pide ingresar los datos de productos No Perecederos al usuario    
                case 2:
                    System.out.println("Ingrese ID del producto");
                    int idNoPerecedero = S.nextInt();
                    System.out.println("Ingrese el nombre del producto");
                    String nombreNoPerecedero = S.next();
                    System.out.println("Ingrese el precio del producto");
                    double precioNoPerecedero = S.nextDouble();
                    System.out.println("Ingrese la cantidad en inventario");
                    int cantidadNoPerecedero = S.nextInt();
                    System.out.println("Ingrese la garanria del producto");
                    String garantia = S.next();
                    gestor.agregarProducto(new NoPerecedero(idNoPerecedero, nombreNoPerecedero, precioNoPerecedero, cantidadNoPerecedero, garantia));
                    System.out.println("Producto no perecedero agregado exitosamente");
                    break;
                    
                case 3:
                    //Llamamos al metodo mostrarInventario para mostrar el inventario actual
                    gestor.mostrarIventario();
                    break;
                    
                case 4:
                    //Se pide el ID del producto especifico que el usuario quiere ver
                    System.out.println("Ingrese el ID del producto: ");
                    int idBusqueda = S.nextInt();
                    Producto producto = gestor.buscarPorID(idBusqueda);
                    //Si el ID coincide con uno de el inventario se mostrara el producto
                    if(producto != null){
                        producto.mostrarInformacion();                                        
                    }else{
                        //Si el ID proporcionado no se encuentra en el inventario 
                        //se genera el siguiente mensaje
                        System.out.println("Producto no encontrado");
                    }
                    break;
                    
                case 5:
                    //Se pide el ID del producto que el usuario quiere eliminar
                    System.out.println("Ingrese el ID del producto que desea eliminar");
                    int idEliminar = S.nextInt();
                    //llamamos al método usado para eliminar productos que
                    //se ejecutara usando el ID dado por el usuario
                    gestor.eliminarProducto(idEliminar);
                    break;
                    
                case 6:
                    //Se llama al método para modificar productos
                    gestor.modificarProducto();
                    break;
                    
                    //Opcion para salir del programa
                case 7:
                    System.out.println("Saliendo del programa");
                    S.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion no valida. Intente de nuevo");
                    break;
            }
            }catch(InputMismatchException e){
                S.next();
            }
        }
        
        
    }
}
