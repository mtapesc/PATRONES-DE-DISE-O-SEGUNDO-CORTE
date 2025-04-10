package patterns.factory;

import models.Servicio;

// Interfaz para crear servicios
public interface ServicioFactory {
    Servicio crearServicio();
}