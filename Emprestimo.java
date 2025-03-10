import java.time.LocalDate;

public class Emprestimo {
    private Cliente cliente;
    private Livro livro;
    private LocalDate dataEmprestimo;

    public Emprestimo(Cliente cliente, Livro livro) {
        this.cliente = cliente;
        this.livro = livro;
        this.dataEmprestimo = LocalDate.now();
    }

    public String getDetalhes() {
        return String.format("Livro: %s | Cliente: %s | Data: %s", 
                            livro.getTitulo(), cliente.getNome(), dataEmprestimo);
    }
}