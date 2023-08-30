import java.util.ArrayList;

public interface ISujetoNotificacionPedido {
    // notifySuscribers
    void notificar();

    // subscribe
    void añadirSuscriptores(IObserverNotificacionPedido obs);

    // unsubscribe
    void quitarSuscriptores(IObserverNotificacionPedido obs);
}
