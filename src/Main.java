import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creamos el sujeto/publicador
        Cliente cliente1 = new Cliente("Juan", "Lopez","3512233111","juanlopez@gmail.com");
        Pedido pedido1 = new Pedido(1, "Creado", cliente1);
        System.out.println("Pedido creado");

        // Creamos los suscriptores/observadores
        InterfazNotificacionTelegram telegram = new InterfazNotificacionTelegram();
        InterfazNotificacionEmail email = new InterfazNotificacionEmail();
        InterfazNotificacionWhatsapp whatsapp = new InterfazNotificacionWhatsapp();

        // Suscribimos los observadores al publicador
        pedido1.añadirSuscriptores(telegram);
        pedido1.añadirSuscriptores(email);
        pedido1.añadirSuscriptores(whatsapp);

        // Confirmar Pedido
        System.out.println("Presione 'Enter' para confirmar el pedido ...");
        String x = scanner.nextLine();
        pedido1.confirmarPedido();
    }
}


