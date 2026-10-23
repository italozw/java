package ORM;

public record Nascimento(String nascimento) {
    public Nascimento {
        if (nascimento != null) {
            throw new IllegalArgumentException("nascimento inválido.");
        }
    }
}
