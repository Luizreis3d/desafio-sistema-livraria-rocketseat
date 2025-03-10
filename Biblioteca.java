import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros = new ArrayList<>();

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void listarLivrosDisponiveis() {
        System.out.println("Livros disponíveis para empréstimo:");
        for (Livro livro : livros) {
            if (livro.isDisponivel()) {
                System.out.println(livro.getId() + ". " + livro.getTitulo() + " - " + livro.getAutorNome());
            }
        }
    }

    public Livro buscarLivroPorId(int id) {
        for (Livro livro : livros) {
            if (livro.getId() == id && livro.isDisponivel()) {
                return livro;
            }
        }
        return null;
    }
}
