import java.text.*;
import java.time.*;
import java.time.format.*;

public abstract class Post {
    protected String autor;
    protected String fecha;
    protected String hora;
    protected int likes;

    protected String[] comentarios = new String[] {};

    public abstract void publicar();

    public abstract String toString();

    public Post(String autor, String fecha, String hora, int likes, String[] comentarios){
        this.autor = autor;
        this.fecha = fecha;
        this.hora = hora;
        this.likes = likes;
        this.comentarios = comentarios;
    }
    
    public boolean checarFecha(String dia, String mes, String anio) {
        boolean bandera = false;

        try {
            // Formato de fecha (día/mes/año)
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
            formatoFecha.setLenient(false);
            // Comprobación de la fecha
            formatoFecha.parse(fecha);
            bandera = false;
        } catch (ParseException e) {
            // Si la fecha no es correcta, pasará por aquí
            bandera = true;
        }

        return bandera;
    }

    public boolean checarHora(String hora) {
        boolean bandera = false;

        try {
            DateTimeFormatter strictTimeFormatter = DateTimeFormatter.ofPattern("HH:mm")
                    .withResolverStyle(ResolverStyle.STRICT);
            LocalTime.parse(this.hora, strictTimeFormatter);
            bandera = false;
        } catch (DateTimeParseException | NullPointerException e) {
            bandera = true;
        }

        return bandera;
    }
}
