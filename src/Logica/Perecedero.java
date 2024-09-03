
package Logica;

//Clase hija que representa los productos perecederos la cual extiende
//la clase padre (Producto)
public class Perecedero extends Producto {
    
    //Atributos especificos para los productos perecederos
    private String fechaDeCaducidad;
    private double temperaturaDeAlmacenamiento;
    
    
    //Creación del constructor de la clase Perecederos
    public Perecedero (int ID, String nombre, double precio, int cantidadEnInventario, String fechaDeCaducidad, double temperaturaDeAlmacenamiento){
        //llamada de el constructor de la clase padre Producto
        super(ID, nombre, precio, cantidadEnInventario);
        this.fechaDeCaducidad = fechaDeCaducidad;
        this.temperaturaDeAlmacenamiento = temperaturaDeAlmacenamiento;        
    }
    
    //Creacion de los getter and setter de la clase Perecederos
    
    public String getfechaDeCaducidad(){
        return fechaDeCaducidad;
    }
    
    public double gettemperaturaDeAlmacenamiento(){
        return temperaturaDeAlmacenamiento;
    }
    
    public void setfechaDeCaducidad(String fechaDeCaducidad){
        this.fechaDeCaducidad = fechaDeCaducidad;
    }
    
    public void settemperaturaDeAlmacenamiento (double temperaturaDeAlmacenamiento){
        this.temperaturaDeAlmacenamiento = temperaturaDeAlmacenamiento;
    }
    
    // Override que sobreescribe el metodo mostrar informacion de la
    // clase padre Producto la cual tambien agrega los atributos
    // especificos de la clase Perecederos
    @Override
    public void mostrarInformacion(){
        //llama al metodo mostrarInformacion de la clase padre Producto
        super.mostrarInformacion();
        //Impresion de la informacion adicional para productos perecederos
        System.out.println("El producto tiene una fecha de caducidad de: " +fechaDeCaducidad+ " y debe estar almacenado a una temperatura de: " +temperaturaDeAlmacenamiento);
    }

}
