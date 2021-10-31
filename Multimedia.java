public  abstract class Multimedia extends Post {
    protected String URL;
    protected float tamano;

    public Multimedia(String autor, String fecha, String hora, String URL,float tamano) {
        super(autor, fecha, hora);
        this.URL = URL;
        this.tamano = tamano;
    }

    public String getURL() {
        return URL;
    }

    public float getTamano() {
        return tamano;
    }

}
