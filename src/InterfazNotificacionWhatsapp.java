public class InterfazNotificacionWhatsapp implements IObserverNotificacionPedido{
    public void enviarNotificacion(int numeroPedido, String estado, Cliente cliente) {
        System.out.println("Notificacion enviada por Whatsapp al numero " + cliente.getCelular() + "!");
        // aqui deberiamos implementar la lógica de envío de notificaciones por whatsapp ...
    }

}
