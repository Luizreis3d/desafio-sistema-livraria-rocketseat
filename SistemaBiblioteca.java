import java.util.Scanner;
import java.util.Date;

public class SistemaBiblioteca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();

        Autor tolkien = new Autor(1, "J.R.R. Tolkien", new Date());
        biblioteca.adicionarLivro(new Livro(1, "O Senhor dos Anéis: A Sociedade do Anel", tolkien));
        biblioteca.adicionarLivro(new Livro(2, "O Senhor dos Anéis: As Duas Torres", tolkien));
        biblioteca.adicionarLivro(new Livro(3, "O Senhor dos Anéis: O Retorno do Rei", tolkien));

        while (true) {
            System.out.println("Você gostaria de ver os livros disponíveis? (S/N)");
            String resposta = scanner.nextLine().trim().toUpperCase();
            
            if (resposta.equals("S")) {
                biblioteca.listarLivrosDisponiveis();
                System.out.println("Digite o ID do livro que deseja emprestar:");
                int idLivro = scanner.nextInt();
                scanner.nextLine(); // Limpar buffer
                
                Livro livroSelecionado = biblioteca.buscarLivroPorId(idLivro);
                if (livroSelecionado != null) {
                    System.out.println("Digite seu nome:");
                    String nomeUsuario = scanner.nextLine();
                    
                    livroSelecionado.emprestar();
                    System.out.println("O livro '" + livroSelecionado.getTitulo() + "' foi emprestado com sucesso para " + nomeUsuario + ".");
                } else {
                    System.out.println("Livro não encontrado ou já emprestado.");
                }
            } else if (resposta.equals("N")) {
                System.out.println("Sistema encerrado.");
                break;
            } else {
                System.out.println("Opção inválida. Digite 'S' para sim ou 'N' para não.");
            }
        }
        scanner.close();
    }
}
