/****************************************************************
 * Emoticono.java
 * 
 * @author Sofia Salguero
 * @version 31/10/2021
 * 
 * Clase para realizar posts de tipo emoticono, hereda de la clase
 * post
 ****************************************************************/

public class Emoticono extends Post{

    /**
     * @param autor
     * @param fecha
     * @param hora
     */
    public Emoticono(String autor, String fecha, String hora) {
        super(autor, fecha, hora);
        tipo = 5;
    }

    
    /** 
     * @param contenido
     */
    @Override
    public void setContenido(String contenido) {
        this.contenido = contenido;
        
    }

    
}
