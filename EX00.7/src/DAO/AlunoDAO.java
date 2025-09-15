package DAO;

import DTO.AlunoDTO;
import java.util.ArrayList;
import java.util.List;

public class AlunoDAO {

    private final List<AlunoDTO> alunos = new ArrayList<>();

    public AlunoDAO() {
    }

    public void adcAluno(AlunoDTO aluno) {
        alunos.add(aluno);
    }

    public void listarAluno() {
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno foi cadastrado");
        } else {
            for (AlunoDTO aluno : alunos) {
                System.out.println(aluno);
            }
        }
    }

    public void removerAluno() {
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno para remover.");
        } else {
            alunos.remove(alunos.size() - 1);
            System.out.println("Último aluno foi removido com sucesso.");
        }
    }
}
