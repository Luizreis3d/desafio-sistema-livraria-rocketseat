import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Biblioteca {
    private List<Livro> livros = new ArrayList<>();
    private List<Autor> autores = new ArrayList<>();
    private List<Emprestimo> emprestimos = new ArrayList<>();

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void listarLivrosDisponiveis() {
        System.out.println("Livros disponíveis para empréstimo:");
        livros.stream()
              .filter(Livro::isDisponivel)
              .forEach(livro -> System.out.println(livro.getId() + ". " + livro.getTitulo() + " - " + livro.getAutorNome()));
    }

    public Livro buscarLivroPorId(int id) {
        return livros.stream()
                     .filter(livro -> livro.getId() == id && livro.isDisponivel())
                     .findFirst()
                     .orElse(null);
    }

    public void registrarEmprestimo(Cliente cliente, Livro livro) {
        livro.emprestar();
        emprestimos.add(new Emprestimo(cliente, livro));
    }

    public void mostrarHistoricoEmprestimos() {
        System.out.println("Histórico de empréstimos:");
        emprestimos.forEach(emp -> System.out.println(emp.getDetalhes()));
    }
}