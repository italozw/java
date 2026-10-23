package ORM;

public record Cpf(String cpf) {
    public Cpf {
        if (cpf != null) {
            cpf = cpf.replaceAll("\\\\D", "");
        }
        if (cpf == null || cpf.length() != 11) {
            throw new IllegalArgumentException("CPF inválido: deve conter exatamente 11 dígitos numéricos.");
        }
    }
}