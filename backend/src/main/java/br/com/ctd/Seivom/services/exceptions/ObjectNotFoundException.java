package br.com.ctd.Seivom.services.exceptions;

public class ObjectNotFoundException extends RuntimeException {
    public ObjectNotFoundException(String message) {
        super(message);
    }
    public ObjectNotFoundException(Long id, Class<?> className) {
        super("Object not found. id: " + id + " to: " + className.getSimpleName());
    }
}
