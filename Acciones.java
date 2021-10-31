/****************************************************************
 * Acciones.java
 * 
 * @author Sofia Salguero
 * @version 31/10/2021
 * 
 * Clase pare realizar distintas acciones dentro del controlador
 ****************************************************************/
import java.text.*;
import java.time.*;
import java.time.format.*;

public class Acciones {
    
    /** 
     * @param fecha
     * @return boolean
     */
    public boolean checarFecha(String fecha) {
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

    
    /** 
     * @param hora
     * @return boolean
     */
    public boolean checarHora(String hora) {
        boolean bandera = false;

        try {
            DateTimeFormatter strictTimeFormatter = DateTimeFormatter.ofPattern("HH:mm")
                    .withResolverStyle(ResolverStyle.STRICT);
            LocalTime.parse(hora, strictTimeFormatter);
            bandera = false;
        } catch (DateTimeParseException | NullPointerException e) {
            bandera = true;
        }

        return bandera;
    }

    
    /** 
     * @param texto
     * @return boolean
     */
    public boolean checarTexto(String texto) {
        boolean bandera = false;
        if (texto.length() > 20) {
            bandera = true;
        }

        return bandera;
    }

    
    /** 
     * @param post
     * @param fecha
     * @return boolean
     */
    public boolean buscarFecha(Post post, String fecha) {
        boolean bandera = false;
        if (post.getFecha().contains(fecha)) {
            bandera = true;

        } else {
            bandera = false;
        }
        return bandera;
    }

    
    /** 
     * @param post
     * @param hashtag
     * @return boolean
     */
    public boolean buscarHashtag(Post post, String hashtag) {
        boolean bandera = false;
        for (int i = 0; i < post.gethashtags().size(); i++) {
            if (post.gethashtags().get(i).contains(hashtag)) {
                bandera = true;
            } 
        }
        return bandera;
    }

}
