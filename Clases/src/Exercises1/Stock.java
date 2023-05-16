package Exercises1;

public class Stock {
  
  // Variables
  String simbolo;
  String nombre;
  double precioCierrePrevio;
  double precioActual;

  // Constructor
  public Stock(String simbolo , String nombre) {
    this.simbolo = simbolo;
    this.nombre = nombre;
  }

  // Metodos
  public double getCambioPorcentaje() {
    double prc = (precioActual / precioCierrePrevio) * 100; 
    return prc - 100;
  }

}
