package Exercises1;

import Exercises1.Stock;

public class Main {
  public static void main(String[] args) {
    Stock stck = new Stock("ORCL","Oracle Corporation");
    stck.precioCierrePrevio = 34.5;
    stck.precioActual = 69;

    System.out.printf("El porcentaje modificado con respecto al valor anterior es de %.2f%s %n",stck.getCambioPorcentaje(),"%");
  }
}
