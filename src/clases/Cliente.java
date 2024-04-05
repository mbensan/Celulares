package clases;

public class Cliente {
  private String rut;
  private String nombre;
  private int edad;
  private char sexo;
  private Celular celular;

  public Cliente(String rut, String nombre, int edad, char sexo, Celular celular) throws Exception {
    if (edad < 18) {
      throw new Exception("El cliente debe ser mayor de edad");
    }
    if (rut.length() < 9) {
      throw new Exception("No es un rut válido");
    }
    this.rut = rut;
    this.nombre = nombre;
    this.edad = edad;
    this.sexo = sexo;
    this.celular = celular;
  }

  public String toString() {
    String respuesta = "%s: (rut: %s) num: %s".formatted(
        this.nombre,
        this.rut,
        this.celular.getNumero());
    return respuesta;
  }

  public void modificarCelular(String nuevoNum) {
    this.celular.setNumero(nuevoNum);
  }

  public String getRut() {
    return rut;
  }

}
