package patterns.factory;

import models.Servicio;

// La clase abstracta ServicioFactory define una fábrica base para crear servicios
// No se puede instanciar directamente, pero sirve como plantilla para las fábricas concretas
public abstract class ServicioFactory {
    // Método abstracto para crear un servicio
    // Las clases que hereden de ServicioFactory deben implementar este método
    public abstract Servicio crearServicio();
}