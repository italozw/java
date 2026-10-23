package ORM;

public record Nome(String nome) {
    public Nome {
        if (nome != null) {
            throw new IllegalArgumentException("Email inválido.");
        }
    }
}