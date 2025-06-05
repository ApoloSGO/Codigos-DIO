package Pesquisa;

public class Livro {
    //Atributos

    private String titulo;

    private String autor;

    private int anoDePublicacao;


    public Livro(String titulo, String autor, int anoDePublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePublicacao = anoDePublicacao;

    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoDePublicacao;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Livro {" +
                "titulo ='" + titulo + '\'' +
                ", autor ='" + autor + '\'' +
                ", anoPublicacao =" + anoDePublicacao +
            '}';
    }


}
