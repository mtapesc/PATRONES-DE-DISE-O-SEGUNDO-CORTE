package main;

import models.*;
import patterns.facade.ServicioFacade;
import patterns.factory.*;

public class Main {
    public static void main(String[] args) {
        // Crear cliente
        Cliente cliente = new Cliente("123456789", "Juan Pérez");

        // Crear las fábricas
        ImpresionFactory impresionFactory = new ImpresionFactory();
        FotografiaFactory fotografiaFactory = new FotografiaFactory();

        // Crear la fachada para gestionar los servicios y pedidos
        ServicioFacade servicioFacade = new ServicioFacade(cliente, impresionFactory, fotografiaFactory);

        // Agregar servicios al pedido
        servicioFacade.agregarImpresion("Color", "imagen1.jpg", "imagen2.jpg");
        servicioFacade.agregarFotografia("Retrato", 3);

        // Mostrar detalles del pedido
        Pedido pedido = servicioFacade.getPedido();

        System.out.println("=== Detalles del Pedido ===");
        for (Servicio servicio : pedido.getServicios()) {
            if (servicio instanceof Impresion) {
                Impresion impresion = (Impresion) servicio;
                System.out.println("Servicio de Impresión:");
                System.out.println("Color: " + impresion.getColor());
                System.out.println("Cantidad de imágenes: " + impresion.getImagenes().size());
                System.out.println("Costo: " + impresion.calcularCosto());
            } else if (servicio instanceof Fotografia) {
                Fotografia fotografia = (Fotografia) servicio;
                System.out.println("Servicio de Fotografía:");
                System.out.println("Tipo: " + fotografia.getTipoFotografia());
                System.out.println("Cantidad de fotos: " + fotografia.getCantidadFotos());
                System.out.println("Costo: " + fotografia.calcularCosto());
            }
        }

        System.out.println("=== Resumen del Pedido ===");
        System.out.println("Costo total del pedido: " + servicioFacade.calcularCostoTotal());
    }
}