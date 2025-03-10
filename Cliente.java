import java.time.LocalDate;

public class Cliente {
    private int id;
    private String nome;
    private LocalDate dataNascimento;
    private String email;

    public Cliente(int id, String nome, LocalDate dataNascimento, String email) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }
}