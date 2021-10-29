import java.text.*;
import java.time.*;
import java.time.format.*;

public class Acciones {
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

    public boolean checarTexto(String texto) {
        boolean bandera = false;
        if (texto.length() > 20) {
            bandera = true;
        }

        return bandera;
    }


}
