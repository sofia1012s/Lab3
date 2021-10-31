/****************************************************************
 * Imagen.java
 * 
 * @author Sofia Salguero
 * @version 31/10/2021
 * 
 * Clase para realizar posts de tipo imagen, hereda de la clase
 * multimedia
 ****************************************************************/

public class Imagen extends Multimedia{
    private String formato;
    private float resolucion;

    /**
     * @param autor
     * @param fecha
     * @param hora
     * @param URL
     * @param tamano
     * @param formato
     * @param resolucion
     */
    public Imagen(String autor, String fecha, String hora, String URL, float tamano, String formato, float resolucion) {
        super(autor, fecha, hora, URL, tamano);
        this.formato = formato;
        this.resolucion = resolucion;
        tipo = 2;
    }

    
    /** 
     * @return String
     */
    public String getFormato() {
        return formato;
    }

    
    /** 
     * @return float
     */
    public float getResolucion() {
        return resolucion;
    }

    
    /** 
     * @param contenido
     */
    @Override
    public void setContenido(String contenido) {
        
    }



}
