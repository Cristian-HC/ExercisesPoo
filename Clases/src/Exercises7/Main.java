package Exercises7;

import Exercises7.LinearEquation;

public class Main {
  public static void main(String[] args) {
    LinearEquation foo = new LinearEquation(1,2,2,1,2,2);

    if(foo.isSolvable()){
      System.out.printf("X : %.3f , Y : %.3f%n",foo.getX(),foo.getY());
    }else{
      System.out.println("La ecuacion no tiene solucion");
    }

  }

}
