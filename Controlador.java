import java.util.*;

public class Controlador {

    public static void main(String[] args) {
        Vista vis = new Vista();
        Acciones ac = new Acciones();

        int opcionMenu = 0;
        int tipoPost = 0;
        boolean p = false;
        ArrayList<Post> allPosts = new ArrayList<Post>();

        vis.Inicio();

        while (opcionMenu != 5) {
            do {
                try {
                    vis = new Vista();
                    opcionMenu = vis.Menu(opcionMenu);
                    p = true;
                } catch (InputMismatchException ex) {
                    System.out.println("\nPor favor, ingresa un numero\n");
                    p = false;
                }
            } while (!p);

            switch (opcionMenu) {
            case 1: // Publicar Post
                do {
                    try {
                        vis = new Vista();
                        tipoPost = vis.tipoPost(tipoPost);
                        p = true;
                    } catch (InputMismatchException ex) {
                        System.out.println("\nPor favor, ingresa un numero\n");
                        p = false;
                    }
                } while (!p);

                switch (tipoPost) {
                case 1: // Texto
                    vis.ingresarDatos();

                    String autor = vis.ingresarAutor();
                   
                    String fecha = vis.ingresarFecha();
                    boolean banderaFecha = ac.checarFecha(fecha);

                    while (banderaFecha == true) {
                        vis.formatoIncorrecto();
                        fecha = vis.ingresarFecha();
                        banderaFecha = ac.checarFecha(fecha);
                    }

                    String hora = vis.ingresarHora();
                    boolean banderaHora = ac.checarHora(hora);

                    while (banderaHora == true) {
                        vis.formatoIncorrecto();
                        hora = vis.ingresarHora();
                        banderaHora = ac.checarHora(hora);
                    }

                    String contenidoTexto = vis.texto();

                    boolean banderaLimite = ac.checarTexto(contenidoTexto);

                    while (banderaLimite == true) {
                        contenidoTexto = vis.texto();
                        banderaLimite = ac.checarTexto(contenidoTexto);
                    }

                    Texto texto = new Texto(autor, fecha, hora);
                    texto.contenido(contenidoTexto);
                    allPosts.add(texto);
                    break;
                case 2: // Multimedia

                    break;

                case 3: // Emoticono

                    break;

                default:
                    vis.fueraMenu();
                    break;
                }

                break;

            case 2: // Ver post publicados en una fecha particular

                break;

            case 3: // Ver post que poseen un Hashtag en común

                break;

            case 4: // Ver todos los post
                if (allPosts.size() == 0) {
                    vis.noPosts();
                } else {
                    for (int i = 0; i < allPosts.size(); i++) {
                        vis.mostrarPost(allPosts.get(i));
                    }
                }
                break;

            case 5: // Salir
                vis.Salida();
                break;

            default: // Opción fuera del menú
                vis.fueraMenu();
                break;
            }

        }
    }
}
