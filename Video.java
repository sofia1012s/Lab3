/****************************************************************
 * Video.java
 * 
 * @author Sofia Salguero
 * @version 31/10/2021
 * 
 * Clase para realizar publicaciones de tipo Video. Hereda de la
 * clase multimedia
 ****************************************************************/
public class Video extends Multimedia{
    private float fps;
    
    /**
     * @param autor
     * @param fecha
     * @param hora
     * @param URL
     * @param tamano
     * @param fps
     */
    public Video(String autor, String fecha, String hora, String URL, float tamano, float fps) {
        super(autor, fecha, hora, URL, tamano);
       this.fps = fps;
       tipo = 3;
    }

    
    /** 
     * @return float
     */
    public float getFps() {
        return fps;
    }

    
    /** 
     * @param contenido
     */
    @Override
    public void setContenido(String contenido) {
        
    }
}
