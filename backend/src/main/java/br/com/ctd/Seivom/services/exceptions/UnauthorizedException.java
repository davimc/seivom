package br.com.ctd.Seivom.services.exceptions;

public class UnauthorizedException extends RuntimeException {
    public UnauthorizedException(String message) {
        super(message);
    }
    public UnauthorizedException(Long id, Class<?> className) {
        super("Object not found. id: " + id + " to: " + className.getSimpleName());
    }
}
