import java.util.ArrayList;

public abstract class Post {
    protected String autor;
    protected String fecha;
    protected String hora;
    protected int likes = 0;
    protected String contenido;
    protected int tipo = 0;

    ArrayList<String> comentarios = new ArrayList<String>();

    ArrayList<String> hashtags = new ArrayList<String>();

    public Post(String autor, String fecha, String hora) {
        this.autor = autor;
        this.fecha = fecha;
        this.hora = hora;
    }

    public abstract void setContenido(String contenido);

    public void darleLike() {
        likes++;
    }

    public String getAutor()
    {
        return autor;
    }

    public void setComentario(String comentario) {
        comentarios.add(comentario);
    }

    public ArrayList<String> getComentarios() {
        return comentarios;
    } 

    public void setHashtag(String hashtag) {
        hashtags.add(hashtag);
    }

    public ArrayList<String> gethashtags() {
        return hashtags; 
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public int getLikes() {
        return likes;
    }


    public String getContenido() {
        return contenido;
    }

    public int getTipo() {
        return tipo;
    }

}
