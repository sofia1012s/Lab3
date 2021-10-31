/****************************************************************
 * Texto.java
 * 
 * @author Sofia Salguero
 * @version 31/10/2021
 * 
 * Clase para realizar publicaciones de tipo texto, hereda de la
 * clase Post
 ****************************************************************/

public class Texto extends Post {

    /**
     * @param autor
     * @param fecha
     * @param hora
     */
    public Texto(String autor, String fecha, String hora) {
        super(autor, fecha, hora);
        tipo = 1;
    }

    /**
     * @param texto
     */
    @Override
    public void setContenido(String texto) {
        contenido = texto;
    }

}
