package tinoborrelli.blog.exceptions;

public class NotFoundException extends RuntimeException {
    public NotFoundException(int id) {
        super("Nessun elemento con id " + id + " è stato trovato");
    }
}
