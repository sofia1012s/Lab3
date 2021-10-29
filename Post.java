public abstract class Post {
    protected String autor;
    protected String fecha;
    protected String hora;
    protected int likes = 0;

    protected String[] comentarios = new String[] {};

    // public abstract void publicar(Post[] posts);

    //public abstract String toString();

    public Post(String autor, String fecha, String hora) {
        this.autor = autor;
        this.fecha = fecha;
        this.hora = hora;
    }


    public void darleLike() {
        likes++;
    }

    public String getAutor()
    {
        return autor;
    }

    public String[] getComentarios() {
        return comentarios;
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
}
