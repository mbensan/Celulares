package clases;

import java.util.ArrayList;

public class Compania {
  private String nombre;
  private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
  private int cantClientes = 0;
  private int capMaxima;

  public Compania(String nombre, int capMaxima) {
    this.nombre = nombre;
    this.capMaxima = capMaxima;
  }

  public void agregarCliente(Cliente nuevo) {
    clientes.add(nuevo);
    this.cantClientes++;
  }

  private Cliente buscarCliente(String rutBuscado) {
    for (Cliente x : this.clientes) {
      if (x.getRut().equals(rutBuscado)) {
        return x;
      }
    }
    return null;
  }

  public void modificarCliente(String rutCliente, String nuevoNum) {
    Cliente buscado = buscarCliente(rutCliente);
    buscado.modificarCelular(nuevoNum);
  }

}
