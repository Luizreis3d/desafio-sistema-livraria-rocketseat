import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Biblioteca biblioteca = new Biblioteca();

            Autor tolkien = new Autor(1, "J.R.R. Tolkien", LocalDate.of(1892, 1, 3));
            biblioteca.adicionarLivro(new Livro(1, "O Senhor dos Anéis: A Sociedade do Anel", tolkien));
            biblioteca.adicionarLivro(new Livro(2, "O Senhor dos Anéis: As Duas Torres", tolkien));
            biblioteca.adicionarLivro(new Livro(3, "O Senhor dos Anéis: O Retorno do Rei", tolkien));

            boolean executando = true;
            while (executando) {
                System.out.println("Você gostaria de ver os livros disponíveis? (S/N)");
                String resposta = scanner.nextLine().trim().toUpperCase();

                if (resposta.equals("S")) {
                    biblioteca.listarLivrosDisponiveis();
                    System.out.println("Digite o ID do livro que deseja emprestar:");
                    try {
                        int idLivro = Integer.parseInt(scanner.nextLine());
                        Livro livroSelecionado = biblioteca.buscarLivroPorId(idLivro);
                        if (livroSelecionado != null) {
                            System.out.println("Digite seu nome:");
                            String nomeUsuario = scanner.nextLine();
                            System.out.println("Digite seu email:");
                            String emailUsuario = scanner.nextLine();
                            Cliente cliente = new Cliente(new Random().nextInt(1000), nomeUsuario, LocalDate.now(), emailUsuario);

                            biblioteca.registrarEmprestimo(cliente, livroSelecionado);
                            System.out.println("O livro '" + livroSelecionado.getTitulo() + "' foi emprestado com sucesso para " + nomeUsuario + ".");
                        } else {
                            System.out.println("Livro não encontrado ou já emprestado.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("ID inválido. Por favor, digite um número.");
                    }
                } else if (resposta.equals("N")) {
                    System.out.println("Deseja ver o histórico de empréstimos? (S/N)");
                    String historicoResposta = scanner.nextLine().trim().toUpperCase();
                    if (historicoResposta.equals("S")) {
                        biblioteca.mostrarHistoricoEmprestimos();
                    }
                    System.out.println("Sistema encerrado.");
                    executando = false;
                } else {
                    System.out.println("Opção inválida. Digite 'S' para sim ou 'N' para não.");
                }
            }
        }
    }
}