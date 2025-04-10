package patterns.facade;

import models.*;
import patterns.factory.ServicioFactory;
import java.util.List;
import java.util.ArrayList;

// La clase ServicioFacade simplifica la interacción con los servicios y pedidos
public class ServicioFacade {
    private Pedido pedido; // Pedido actual
    private ServicioFactory impresionFactory; // Fábrica para servicios de impresión
    private ServicioFactory fotografiaFactory; // Fábrica para servicios de fotografía

    // Constructor que inicializa el pedido para un cliente y recibe las fábricas
    public ServicioFacade(Cliente cliente, ServicioFactory impresionFactory, ServicioFactory fotografiaFactory) {
        List<Servicio> servicios = new ArrayList<>(); // Usamos la interfaz List
        this.pedido = new Pedido(cliente, servicios); // Inicializamos el pedido con la lista
        this.impresionFactory = impresionFactory;
        this.fotografiaFactory = fotografiaFactory;
    }

    // Método para agregar un servicio de impresión al pedido
    public void agregarImpresion(String color, String imagen1, String imagen2) {
        // Crear el servicio de impresión usando la fábrica
        Impresion impresion = (Impresion) impresionFactory.crearServicio();
        impresion.setColor(color);

        // Agregar las imágenes al servicio
        impresion.agregarImagen(new Imagen(imagen1));
        impresion.agregarImagen(new Imagen(imagen2));

        // Agregar el servicio al pedido
        pedido.agregarServicio(impresion);
    }

    // Método para agregar un servicio de fotografía al pedido
    public void agregarFotografia(String tipoFotografia, int cantidadFotos) {
        // Crear el servicio de fotografía usando la fábrica
        Fotografia fotografia = (Fotografia) fotografiaFactory.crearServicio();
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