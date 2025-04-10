package models;

import java.util.ArrayList;
import java.util.List;

// La clase Pedido representa un pedido realizado por un cliente
public class Pedido {
    // Atributos privados
    private Cliente cliente; // Cliente que realiza el pedido
    private List<Servicio> servicios; // Lista de servicios incluidos en el pedido

    // Constructor de la clase Pedido
    // Recibe un cliente y una lista de servicios
    public Pedido(Cliente cliente, List<Servicio> servicios) {
        this.cliente = cliente; // Asignamos el cliente al atributo cliente
        // Si la lista de servicios es nula, inicializamos una lista vacía
        this.servicios = servicios != null ? servicios : new ArrayList<>();
    }

    // Método para calcular el costo total del pedido
    // Suma el costo de todos los servicios incluidos en el pedido
    public double calcularTotal() {
        return servicios.stream().mapToDouble(Servicio::calcularCosto).sum();
    }

    // Método para agregar un servicio al pedido
    public void agregarServicio(Servicio servicio) {
        servicios.add(servicio); // Añadimos el servicio a la lista de servicios
    }

    // Métodos "getter" y "setter" para acceder y modificar los atributos privados

    // Devuelve el cliente que realizó el pedido
    public Cliente getCliente() {
        return cliente;
    }

    // Permite cambiar el cliente que realizó el pedido
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    // Devuelve la lista de servicios incluidos en el pedido
    public List<Servicio> getServicios() {
        return servicios;
    }

    // Permite cambiar la lista de servicios incluidos en el pedido
    public void setServicios(List<Servicio> servicios) {
        this.servicios = servicios;
    }
}