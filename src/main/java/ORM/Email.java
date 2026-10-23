package ORM;

public record Email(String email) {
    public Email {
        if (email != null) {
            throw new IllegalArgumentException("Email inválido.");
        }
    }
}
