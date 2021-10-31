import java.util.*;

public class Vista {
    private Scanner scan;

    public Vista() {
        scan = new Scanner(System.in);
    }

    public void Inicio() {
        System.out.println(
                "\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n"
                        + "\n\t\t\t\t\t\t\t\tQueOndaMano");
    }

    public void Salida() {
        System.out.println(
                "\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n"
                        + "\t\t\t\t\t\t\t\tRegresa Pronto!"
                        + "\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");
    }

    public int Menu(int opcion) {
        String Mensaje = "\nQue desea hacer?\n" + "1. Publicar post\n"
                + "2. Ver post publicados en una fecha particular\n" + "3. Ver post que poseen un Hashtag en comun\n"
                + "4. Ver todos los post\n" + "5. Salir\n";
        System.out.println(
                "\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n"
                        + Mensaje);
        opcion = scan.nextInt();
        return opcion;
    }

    public int tipoPost(int opcion) {
        String Mensaje = "\nEscoja el tipo de post que desea realizar\n" + "1. Texto\n" + "2. Multimedia\n"
                + "3. Emoticono\n" + "4. Regresar a menu principal\n";
        System.out.println(
                "\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n"
                        + Mensaje);
        opcion = scan.nextInt();
        return opcion;
    }

    public String agregarComentario(String comentario) {
        System.out.println("\nIngrese su comentario (no puede exceder los 20 caracteres):");
        comentario = scan.next();

        return comentario;
    }

    public void textoLargo() {
        System.out.println("\nHa superado los 20 caracteres, no se puede publicar su comentario." + "\n");
    }

    public void ingresarDatos() {
        System.out.println("\nIngresa los siguientes datos:");
    }

    public String ingresarAutor() {
        System.out.print("\nTu nombre: ");
        String autor = scan.next();
        return autor;
    }

    public int ingresarHashtag() {
        System.out.println("\nDeseas agregar un hashtag? \n" + "1. Si\n" + "2. No\n");
        int opcion = scan.nextInt();

        return opcion;
    }

    public int ingresarHashtag2() {
        System.out.println("\nDeseas agregar otro hashtag? \n" + "1. Si\n" + "2. No\n");
        int opcion = scan.nextInt();

        return opcion;
    }

    public String hashtag() {
        System.out.print("\nIngresa el hashtag (ej: #poo): ");
        String hashtag = scan.next();
        return hashtag;
    }

    public String ingresarFecha() {
        System.out.print("\nLa fecha de hoy (por favor escribela en el formato dd/MM/yyyy): ");
        String fecha = scan.next();
        return fecha;
    }

    public String ingresarHora() {
        System.out.print("\nLa hora actual (por favor escribela en el formato de 24 horas HH:mm): ");
        String hora = scan.next();
        return hora;
    }

    public String texto() {
        scan.nextLine();
        System.out.print("\nQue hay en tu mente? (solo tienes 20 caracteres para expresarte): ");
        String texto = scan.nextLine();
        return texto;
    }

    public String emoticono() {
        System.out.print("\nIngresa tu emoticono (ej: u-u, :3, :( :p ): ");
        String texto = scan.next();
        return texto;
    }

    public void mostrarTexto(Post texto) {
        System.out.println("\n--<>--<>--<>--<>--<>--<>--<>--<>----<>--<>--<>--<>--<>--<>--<>--<>--");
        System.out.println("\n" + texto.getAutor() + " - " + texto.getFecha() + " - " + texto.getHora());
        ArrayList<String> hashtags = texto.gethashtags();
        if (hashtags.size() <= 0) {
            System.out.println(" ");
        } else {
            for (int i = 0; i < hashtags.size(); i++) {
                System.out.print(hashtags.get(i) + " ");
            }
        }

        System.out.println("\n" + "( " + "Texto" + " ) " + texto.getContenido());
        System.out.println("\nLikes: " + texto.getLikes());
        System.out.println("\nComentarios: ");
        ArrayList<String> comentarios = texto.getComentarios();
        if (comentarios.size() <= 0) {
            System.out.println("\nNo hay comentarios por mostrar");
        } else {
            for (int i = 0; i < comentarios.size(); i++) {
                System.out.println("\n" + "-" + comentarios.get(i));
            }

        }
    }

    public void mostrarEmoticono(Emoticono emoticono) {
        System.out.println("\n--<>--<>--<>--<>--<>--<>--<>--<>----<>--<>--<>--<>--<>--<>--<>--<>--");
        System.out.println("\n" + emoticono.getAutor() + " - " + emoticono.getFecha() + " - " + emoticono.getHora());
        ArrayList<String> hashtags = emoticono.gethashtags();
        if (hashtags.size() <= 0) {
            System.out.println(" ");
        } else {
            for (int i = 0; i < hashtags.size(); i++) {
                System.out.print(hashtags.get(i) + " ");
            }
        }

        System.out.println("\n" + "( " + "Emoticono" + " ) " + emoticono.getContenido());
        System.out.println("\nLikes: " + emoticono.getLikes());
        System.out.println("\nComentarios: ");
        ArrayList<String> comentarios = emoticono.getComentarios();
        if (comentarios.size() <= 0) {
            System.out.println("\nNo hay comentarios por mostrar");
        } else {
            for (int i = 0; i < comentarios.size(); i++) {
                System.out.println("\n" + "-" + comentarios.get(i));
            }

        }
    }

