public class Emoticono extends Post{

    public Emoticono(String autor, String fecha, String hora) {
        super(autor, fecha, hora);
        tipo = 5;
    }

    @Override
    public void setContenido(String contenido) {
        this.contenido = contenido;
        
    }

    
}
