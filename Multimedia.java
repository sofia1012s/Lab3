/****************************************************************
 * Multimedia.java
 * 
 * @author Sofia Salguero
 * @version 31/10/2021
 * 
 * Clase abstracta para publicaciones de tipo multimedia, hereda 
 * de la clase post
 ****************************************************************/

public  abstract class Multimedia extends Post {
    protected String URL;
    protected float tamano;

    /**
     * @param autor
     * @param fecha
     * @param hora
     * @param URL
     * @param tamano
     */
    public Multimedia(String autor, String fecha, String hora, String URL,float tamano) {
        super(autor, fecha, hora);
        this.URL = URL;
        this.tamano = tamano;
    }

    
    /** 
     * @return String
     */
    public String getURL() {
        return URL;
    }

    
    /** 
     * @return float
     */
    public float getTamano() {
        return tamano;
    }

}
