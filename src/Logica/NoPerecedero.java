
package Logica;

//Clase hija que representa los productos No perecederos la cual extiende
//la clase padre (Producto)
public class NoPerecedero extends Producto {
    
    //Atributo especifico para los productos No perecederos
    private String garantia;
    
    //Creación del constructor de la clase NoPerecederos
    public NoPerecedero (int ID, String nombre, double precio, int cantidadEnInventario, String garantia){
        //llamada de el constructor de la clase padre Producto
        super(ID, nombre, precio, cantidadEnInventario);
        this.garantia = garantia;
    }
    
    //Creacion de los getter and setter de la clase Perecederos
    public String getgarantia(){
        return garantia;
    }
    
    public void setgarantia (String garantia){
        this.garantia = garantia;
    }
    
    // Override que sobreescribe el metodo mostrar informacion de la
    // clase padre Producto la cual tambien agrega los atributos
    // especificos de la clase Perecederos
    @Override
    public void mostrarInformacion(){
        //llama al metodo mostrarInformacion de la clase padre Producto
        super.mostrarInformacion();
        //Impresion de la informacion adicional para productos perecederos
        System.out.println("La garantia del producto es: " +garantia);
    }
}
