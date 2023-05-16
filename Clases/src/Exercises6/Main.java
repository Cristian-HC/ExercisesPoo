package Exercises6;

import Exercises6.QuadraticEquation;

public class Main {
  public static void main(String[] args) {
  QuadraticEquation qe1 = new QuadraticEquation(1,2,1);

    if(qe1.getDiscriminante() < 0){
      System.out.println("La ecuacion no tiene raices");
    }else{
      System.out.printf("root 1 = %.1f , root 2 = %.1f%n",qe1.getRoot1(),qe1.getRoot2());
    }
  }
}
