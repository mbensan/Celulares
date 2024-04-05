package clases;

public class Servicio {
  private String cod;
  private String tipo;

  public Servicio(String cod, String tipo) throws Exception {
    if (!tipo.equals("celular") && !tipo.equals("tv_cable") && !tipo.equals("internet")) {
      throw new Exception("Ese tipo de servicio no está disponible");
    }
    this.cod = cod;
    this.tipo = tipo;
  }

}
