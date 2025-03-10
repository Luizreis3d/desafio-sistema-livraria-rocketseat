## Sobre o Desafio
Este projeto tem como objetivo reforçar os conceitos aprendidos no módulo de **Fundamentos de Java**, aplicando-os na prática. O sistema permite que os usuários interajam com uma biblioteca virtual, listem livros disponíveis e realizem empréstimos.

## Funcionalidades Principais
Listar Livros Disponíveis: Exibe todos os livros que estão disponíveis para empréstimo.

Realizar Empréstimo: Permite que o usuário escolha um livro disponível e registre o empréstimo.

Cadastro de Livros: Adiciona novos livros à biblioteca (com título e autor).

Histórico de Empréstimos: Mantém um registro de todos os empréstimos realizados.

## Estrutura do Projeto
O projeto é organizado em classes simples para manter a clareza e a organização do código:

- Livro: id, titulo, autor, disponivel, dataCadastro, dataAtualizacao.
- Autor: id, nome, dataNascimento.
- Biblioteca: livros, autores, emprestimos.
- Cliente: id, nome, dataNascimento, email.
- Emprestimo: cliente, livro, dataEmprestimo.
- Main: Classe principal com o método main para execução.

## Pré-requisitos
- JDK (Java Development Kit) instalado.
- IDE de sua escolha (Eclipse, IntelliJ IDEA, NetBeans, etc.)
- Extensão Java Extension Pack (se estiver usando VS Code).

## Regras de Negócio
Gerenciamento de Livros: 
* Apenas livros marcados como disponíveis podem ser emprestados. O usuário deve informar seu nome ao realizar um empréstimo.

Empréstimo de Livros:
* Ao realizar um empréstimo, o livro é marcado como indisponível e não pode ser emprestado novamente durante a execução do programa.

## Melhorias Futuras
O projeto pode ser expandido com funcionalidades adicionais:

**Cadastro de Clientes:**
* Adicionar uma classe Cliente para gerenciar usuários e associar empréstimos.

**Histórico de Empréstimos:**
* Manter um registro completo de empréstimos, incluindo datas e status.

**Busca de Livros:**
* Implementar filtros para buscar livros por título, autor ou gênero.

**Menu Interativo:**
* Criar um menu para cadastrar livros, listar disponíveis e gerenciar empréstimos.

## 📄 Licença
Este projeto está licenciado sob a licença MIT.
