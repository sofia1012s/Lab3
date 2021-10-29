public class Texto extends Post {
    private String texto;

    public Texto(String autor, String fecha, String hora) {
        super(autor, fecha, hora);
        
    }

    public void contenido(String texto){
        texto = this.texto;
    }

    public String[] publicar() {
        String datos[] = {};

        datos[0] = autor;
        datos[1] = fecha;
        datos[2] = hora;
        datos[3] = texto;
       
        return datos;
    }

    /*@Override
    public String toString() {
        
        return null;
    }*/

}