    public void mostrarImagen(Imagen imagen) {
        System.out.println("\n--<>--<>--<>--<>--<>--<>--<>--<>----<>--<>--<>--<>--<>--<>--<>--<>--");
        System.out.println("\n" + imagen.getAutor() + " - " + imagen.getFecha() + " - " + imagen.getHora());
        ArrayList<String> hashtags = imagen.gethashtags();
        if (hashtags.size() <= 0) {
            System.out.println(" ");
        } else {
            for (int i = 0; i < hashtags.size(); i++) {
                System.out.print(hashtags.get(i) + " ");
            }
        }

        System.out.println("\n" + "( " + "Imagen" + " ) " + imagen.getURL() + "\n" + imagen.getTamano() + " KB, "
                + imagen.getFormato() + ", " +  imagen.getResolucion() + " Megapixeles");
        System.out.println("\nLikes: " + imagen.getLikes());
        System.out.println("\nComentarios: ");
        ArrayList<String> comentarios = imagen.getComentarios();
        if (comentarios.size() <= 0) {
            System.out.println("\nNo hay comentarios por mostrar");
        } else {
            for (int i = 0; i < comentarios.size(); i++) {
                System.out.println("\n" + "-" + comentarios.get(i));
            }

        }
    }

    public void mostrarVideo(Video video) {
        System.out.println("\n--<>--<>--<>--<>--<>--<>--<>--<>----<>--<>--<>--<>--<>--<>--<>--<>--");
        System.out.println("\n" + video.getAutor() + " - " + video.getFecha() + " - " + video.getHora());
        ArrayList<String> hashtags = video.gethashtags();
        if (hashtags.size() <= 0) {
            System.out.println(" ");
        } else {
            for (int i = 0; i < hashtags.size(); i++) {
                System.out.print(hashtags.get(i) + " ");
            }
        }

        System.out.println("\n" + "( " + "Video" + " ) " + video.getURL() + "\n" + video.getTamano() + " KB, "
                + "FrameRate: " + video.getFps() + " fps");
        System.out.println("\nLikes: " + video.getLikes());
        System.out.println("\nComentarios: ");
        ArrayList<String> comentarios = video.getComentarios();
        if (comentarios.size() <= 0) {
            System.out.println("\nNo hay comentarios por mostrar");
        } else {
            for (int i = 0; i < comentarios.size(); i++) {
                System.out.println("\n" + "-" + comentarios.get(i));
            }

        }
    }

    public void mostrarAudio(Audio audio) {
        System.out.println("\n--<>--<>--<>--<>--<>--<>--<>--<>----<>--<>--<>--<>--<>--<>--<>--<>--");
        System.out.println("\n" + audio.getAutor() + " - " + audio.getFecha() + " - " + audio.getHora());
        ArrayList<String> hashtags = audio.gethashtags();
        if (hashtags.size() <= 0) {
            System.out.println(" ");
        } else {
            for (int i = 0; i < hashtags.size(); i++) {
                System.out.print(hashtags.get(i) + " ");
            }
        }

        System.out.println("\n" + "( " + "Audio" + " ) " + audio.getURL() + "\n" + audio.getTamano() + " KB, "
                + "SampleRate: " + audio.getSampleRate() + " kHz, " + "BitDepth: " + audio.getBitDepth());
        System.out.println("\nLikes: " + audio.getLikes());
        System.out.println("\nComentarios: ");
        ArrayList<String> comentarios = audio.getComentarios();
        if (comentarios.size() <= 0) {
            System.out.println("\nNo hay comentarios por mostrar");
        } else {
            for (int i = 0; i < comentarios.size(); i++) {
                System.out.println("\n" + "-" + comentarios.get(i));
            }

        }
    }

    public void formatoIncorrecto() {
        System.out.println("\nSe ha colocado un formato incorrecto, intenta nuevamente.");
    }

    public void noPosts() {
        System.out.println("\nNo hay posts por mostrar. Por que no creas el primero?\n");
    }

    public void fueraMenu() {
        System.out.println("\nPor favor, selecciona una de las opciones en el menu.\n");
    }

    public String URL() {
        System.out.print("\nIngresa el URL de tu contenido: ");
        String URL = scan.next();
        return URL;
    }

    public float tamano() {
        System.out.print("\nIngresa el tamano en kilobytes: ");
        float tamano = scan.nextFloat();
        return tamano;
    }

    public String formato() {
        System.out.print("\nIngresa el formato de tu imagen (png, gif, jpeg, etc.): \n");
        String formato = scan.next();
        return formato;
    }

    public float resolucion() {
        System.out.print("\nIngresa la resolucion de tu imagen en megapixeles: ");
        float resolucion = scan.nextFloat();
        return resolucion;
    }

    public float sampleRate() {
        System.out.print("\nIngresa el sample rate de tu audio: ");
        float sampleRate = scan.nextFloat();
        return sampleRate;
    }

    public float bitDepth() {
        System.out.print("\nIngresa el bit depth de tu audio: ");
        float bitDepth = scan.nextFloat();
        return bitDepth;
    }

    public float fps() {
        System.out.print("\nIngresa el frame rate de tu video: ");
        float fps = scan.nextFloat();
        return fps;
    }

    public int tipoMultimedia() {
        String Mensaje = "\nEscoja el tipo de archivo multimedia que subira\n" + "1. Imagen\n" + "2. Video\n"
                + "3. Audio\n";
        System.out.println(
                "\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n"
                        + Mensaje);
        int opcion = scan.nextInt();
        return opcion;
    }
}
