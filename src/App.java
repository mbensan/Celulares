import clases.*;

public class App {
    public static void main(String[] args) throws Exception {
        Servicio servicioBasico = new Servicio("celu", "celular");

        Celular celMio = new Celular("MOB", "12345678", "Huawei");
        System.out.println(celMio);
        Cliente yogi = new Cliente("1234567-8", "Oso Yogi", 20, 'o', celMio);
        System.out.println(yogi);
    }
}
