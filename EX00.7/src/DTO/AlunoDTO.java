package DTO;

public class AlunoDTO {
    private String nome;
    private String matricula;
    private String curso;

    public AlunoDTO(String nome, String matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "AlunoDTO{" + "nome=" + nome + ", matricula=" + matricula + ", curso=" + curso + '}';
    }
}
