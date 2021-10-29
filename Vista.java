import java.util.*;

public class Vista {
    private Scanner scan;

    public Vista() {
        scan = new Scanner(System.in);
    }

    public void Inicio() {
        System.out.println(
                "*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n"
                        + "\t\t\t\t\t\t\t\t\t\t\t\tQueOndaMano");
    }

    public int Menu(int opcion) {
        String Mensaje = "\nQue desea hacer?\n" + "1. Publicar post\n"
                + "2. Ver post publicados en una fecha particular\n" + "3. Ver post que poseen un Hashtag en comun\n"
                + "4. Salir\n";
        System.out.println(
                "*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n"
                        + Mensaje);
        opcion = scan.nextInt();
        return opcion;
    }

    public int tipoPost(int opcion) {
        String Mensaje = "\nEscoja el tipo de post que desea realizar?\n" + "1. Texto\n" + "2. Multimedia\n"
                + "3. Emoticono\n";
        System.out.println(
                "*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n"
                        + Mensaje);
        opcion = scan.nextInt();
        return opcion;
    }

    public String agregarComentario(String comentario) {
        System.out.println("\nIngrese su comentario (no puede exceder los 20 caracteres):");
        comentario = scan.next();

        return comentario;
    }

    public void checarComentario(String comentario) {
        if (comentario.length() > 20) {
            System.out.println("\nHa superado los 20 caracteres, no se puede publicar su comentario.");
        }
    }

    public String[] ingresarDatos() {
        String[] datos = new String[] {};

        System.out.println("\nIngresa los siguientes datos:");

        System.out.println("\nTu nombre: ");
        String autor = scan.next();
        datos[0] = autor;

        System.out.println("\nLa fecha de hoy (por favor escribela en el formato dd/MM/yyyy): ");
        String fecha = scan.next();
        datos[1] = fecha;

        System.out.println("\nLa hora actual (por favor escribela en el formato HH:mm): ");
        String hora = scan.next();
        datos[2] = hora;

        return datos;
    }

    public void mostrarPost(String[] post) {
        
    }

    public void reproducirPost() {
    }

    public void formatoIncorrecto() {
        System.out.println("\nSe ha colocado un formato incorrecto, intenta nuevamente.");
    }

}
