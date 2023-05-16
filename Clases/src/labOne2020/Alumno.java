package labOne2020;


public class Alumno {
  // Variables
  private String rut;
  private String nombre;
  private String apellido1;
  private String apellido2;

  private String asignatura1 = "Mecanica Clasica";
  private String asignatura2 = "Calculo 2";
  private double [] notasA1 = {1.0,1.0,1.0};
  private double [] notasA2 = {1.0,1.0,1.0};
  private double notaFinalA1 = 1.0;
  private double notaFinalA2 = 1.0;

  // Constructor
  public Alumno() {
  }

  public Alumno(String rut, String nombre, String apellido1, String apellido2) {
    this.rut = rut;
    this.nombre = nombre;
    this.apellido1 = apellido1;
    this.apellido2 = apellido2;
  }

  public Alumno(String rut, String nombre, String apellido1, String apellido2, double [] notasA1, double [] notasA2) {
    this.rut = rut;
    this.nombre = nombre;
    this.apellido1 = apellido1;
    this.apellido2 = apellido2;
    this.notasA1 = notasA1;
    this.notasA2 = notasA2;
  }

  // Getter y setters
  public void setRut(String rut){
    this.rut = rut;
  }
  public String getRut(){
    return rut;
  }

  public void setNombre(String nombre){
    this.nombre = nombre;
  }
  public String getNombre(){
    return nombre;
  }

  public void setApellido1(String apellido1){
    this.apellido1 = apellido1;
  }
  public String getApellido1(){
    return apellido1;
  }

  public void setApellido2(String apellido2){
    this.apellido2 = apellido2;
  }
  public String getApellido2(String apellido2){
    return apellido2;
  }

  public void setAsignatura1(String asignatura1){
    this.asignatura1 = asignatura1;
  }
  public String getAsignatura1(){
    return asignatura1;
  }

  public void setAsignatura2(String asignatura2){
    this.asignatura2 = asignatura2;
  }
  public String getAsignatura2(){
    return asignatura2;
  }

  public void setNotasA1(double [] notasA1) {
    this.notasA1 = notasA1;
    this.promedioA1();
  }
  public double [] getNotasA1(){
    return notasA1;
  }

  public void setNotasA2(double [] notasA2){
    this.notasA2 = notasA2;
    this.promedioA2();
  }
  public double [] getNotasA2(){
    return notasA2;
  }

  public void setNotaFinalA1(double notaFinalA1){
    this.notaFinalA1 = notaFinalA1;
  }
  public double getNotaFinalA1() {
    return notaFinalA1;
  }

  public void setNotaFinalA2(double notaFinalA2){
    this.notaFinalA2 = notaFinalA2;
  }
  public double setNotaFinalA2() {
    return notaFinalA2;
  }

  // Metodos
  public void promedioA1(){
    double suma = 0.0;
    for (double nota : this.notasA1) {
      suma += nota;
    }
    this.notaFinalA1 = suma / 3;
  }

  public void promedioA2(){
    double suma = 0.0;
    for (double nota : this.notasA2) {
      suma += nota;
    }
    this.notaFinalA2 = suma / 3;
  }

  public double promedioFinal() {
    return (this.notaFinalA1 + this.notaFinalA2) / 2;
  }

  public String datosAlumno(){
    return "Rut : "+this.rut+" | Nombre Completo : "+this.nombre+" "+this.apellido1+" "+this.apellido2;
  }

  public String actaAlumno(){
    return "%s | Promedios Asignaturas {%s : %.1f , %s : %.1f} | Promedio Final : %.1f".formatted(this.datosAlumno(),this.asignatura1,this.notaFinalA1,this.asignatura2,this.notaFinalA2,this.promedioFinal()); 
  }





}
