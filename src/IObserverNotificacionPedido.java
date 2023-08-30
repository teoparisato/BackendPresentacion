public interface IObserverNotificacionPedido {
    void enviarNotificacion(int numeroPedido, String estado, Cliente cliente);
}
