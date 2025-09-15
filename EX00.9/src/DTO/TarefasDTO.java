package DTO;

public class TarefasDTO {
    private String titulo;
    private String descricao;
    private String prazo;

    public TarefasDTO(String titulo, String descricao, String prazo) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.prazo = prazo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPrazo() {
        return prazo;
    }

    public void setPrazo(String prazo) {
        this.prazo = prazo;
    }

    @Override
    public String toString() {
        return "TarefasDTO{" + "titulo=" + titulo + ", descricao=" + descricao + ", prazo=" + prazo + '}';
    }

    }

