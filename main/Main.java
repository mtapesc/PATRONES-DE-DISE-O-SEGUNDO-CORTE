package main;

import models.*;
import patterns.factory.*;
import patterns.strategy.*;
import patterns.decorator.*;

public class Main {
    public static void main(String[] args) {
        // Crear cliente
        // Creamos un cliente con su cédula y nombre
        Cliente cliente = new Cliente("123456789", "Juan Pérez");

        // Crear servicio de impresión
        // Usamos la fábrica de impresión para crear un servicio de tipo Impresion
        ImpresionFactory impresionFactory = new ImpresionFactory();
        Impresion impresion = (Impresion) impresionFactory.crearServicio();

        // Configuramos la estrategia de cálculo de costo para el servicio de impresión
        impresion.setCostoStrategy(new CostoImpresionStrategy());

        // Configuramos el color de la impresión
        impresion.setColor("Color");

        // Agregamos imágenes al servicio de impresión
        impresion.agregarImagen(new Imagen("imagen1.jpg"));
        impresion.agregarImagen(new Imagen("imagen2.jpg"));

        // Aplicar descuento al servicio de impresión
        // Usamos el decorador para aplicar un descuento al costo del servicio
        DescuentoDecorator impresionConDescuento = new DescuentoDecorator(impresion, 5.0);

        // Mostrar detalles del servicio de impresión
        // Imprimimos en consola los detalles del servicio de impresión
        System.out.println("=== Servicio de Impresión ===");
        System.out.println("Color: " + impresion.getColor());
        System.out.println("Cantidad de imágenes: " + impresion.getImagenes().size());
        System.out.println("Costo total (con descuento): " + impresionConDescuento.calcularCosto());
        System.out.println("---------------------------");

        // Crear servicio de fotografía
        // Usamos la fábrica de fotografía para crear un servicio de tipo Fotografia
        FotografiaFactory fotografiaFactory = new FotografiaFactory();
        Fotografia fotografia = (Fotografia) fotografiaFactory.crearServicio();

        // Configuramos la estrategia de cálculo de costo para el servicio de fotografía
        fotografia.setCostoStrategy(new CostoFotografiaStrategy());

        // Configuramos el tipo de fotografía
        fotografia.setTipoFotografia("Retrato");

        // Configuramos la cantidad de fotos
        fotografia.setCantidadFotos(3);

        // Agregar costo extra al servicio de fotografía
        // Usamos el decorador para agregar un costo extra al servicio
        CostoExtraDecorator fotografiaConCostoExtra = new CostoExtraDecorator(fotografia, 10.0);

        // Mostrar detalles del servicio de fotografía
        // Imprimimos en consola los detalles del servicio de fotografía
        System.out.println("=== Servicio de Fotografía ===");
        System.out.println("Tipo de fotografía: " + fotografia.getTipoFotografia());
        System.out.println("Cantidad de fotos: " + fotografia.getCantidadFotos());
        System.out.println("Costo total (con costo extra): " + fotografiaConCostoExtra.calcularCosto());
        System.out.println("---------------------------");

        // Calcular y mostrar el total del pedido
        // Sumamos los costos de los servicios decorados y mostramos el total
        double totalPedido = impresionConDescuento.calcularCosto() + fotografiaConCostoExtra.calcularCosto();
        System.out.println("=== Resumen del Pedido ===");
        System.out.println("Cliente: " + cliente.getNombre() + " (Cédula: " + cliente.getCedula() + ")");
        System.out.println("Total del pedido: " + totalPedido);
    }
}