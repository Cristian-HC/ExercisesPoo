package Exercises2;

public class Producto {
  // Variables
  private int id;
  private String nombre;
  private double precio;
  private int stock;
  
  // Constructor
  public Producto(int id, String nombre, double precio, int stock) {
    this.id = id;
    this.nombre = nombre;
    this.precio = precio;
    this.stock = stock;
  }

  // Getters y Setters
  public void setId(int id){
    this.id = id;
  }
  public int getId(){
    return id;
  }

  public void setNombre(String nombre){
    this.nombre = nombre;
  }
  public String getNombre(){
    return nombre;
  }

  public void setPrecio(double precio){
    this.precio = precio;
  }
  public double getPrecio(){
    return precio;
  }

  public void setStock(int stock){
    this.stock = stock;
  }
  public int getStock(){
    return stock;
  }

  // Metodos
  public void vender(int cantidad){
    this.stock = (this.stock >= cantidad) ? this.stock - cantidad : this.stock;
  }

  public void reponer(int cantidad){
    this.stock += cantidad;
  }

  @Override
  public String toString(){
    return "Producto(id : "+id+", nombre : "+nombre+", precio : "+precio+", stock : "+stock+")";
  }
  

}
