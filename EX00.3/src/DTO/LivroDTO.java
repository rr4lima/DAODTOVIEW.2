
package DTO;

public class LivroDTO {
    private String titulo, autor;
    private int anoPublic;

    public LivroDTO(String titulo, String autor, int anoPublic) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublic = anoPublic;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublic() {
        return anoPublic;
    }

    public void setAnoPublic(int anoPublic) {
        this.anoPublic = anoPublic;
    }

    @Override
    public String toString() {
        return "LivroDTO{" + "titulo=" + titulo + ", autor=" + autor + ", anoPublic=" + anoPublic + '}';
    }

    
    
}

