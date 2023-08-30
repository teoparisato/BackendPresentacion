import java.util.ArrayList;

public class Pedido implements ISujetoNotificacionPedido {
    private int numero;
    private String estado;
    private Cliente cliente;
    private ArrayList<IObserverNotificacionPedido> observadores;

    // notifySuscribers
    public void notificar(){
        for (IObserverNotificacionPedido obs : observadores) {
            //enviarNotificaciones = update de la estructura del patron
            obs.enviarNotificacion(this.numero, this.estado, this.cliente); // Implementacion Push
        }
    }

    // subscribe
    public void añadirSuscriptores(IObserverNotificacionPedido obs){
        this.observadores.add(obs);
    }

    // unsubscribe
    public void quitarSuscriptores(IObserverNotificacionPedido obs){
        this.observadores.remove(obs);
    }

    public void confirmarPedido() {
        System.out.println("Pedido confirmado");
        setEstado("Confirmado");
    }

    // Constructor
    public Pedido(int numero, String estado, Cliente cliente) {
        this.numero = numero;
        this.estado = estado;
        this.cliente = cliente;
        this.observadores = new ArrayList<IObserverNotificacionPedido>();
    }

    // Getters and Setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
        notificar();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
