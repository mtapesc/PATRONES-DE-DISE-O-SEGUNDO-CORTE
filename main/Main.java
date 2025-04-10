package main;

import models.*;
import patterns.facade.ServicioFacade;

public class Main {
    public static void main(String[] args) {
        // Crear cliente
        Cliente cliente = new Cliente("123456789", "Juan Pérez");

        // Crear la fachada para gestionar los servicios y pedidos
        ServicioFacade servicioFacade = new ServicioFacade(cliente);

        // Crear y configurar el servicio de impresión
        servicioFacade.agregarImpresion("Color", "imagen1.jpg", "imagen2.jpg");

        // Crear y configurar el servicio de fotografía
        servicioFacade.agregarFotografia("Retrato", 3);

        // Obtener el pedido actual
        Pedido pedido = servicioFacade.getPedido();


        // Mostrar detalles del servicio de impresión
        System.out.println("=== Servicio de Impresión ===");
System.out.println("Color: " + ((Impresion) pedido.getServicios().get(0)).getColor());
System.out.println("Cantidad de imágenes: " + ((Impresion) pedido.getServicios().get(0)).getImagenes().size());
System.out.println("Costo total: " + ((Impresion) pedido.getServicios().get(0)).calcularCosto());


        // Obtener el primer servicio de fotografía
        Fotografia fotografia = (Fotografia) pedido.getServicios().get(1);

        // Mostrar detalles del servicio de fotografía
        System.out.println("=== Servicio de Fotografía ===");
        System.out.println("Tipo de fotografía: " + fotografia.getTipoFotografia());
        System.out.println("Cantidad de fotos: " + fotografia.getCantidadFotos());
        System.out.println("Costo total: " + fotografia.calcularCosto());

        // Calcular y mostrar el costo total del pedido
        System.out.println("=== Resumen del Pedido ===");
        System.out.println("Cliente: " + cliente.getNombre() + " (Cédula: " + cliente.getCedula() + ")");
        System.out.println("Costo total del pedido: " + servicioFacade.calcularCostoTotal());
    }
}