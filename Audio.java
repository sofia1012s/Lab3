/****************************************************************
 * Audio.java
 * 
 * @author Sofia Salguero
 * @version 31/10/2021
 * 
 * Clase pare crear posts de tipo audio. Esta clase hereda de la
 * clase multimedia
 ****************************************************************/
public class Audio extends Multimedia {

    private float sampleRate;
    private float bitDepth;

    /**
     * @param autor
     * @param fecha
     * @param hora
     * @param URL
     * @param tamano
     * @param sampleRate
     * @param bitDepth
     */
    public Audio(String autor, String fecha, String hora, String URL, float tamano, float sampleRate, float bitDepth) {
        super(autor, fecha, hora, URL, tamano);
        this.sampleRate = sampleRate;
        this.bitDepth = bitDepth;
        tipo = 4;
    }

    
    /** 
     * @return float
     */
    public float getSampleRate() {
        return sampleRate;
    }

    
    /** 
     * @return float
     */
    public float getBitDepth() {
        return bitDepth;
    }

    
    /** 
     * @param contenido
     */
    @Override
    public void setContenido(String contenido) {
        
    }

}
