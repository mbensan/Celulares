public class Celular extends Servicio {
  private String numero;
  private String marca;

  public Celular(String cod, String numero, String marca) throws Exception {
    super(cod, "celular");
    if (numero.length() != 8) {
      throw new Exception("El número de telefono debe ser de largo 8");
    }
    this.numero = numero;
    this.marca = marca;
  }

}
