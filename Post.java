/****************************************************************
 * Post.java
 * 
 * @author Sofia Salguero
 * @version 31/10/2021
 * 
 * Clase abstracta para realizar publicaciones
 ****************************************************************/

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

    /**
     * @param autor
     * @param fecha
     * @param hora
     */
    public Post(String autor, String fecha, String hora) {
        this.autor = autor;
        this.fecha = fecha;
        this.hora = hora;
    }

    
    /** 
     * @param darleLike(
     */
    public abstract void setContenido(String contenido);

    public void darleLike() {
        likes++;
    }

    
    /** 
     * @return String
     */
    public String getAutor()
    {
        return autor;
    }

    
    /** 
     * @param comentario
     */
    public void setComentario(String comentario) {
        comentarios.add(comentario);
    }

    
    /** 
     * @return ArrayList<String>
     */
    public ArrayList<String> getComentarios() {
        return comentarios;
    } 

    
    /** 
     * @param hashtag
     */
    public void setHashtag(String hashtag) {
        hashtags.add(hashtag);
    }

    
    /** 
     * @return ArrayList<String>
     */
    public ArrayList<String> gethashtags() {
        return hashtags; 
    }

    
    /** 
     * @return String
     */
    public String getFecha() {
        return fecha;
    }

    
    /** 
     * @return String
     */
    public String getHora() {
        return hora;
    }

    
    /** 
     * @return int
     */
    public int getLikes() {
        return likes;
    }


    
    /** 
     * @return String
     */
    public String getContenido() {
        return contenido;
    }

    
    /** 
     * @return int
     */
    public int getTipo() {
        return tipo;
    }

}
