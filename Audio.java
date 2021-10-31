public class Audio extends Multimedia {

    private float sampleRate;
    private float bitDepth;

    public Audio(String autor, String fecha, String hora, String URL, float tamano, float sampleRate, float bitDepth) {
        super(autor, fecha, hora, URL, tamano);
        this.sampleRate = sampleRate;
        this.bitDepth = bitDepth;
        tipo = 4;
    }

    public float getSampleRate() {
        return sampleRate;
    }

    public float getBitDepth() {
        return bitDepth;
    }

    @Override
    public void setContenido(String contenido) {
        
    }

}
