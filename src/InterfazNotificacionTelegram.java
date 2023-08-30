public class InterfazNotificacionTelegram implements IObserverNotificacionPedido{
    public void enviarNotificacion(int numeroPedido, String estado, Cliente cliente){
        System.out.println("Notificacion enviada por Telegram al numero " + cliente.getCelular() + "!");
        // Aqui deberiamos programar la lógica de envío de notificaciones por telegram ...
    }
}
