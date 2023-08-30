public class InterfazNotificacionEmail implements IObserverNotificacionPedido{
    public void enviarNotificacion(int numeroPedido, String estado, Cliente cliente) {
        System.out.println("Notificación enviada al mail " + cliente.getEmail() + "!");
        // Aqui deberiamos programar la lógica de envío de notificaciones por mail ...
    }
}
