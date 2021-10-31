public class Texto extends Post {

    public Texto(String autor, String fecha, String hora) {
        super(autor, fecha, hora);
        tipo = 1;
    }

    @Override
    public void setContenido(String texto) {
        contenido = texto;
    }

}
