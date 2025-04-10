package patterns.facade;

import models.*;
import patterns.factory.*;

// La clase ServicioFacade simplifica la interacción con los servicios y pedidos
public class ServicioFacade {
    private Pedido pedido; // Pedido actual

    // Constructor que inicializa el pedido para un cliente
    public ServicioFacade(Cliente cliente) {
        this.pedido = new Pedido(cliente, null); // Inicializamos el pedido con una lista vacía
    }

    // Método para agregar un servicio de impresión al pedido
    public void agregarImpresion(String color, String... imagenes) {
        // Crear el servicio de impresión usando la fábrica
        ImpresionFactory impresionFactory = new ImpresionFactory();
        Impresion impresion = impresionFactory.crearImpresion();
        impresion.setColor(color);

        // Agregar las imágenes al servicio
        for (String imagen : imagenes) {
            impresion.agregarImagen(new Imagen(imagen));
        }

        // Agregar el servicio al pedido
        pedido.agregarServicio(impresion);
    }

    // Método para agregar un servicio de fotografía al pedido
    public void agregarFotografia(String tipoFotografia, int cantidadFotos) {
        // Crear el servicio de fotografía usando la fábrica
        FotografiaFactory fotografiaFactory = new FotografiaFactory();
        Fotografia fotografia = fotografiaFactory.crearFotografia();
        fotografia.setTipoFotografia(tipoFotografia);
        fotografia.setCantidadFotos(cantidadFotos);

        // Agregar el servicio al pedido
        pedido.agregarServicio(fotografia);
    }

    // Método para calcular el costo total del pedido
    public double calcularCostoTotal() {
        return pedido.calcularTotal();
    }

    // Método para obtener el pedido actual
    public Pedido getPedido() {
        return pedido;
    }
}