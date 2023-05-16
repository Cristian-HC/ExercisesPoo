package Exercises3;

import java.util.Date; 

public class Cuenta {
  //Variables
  private int id = 0;
  private int saldo = 0;
  private double tasaInteresAnual = 0.0;
  private Date fechaDeCreacion = new Date(); 

  //Constructor
  public Cuenta() {
  }
  public Cuenta(int id , int saldo) {
    this.id = id;
    this.saldo = saldo;
  }

  //Getters and Setters
  public void setId(int id){
    this.id = id;
  }
  public int getId(){
    return id;
  }

  public void setSaldo(int saldo){
    this.saldo = saldo;
  }
  public int getSaldo(){
    return saldo;
  }

  public void setTasaInteresAnual(double tasaInteresAnual){
    this.tasaInteresAnual = tasaInteresAnual;
  }
  public double getTasaInteresAnual(){
    return tasaInteresAnual;
  }

  public Date getFechaDeCreacion(){
    return fechaDeCreacion;
  }

  //Metodos
  public double getTasaInteresMensual(){
    return tasaInteresAnual / 1200;
  }

  public double getInteresMensual(){
    return saldo * this.getTasaInteresMensual();
  }

  public void retiro(int amount){
    this.saldo = (saldo >= amount) ? saldo - amount : saldo;
  }

  public void deposito(int amount){
    this.saldo = (amount > 0) ? saldo + amount : saldo;
  }

}
