package ORM;

public record Endereco(String endereco) {
    public Endereco {
        if (endereco != null) {
            throw new IllegalArgumentException("nascimento inválido.");
        }
    }
}
