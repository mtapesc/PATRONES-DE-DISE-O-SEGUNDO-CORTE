package models;

// Importamos la clase List para manejar listas de servicios
import java.util.List;

// La clase Cliente representa a un cliente que realiza pedidos
public class Cliente {
    // Atributos privados para almacenar la cédula y el nombre del cliente
    private String cedula; // Identificación única del cliente
    private String nombre; // Nombre del cliente

    // Constructor de la clase Cliente
    // Este método se llama cuando creamos un nuevo cliente y le asignamos su cédula y nombre
    public Cliente(String cedula, String nombre) {
        this.cedula = cedula; // Asignamos la cédula al atributo cedula
        this.nombre = nombre; // Asignamos el nombre al atributo nombre
    }

    // Método para que el cliente realice un pedido
    // Recibe una lista de servicios y devuelve un objeto Pedido
    public Pedido realizarPedido(List<Servicio> servicios) {
        // Creamos un nuevo pedido asociándolo a este cliente y a los servicios seleccionados
        return new Pedido(this, servicios);
    }

    // Métodos "getter" y "setter" para acceder y modificar los atributos privados

    // Devuelve la cédula del cliente
    public String getCedula() {
        return cedula;
    }

    // Permite cambiar la cédula del cliente
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    // Devuelve el nombre del cliente
    public String getNombre() {
        return nombre;
    }

    // Permite cambiar el nombre del cliente
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}