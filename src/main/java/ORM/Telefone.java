package ORM;

public record Telefone(String telefone) {
    public Telefone {
        if (telefone != null) {
            throw new IllegalArgumentException("telefone inválido.");
        }
    }
}