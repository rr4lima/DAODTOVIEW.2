package DAO;

import DTO.LivroDTO;
import java.util.ArrayList;
import java.util.List;

public class LivroDAO {

    private final List<LivroDTO> livros = new ArrayList<>();

    public LivroDAO() {
    }

    public void adcLivro(LivroDTO produto) {
        livros.add(produto);
    }

    public void listarLivro() {
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro foi cadastrado");
        } else {
            for (LivroDTO livro : livros) {
                System.out.println(livro);

            }

        }
    }

    public void removerLivro() {
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro para remover.");
        } else {
          livros.remove(livros.size() -1);
            System.out.println("Último livrto foi removido com sucesso.");
        }
    }
}
