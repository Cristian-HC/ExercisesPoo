package Exercises4;

public class Ventilador {
  // Constantes
  final int SLOW = 1;
  final int MEDIUM = 2;
  final int FAST = 3;

  // Variables
  private int speed = SLOW;
  private boolean on = false;
  private double radio = 5;
  private String color = "azul";


  // Constructor
  public Ventilador() {
  }

  // getter and setter
  public void setColor(String color){
    this.color = color;
  }
  public String getColor(){
    return color;
  }

  public void setRadio(double radio){
    this.radio = radio;
  }
  public double getRadio(){
    return radio;
  }

  public void setOn(){
    this.on = !on;
  }
  public boolean getOn(){
    return on;
  }

  public void setSpeed(int opcMode){ 
    this.speed = (opcMode < SLOW || opcMode > FAST) ? speed : opcMode;
  }
  public int getSpeed(){
    return speed;
  }

  // metodos 
  @Override
  public String toString(){
    if(this.on){
      return "{speed = "+this.speed+", color = "+this.color+", radio = "+this.radio+"}";
    }else{
      return "El ventilado esta apagado {color = "+this.color+", radio = "+this.radio+"}";
    }
  }
}
