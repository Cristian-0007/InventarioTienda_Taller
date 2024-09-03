
package Logica;

//Creacion de la clase padre Producto
public class Producto {
    
    //Atributos de la clase Padre
    private int ID;
    private String nombre;
    private double precio;
    private int cantidadEnInventario;
    
    //Creacion del constructor de la clase Producto
    public Producto (int ID, String nombre, double precio, int cantidadEnInventario){
       this.ID = ID;
       this.nombre = nombre;
       this.precio = precio;
       this.cantidadEnInventario = cantidadEnInventario;
    }
    
    //Creacion de los metodos getter and setter
    public int getID() {
        return ID;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidadEnInventario() {
        return cantidadEnInventario;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCantidadEnInventario(int cantidadEnInventario) {
        this.cantidadEnInventario = cantidadEnInventario;
    }
    
    //Creacion del metodo mostrarInformacion para mostrar el inventario actual
    public void mostrarInformacion(){
        System.out.println("El ID del producto es: " +ID);
        System.out.println("El nombre del producto es: " +nombre);
        System.out.println("El precio del producto es: " +precio);
        System.out.println("La cantidad disponible en inventario es: " +cantidadEnInventario);
        
    }
        
    
}
