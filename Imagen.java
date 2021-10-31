public class Imagen extends Multimedia{
    private String formato;
    private float resolucion;

    public Imagen(String autor, String fecha, String hora, String URL, float tamano, String formato, float resolucion) {
        super(autor, fecha, hora, URL, tamano);
        this.formato = formato;
        this.resolucion = resolucion;
        tipo = 2;
    }

    public String getFormato() {
        return formato;
    }

    public float getResolucion() {
        return resolucion;
    }



}
