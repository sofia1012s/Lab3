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

    public void Salida() {
        System.out.println(
                "*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n"
                        + "\t\t\t\t\t\t\t\t\t\t\tRegresa Pronto!"
                        + "\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");
    }

    public int Menu(int opcion) {
        String Mensaje = "\nQue desea hacer?\n" + "1. Publicar post\n"
                + "2. Ver post publicados en una fecha particular\n" + "3. Ver post que poseen un Hashtag en comun\n"
                + "4. Ver todos los post\n" + "5. Salir\n";
        System.out.println(
                "*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n"
                        + Mensaje);
        opcion = scan.nextInt();
        return opcion;
    }

    public int tipoPost(int opcion) {
        String Mensaje = "\nEscoja el tipo de post que desea realizar\n" + "1. Texto\n" + "2. Multimedia\n"
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

    public void textoLargp() {
        System.out.println("\nHa superado los 20 caracteres, no se puede publicar su comentario.");
    }

    public void ingresarDatos() {
        System.out.println("\nIngresa los siguientes datos:");
    }

    public String ingresarAutor() {
        System.out.println("\nTu nombre: ");
        String autor = scan.next();
        return autor;
    }

    public String ingresarFecha() {
        System.out.println("\nLa fecha de hoy (por favor escribela en el formato dd/MM/yyyy): ");
        String fecha = scan.next();
        return fecha;
    }

    public String ingresarHora() {
        System.out.println("\nLa hora actual (por favor escribela en el formato de 24 horas HH:mm): ");
        String hora = scan.next();
        return hora;
    }

    public String texto() {
        System.out.println("\nQue hay en tu mente? (solo tienes 20 caracteres para expresarte):");
        String texto = scan.next();
        return texto;
    }

    public void mostrarPost(Post post) {

        System.out.println("\n" + post.getAutor() + " " + post.getFecha() + " " + post.getHora());
        System.out.println("\nLikes: " + post.getLikes());
        System.out.println("\nComentarios: ");
        String[] comentarios = post.getComentarios();
        if (comentarios.length <= 0) {
            System.out.println("\nNo hay comentarios por mostrar");
        } else {
            for (int i = 0; i < comentarios.length; i++) {
                System.out.println("\n" + comentarios[i]);
            }

        }
    }

    public void reproducirPost() {
    }

    public void formatoIncorrecto() {
        System.out.println("\nSe ha colocado un formato incorrecto, intenta nuevamente.");
    }

    public void noPosts() {
        System.out.println("\nNo hay posts por mostrar. Por que no creas el primero?\n");
    }

    public void fueraMenu() {
        System.out.println("\nPor favor, selecciona una de las opciones en el menu.");
    }

}
