import java.util.*;

public class Controlador {

    public static void main(String[] args) {
        Vista vis = new Vista();
        Acciones ac = new Acciones();

        int opcionMenu = 0;
        int opcion1 = 0;
        int tipoPost = 0;
        int tipoMultimedia = 0;
        boolean p = false;
        ArrayList<Texto> allTexto = new ArrayList<Texto>();
        ArrayList<Imagen> allImagen = new ArrayList<Imagen>();
        ArrayList<Video> allVideo = new ArrayList<Video>();
        ArrayList<Audio> allAudio = new ArrayList<Audio>();
        ArrayList<Emoticono> allEmoticono = new ArrayList<Emoticono>();

        // Se agregan unos post para probar el programa
        Texto textoInicio = new Texto("Juan", "25/10/2021", "01:55");
        textoInicio.setContenido("Termine mi proyecto!");
        textoInicio.darleLike();
        textoInicio.darleLike();
        textoInicio.darleLike();
        textoInicio.setHashtag("#UVG");
        textoInicio.setHashtag("#Desvelo");

        textoInicio.setComentario("Me alegro mucho!");
        textoInicio.setComentario("Yo necesito ayuda :(");

        allTexto.add(textoInicio);

        Imagen imagenInicio = new Imagen("Paola", "30/10/2021", "18:26",
                "https://live.staticflickr.com/65535/48997185732_81ac11fd30_o.png", 25, "PNG", 1170);
        imagenInicio.darleLike();
        imagenInicio.setHashtag("#Halloween");
        imagenInicio.setHashtag("#Disfraz");
        imagenInicio.setComentario("Que lindo maquillaje");

        allImagen.add(imagenInicio);

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
                boolean salida = false;
                while (salida == false) {
                    do {
                        try {
                            vis = new Vista();
                            tipoPost = vis.tipoPost(tipoPost);
                            p = true;
                        } catch (InputMismatchException ex) {
                            System.out.println("\nPor favor, ingresa un numero");
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
                            vis.textoLargo();
                            contenidoTexto = vis.texto();
                            banderaLimite = ac.checarTexto(contenidoTexto);
                        }
                        Texto texto = new Texto(autor, fecha, hora);
                        texto.setContenido(contenidoTexto);

                        do {
                            try {
                                vis = new Vista();
                                opcion1 = vis.ingresarHashtag();
                                p = true;
                            } catch (InputMismatchException ex) {
                                System.out.println("\nPor favor, ingresa un numero");
                                p = false;
                            }
                        } while (!p);

                        boolean banderaHashtags = true;
                        String hashtag = "";

                        while (banderaHashtags == true) {
                            if (opcion1 == 1) {
                                hashtag = vis.hashtag();
                                texto.setHashtag(hashtag);
                                do {
                                    try {
                                        vis = new Vista();
                                        opcion1 = vis.ingresarHashtag2();
                                        p = true;
                                    } catch (InputMismatchException ex) {
                                        System.out.println("\nPor favor, ingresa un numero");
                                        p = false;
                                    }
                                } while (!p);
                            }

                            else if (opcion1 == 2) {
                                banderaHashtags = false;
                            }

                            else {
                                vis.fueraMenu();
                                do {
                                    try {
                                        vis = new Vista();
                                        opcion1 = vis.ingresarHashtag();
                                        p = true;
                                    } catch (InputMismatchException ex) {
                                        System.out.println("\nPor favor, ingresa un numero");
                                        p = false;
                                    }
                                } while (!p);
                            }
                        }

                        allTexto.add(texto);
                        salida = true;
                        break;

                    case 2: // Multimedia
                        vis.ingresarDatos();

                        String autorM = vis.ingresarAutor();

                        String fechaM = vis.ingresarFecha();
                        boolean banderaFechaM = ac.checarFecha(fechaM);

                        while (banderaFechaM == true) {
                            vis.formatoIncorrecto();
                            fechaM = vis.ingresarFecha();
                            banderaFechaM = ac.checarFecha(fechaM);
                        }

                        String horaM = vis.ingresarHora();
                        boolean banderaHoraM = ac.checarHora(horaM);

                        while (banderaHoraM == true) {
                            vis.formatoIncorrecto();
                            horaM = vis.ingresarHora();
                            banderaHoraM = ac.checarHora(horaM);
                        }

                        String URL = vis.URL();
                        float tamano = 0;

                        do {
                            try {
                                vis = new Vista();
                                tamano = vis.tamano();
                                p = true;
                            } catch (InputMismatchException ex) {
                                System.out.println("\nPor favor, ingresa un numero");
                                p = false;
                            }
                        } while (!p);

                        boolean salir = false;
                        while (salir == false) {
                            do {
                                try {
                                    vis = new Vista();
                                    tipoMultimedia = vis.tipoMultimedia();
                                    p = true;
                                } catch (InputMismatchException ex) {
                                    System.out.println("\nPor favor, ingresa un numero");
                                    p = false;
                                }
                            } while (!p);

                            switch (tipoMultimedia) {
                            case 1: // Imagen
                                String formato = vis.formato();
                                float resolucion = 0;

                                do {
                                    try {
                                        vis = new Vista();
                                        resolucion = vis.resolucion();
                                        p = true;
                                    } catch (InputMismatchException ex) {
                                        System.out.println("\nPor favor, ingresa un numero");
                                        p = false;
                                    }
                                } while (!p);

                                Imagen imagen = new Imagen(autorM, fechaM, horaM, URL, tamano, formato, resolucion);

                                do {
                                    try {
                                        vis = new Vista();
                                        opcion1 = vis.ingresarHashtag();
                                        p = true;
                                    } catch (InputMismatchException ex) {
                                        System.out.println("\nPor favor, ingresa un numero");
                                        p = false;
                                    }
                                } while (!p);

                                boolean banderaHashtagsI = true;
                                String hashtagI = "";

                                while (banderaHashtagsI == true) {
                                    if (opcion1 == 1) {
                                        hashtagI = vis.hashtag();
                                        imagen.setHashtag(hashtagI);
                                        do {
                                            try {
                                                vis = new Vista();
                                                opcion1 = vis.ingresarHashtag2();
                                                p = true;
                                            } catch (InputMismatchException ex) {
                                                System.out.println("\nPor favor, ingresa un numero");
                                                p = false;
                                            }
                                        } while (!p);
                                    }

                                    else if (opcion1 == 2) {
                                        banderaHashtagsI = false;
                                    }

                                    else {
                                        vis.fueraMenu();
                                        do {
                                            try {
                                                vis = new Vista();
                                                opcion1 = vis.ingresarHashtag();
                                                p = true;
                                            } catch (InputMismatchException ex) {
                                                System.out.println("\nPor favor, ingresa un numero");
                                                p = false;
                                            }
                                        } while (!p);
                                    }
                                }

                                allImagen.add(imagen);
                                salir = true;

                                break;

                            case 2: // Video
                                float fps = 0;

                                do {
                                    try {
                                        vis = new Vista();
                                        fps = vis.fps();
                                        p = true;
                                    } catch (InputMismatchException ex) {
                                        System.out.println("\nPor favor, ingresa un numero");
                                        p = false;
                                    }
                                } while (!p);

                                Video video = new Video(autorM, fechaM, horaM, URL, tamano, fps);

                                do {
                                    try {
                                        vis = new Vista();
                                        opcion1 = vis.ingresarHashtag();
                                        p = true;
                                    } catch (InputMismatchException ex) {
                                        System.out.println("\nPor favor, ingresa un numero");
                                        p = false;
                                    }
                                } while (!p);

                                boolean banderaHashtagsV = true;
                                String hashtagV = "";

                                while (banderaHashtagsV == true) {
                                    if (opcion1 == 1) {
                                        hashtagV = vis.hashtag();
                                        video.setHashtag(hashtagV);
                                        do {
                                            try {
                                                vis = new Vista();
                                                opcion1 = vis.ingresarHashtag2();
                                                p = true;
                                            } catch (InputMismatchException ex) {
                                                System.out.println("\nPor favor, ingresa un numero");
                                                p = false;
                                            }
                                        } while (!p);
                                    }

                                    else if (opcion1 == 2) {
                                        banderaHashtagsV = false;
                                    }

                                    else {
                                        vis.fueraMenu();
                                        do {
                                            try {
                                                vis = new Vista();
                                                opcion1 = vis.ingresarHashtag();
                                                p = true;
                                            } catch (InputMismatchException ex) {
                                                System.out.println("\nPor favor, ingresa un numero");
                                                p = false;
                                            }
                                        } while (!p);
                                    }
                                }

                                allVideo.add(video);

                                salir = true;
                                break;

                            case 3: // Audio
                                float sampleRate = 0;

                                do {
                                    try {
                                        vis = new Vista();
                                        sampleRate = vis.sampleRate();
                                        p = true;
                                    } catch (InputMismatchException ex) {
                                        System.out.println("\nPor favor, ingresa un numero");
                                        p = false;
                                    }
                                } while (!p);

                                float bitDepth = 0;

                                do {
                                    try {
                                        vis = new Vista();
                                        bitDepth = vis.bitDepth();
                                        p = true;
                                    } catch (InputMismatchException ex) {
                                        System.out.println("\nPor favor, ingresa un numero");
                                        p = false;
                                    }
                                } while (!p);

                                Audio audio = new Audio(autorM, fechaM, horaM, URL, tamano, sampleRate, bitDepth);

                                do {
                                    try {
                                        vis = new Vista();
                                        opcion1 = vis.ingresarHashtag();
                                        p = true;
                                    } catch (InputMismatchException ex) {
                                        System.out.println("\nPor favor, ingresa un numero");
                                        p = false;
                                    }
                                } while (!p);

                                boolean banderaHashtagsM = true;
                                String hashtagM = "";

                                while (banderaHashtagsM == true) {
                                    if (opcion1 == 1) {
                                        hashtagM = vis.hashtag();
                                        audio.setHashtag(hashtagM);
                                        do {
                                            try {
                                                vis = new Vista();
                                                opcion1 = vis.ingresarHashtag2();
                                                p = true;
                                            } catch (InputMismatchException ex) {
                                                System.out.println("\nPor favor, ingresa un numero");
                                                p = false;
                                            }
                                        } while (!p);
                                    }

                                    else if (opcion1 == 2) {
                                        banderaHashtagsM = false;
                                    }

                                    else {
                                        vis.fueraMenu();
                                        do {
                                            try {
                                                vis = new Vista();
                                                opcion1 = vis.ingresarHashtag();
                                                p = true;
                                            } catch (InputMismatchException ex) {
                                                System.out.println("\nPor favor, ingresa un numero");
                                                p = false;
                                            }
                                        } while (!p);
                                    }
                                }

                                allAudio.add(audio);

                                salir = true;
                                break;

                            default:
                                vis.fueraMenu();
                                /*
                                 * do { try { vis = new Vista(); tipoMultimedia = vis.tipoMultimedia(); p =
                                 * true; } catch (InputMismatchException ex) {
                                 * System.out.println("\nPor favor, ingresa un numero"); p = false; } } while
                                 * (!p);
                                 */
                                break;
                            }
                        }

                        salida = true;
                        break;

                    case 3: // Emoticono
                        vis.ingresarDatos();

                        String autorE = vis.ingresarAutor();

                        String fechaE = vis.ingresarFecha();
                        boolean banderaFechaE = ac.checarFecha(fechaE);

                        while (banderaFechaE == true) {
                            vis.formatoIncorrecto();
                            fechaE = vis.ingresarFecha();
                            banderaFechaE = ac.checarFecha(fechaE);
                        }

                        String horaE = vis.ingresarHora();
                        boolean banderaHoraE = ac.checarHora(horaE);

                        while (banderaHoraE == true) {
                            vis.formatoIncorrecto();
                            horaE = vis.ingresarHora();
                            banderaHoraE = ac.checarHora(horaE);
                        }

                        String contenidoEmoticono = vis.emoticono();

                        Emoticono emoticono = new Emoticono(autorE, fechaE, horaE);
                        emoticono.setContenido(contenidoEmoticono);

                        do {
                            try {
                                vis = new Vista();
                                opcion1 = vis.ingresarHashtag();
                                p = true;
                            } catch (InputMismatchException ex) {
                                System.out.println("\nPor favor, ingresa un numero");
                                p = false;
                            }
                        } while (!p);

                        boolean banderaHashtagsE = true;
                        String hashtagE = "";

                        while (banderaHashtagsE == true) {
                            if (opcion1 == 1) {
                                hashtagE = vis.hashtag();
                                emoticono.setHashtag(hashtagE);
                                do {
                                    try {
                                        vis = new Vista();
                                        opcion1 = vis.ingresarHashtag2();
                                        p = true;
                                    } catch (InputMismatchException ex) {
                                        System.out.println("\nPor favor, ingresa un numero");
                                        p = false;
                                    }
                                } while (!p);
                            }

                            else if (opcion1 == 2) {
                                banderaHashtagsE = false;
                            }

                            else {
                                vis.fueraMenu();
                                do {
                                    try {
                                        vis = new Vista();
                                        opcion1 = vis.ingresarHashtag();
                                        p = true;
                                    } catch (InputMismatchException ex) {
                                        System.out.println("\nPor favor, ingresa un numero");
                                        p = false;
                                    }
                                } while (!p);
                            }
                        }

                        allEmoticono.add(emoticono);
                        salida = true;
                        break;
                    case 4: // Menú principal
                        salida = true;
                        break;

                    default:
                        vis.fueraMenu();
                        break;
                    }

                }
                break;

            case 2: // Ver post publicados en una fecha particular
                String fecha = vis.ingresarFechaBusqueda();
                boolean banderaFecha = ac.checarFecha(fecha);
                int contador = 0;

                while (banderaFecha == true) {
                    vis.formatoIncorrecto();
                    fecha = vis.ingresarFecha();
                    banderaFecha = ac.checarFecha(fecha);
                }

                for (int i = 0; i < allTexto.size(); i++) {
                    boolean found = ac.buscarFecha(allTexto.get(i), fecha);
                    if (found == true) {
                        contador++;
                        vis.numeroPost(contador);
                        vis.mostrarTexto(allTexto.get(i));
                        boolean salida2 = false;

                        while (salida2 == false) {
                            int opcion3 = 0;
                            do {
                                try {
                                    vis = new Vista();
                                    opcion3 = vis.interactuar(opcion3);
                                    p = true;
                                } catch (InputMismatchException ex) {
                                    System.out.println("\nPor favor, ingresa un numero");
                                    p = false;
                                }
                            } while (!p);

                            switch (opcion3) {
                            case 1: // comentar
                                String comentario = vis.agregarComentario();

                                boolean banderaLimiteT = ac.checarTexto(comentario);

                                while (banderaLimiteT == true) {
                                    vis.textoLargo();
                                    comentario = vis.texto();
                                    banderaLimiteT = ac.checarTexto(comentario);
                                }

                                allTexto.get(i).setComentario(comentario);
                                vis.comentarioAgregado();
                                salida2 = true;
                                break;
                            case 2: // dar like
                                allTexto.get(i).darleLike();
                                vis.likeAgregado();
                                salida2 = true;
                                break;
                            case 3:
                                vis.reproducitTexto(allTexto.get(i));
                                salida2 = true;
                                break;
                            case 4: // ninguna
                                salida2 = true;
                                break;
                            default:
                                vis.fueraMenu();
                                break;
                            }

                        }

                    }
                }

                for (int i = 0; i < allImagen.size(); i++) {
                    boolean found = ac.buscarFecha(allImagen.get(i), fecha);
                    if (found == true) {
                        contador++;
                        vis.numeroPost(contador);
                        vis.mostrarImagen(allImagen.get(i));
                        boolean salida2 = false;
                        while (salida2 == false) {
                            int opcion3 = 0;
                            do {
                                try {
                                    vis = new Vista();
                                    opcion3 = vis.interactuar(opcion3);
                                    p = true;
                                } catch (InputMismatchException ex) {
                                    System.out.println("\nPor favor, ingresa un numero");
                                    p = false;
                                }
                            } while (!p);

                            switch (opcion3) {
                            case 1: // comentar
                                String comentario = vis.agregarComentario();

                                boolean banderaLimiteT = ac.checarTexto(comentario);

                                while (banderaLimiteT == true) {
                                    vis.textoLargo();
                                    comentario = vis.texto();
                                    banderaLimiteT = ac.checarTexto(comentario);
                                }

                                allImagen.get(i).setComentario(comentario);
                                vis.comentarioAgregado();
                                salida2 = true;
                                break;
                            case 2: // dar like
                                allImagen.get(i).darleLike();
                                vis.likeAgregado();
                                salida2 = true;
                                break;
                            case 3:
                                vis.reproducirImagen(allImagen.get(i));
                                salida2 = true;
                                break;

                            case 4: // ninguna
                                salida2 = true;
                                break;
                            default:
                                vis.fueraMenu();
                                break;
                            }

                        }

                    }
                }

                for (int i = 0; i < allVideo.size(); i++) {
                    boolean found = ac.buscarFecha(allVideo.get(i), fecha);
                    if (found == true) {
                        contador++;
                        vis.numeroPost(contador);
                        vis.mostrarVideo(allVideo.get(i));

                        boolean salida2 = false;
                        while (salida2 == false) {
                            int opcion3 = 0;
                            do {
                                try {
                                    vis = new Vista();
                                    opcion3 = vis.interactuar(opcion3);
                                    p = true;
                                } catch (InputMismatchException ex) {
                                    System.out.println("\nPor favor, ingresa un numero");
                                    p = false;
                                }
                            } while (!p);

                            switch (opcion3) {
                            case 1: // comentar
                                String comentario = vis.agregarComentario();

                                boolean banderaLimiteT = ac.checarTexto(comentario);

                                while (banderaLimiteT == true) {
                                    vis.textoLargo();
                                    comentario = vis.texto();
                                    banderaLimiteT = ac.checarTexto(comentario);
                                }

                                allVideo.get(i).setComentario(comentario);
                                vis.comentarioAgregado();
                                salida2 = true;
                                break;
                            case 2: // dar like
                                allVideo.get(i).darleLike();
                                vis.likeAgregado();
                                salida2 = true;
                                break;

                            case 3:
                                vis.reproducirVideo(allVideo.get(i));
                                salida2 = true;
                                break;

                            case 4: // ninguna
                                salida2 = true;
                                break;
                            default:
                                vis.fueraMenu();
                                break;
                            }

                        }
                    }
                }

                for (int i = 0; i < allAudio.size(); i++) {
                    boolean found = ac.buscarFecha(allAudio.get(i), fecha);
                    if (found == true) {
                        contador++;
                        vis.numeroPost(contador);
                        vis.mostrarAudio(allAudio.get(i));

                        boolean salida2 = false;
                        while (salida2 == false) {
                            int opcion3 = 0;
                            do {
                                try {
                                    vis = new Vista();
                                    opcion3 = vis.interactuar(opcion3);
                                    p = true;
                                } catch (InputMismatchException ex) {
                                    System.out.println("\nPor favor, ingresa un numero");
                                    p = false;
                                }
                            } while (!p);

                            switch (opcion3) {
                            case 1: // comentar
                                String comentario = vis.agregarComentario();

                                boolean banderaLimiteT = ac.checarTexto(comentario);

                                while (banderaLimiteT == true) {
                                    vis.textoLargo();
                                    comentario = vis.texto();
                                    banderaLimiteT = ac.checarTexto(comentario);
                                }

                                allAudio.get(i).setComentario(comentario);
                                vis.comentarioAgregado();
                                salida2 = true;
                                break;
                            case 2: // dar like
                                allAudio.get(i).darleLike();
                                vis.likeAgregado();
                                salida2 = true;
                                break;

                            case 3:
                                vis.reproducirAudio(allAudio.get(i));
                                break;
                            case 4: // ninguna
                                salida2 = true;
                                break;
                            default:
                                vis.fueraMenu();
                                break;
                            }

                        }
                    }
                }

                for (int i = 0; i < allEmoticono.size(); i++) {
                    boolean found = ac.buscarFecha(allEmoticono.get(i), fecha);
                    if (found == true) {
                        contador++;
                        vis.numeroPost(contador);
                        vis.mostrarEmoticono(allEmoticono.get(i));

                        boolean salida2 = false;
                        while (salida2 == false) {
                            int opcion3 = 0;
                            do {
                                try {
                                    vis = new Vista();
                                    opcion3 = vis.interactuar(opcion3);
                                    p = true;
                                } catch (InputMismatchException ex) {
                                    System.out.println("\nPor favor, ingresa un numero");
                                    p = false;
                                }
                            } while (!p);

                            switch (opcion3) {
                            case 1: // comentar
                                String comentario = vis.agregarComentario();

                                boolean banderaLimiteT = ac.checarTexto(comentario);

                                while (banderaLimiteT == true) {
                                    vis.textoLargo();
                                    comentario = vis.texto();
                                    banderaLimiteT = ac.checarTexto(comentario);
                                }

                                allEmoticono.get(i).setComentario(comentario);
                                vis.comentarioAgregado();
                                salida2 = true;
                                break;
                            case 2: // dar like
                                allEmoticono.get(i).darleLike();
                                vis.likeAgregado();
                                salida2 = true;
                                break;

                            case 3:
                                vis.reproducirEmoticono(allEmoticono.get(i));
                                break;
                            case 4: // ninguna
                                salida2 = true;
                                break;
                            default:
                                vis.fueraMenu();
                                break;
                            }

                        }
                    }
                }

                if (contador == 0) {
                    vis.noPosts();
                }

                break;

            case 3: // Ver post que poseen un Hashtag en común
                String hashtag = vis.hashtag();
                int contadorh = 0;

                for (int i = 0; i < allTexto.size(); i++) {
                    boolean found = ac.buscarHashtag(allTexto.get(i), hashtag);
                    if (found == true) {
                        contadorh++;
                        vis.numeroPost(contadorh);
                        vis.mostrarTexto(allTexto.get(i));

                        boolean salida2 = false;
                        while (salida2 == false) {
                            int opcion3 = 0;
                            do {
                                try {
                                    vis = new Vista();
                                    opcion3 = vis.interactuar(opcion3);
                                    p = true;
                                } catch (InputMismatchException ex) {
                                    System.out.println("\nPor favor, ingresa un numero");
                                    p = false;
                                }
                            } while (!p);

                            switch (opcion3) {
                            case 1: // comentar
                                String comentario = vis.agregarComentario();

                                boolean banderaLimiteT = ac.checarTexto(comentario);

                                while (banderaLimiteT == true) {
                                    vis.textoLargo();
                                    comentario = vis.texto();
                                    banderaLimiteT = ac.checarTexto(comentario);
                                }

                                allTexto.get(i).setComentario(comentario);
                                vis.comentarioAgregado();
                                salida2 = true;
                                break;
                            case 2: // dar like
                                allTexto.get(i).darleLike();
                                vis.likeAgregado();
                                salida2 = true;
                                break;
                            case 3: // ninguna
                                salida2 = true;
                            default:
                                vis.fueraMenu();
                                break;
                            }

                        }
                    }
                }

                for (int i = 0; i < allImagen.size(); i++) {
                    boolean found = ac.buscarHashtag(allImagen.get(i), hashtag);
                    if (found == true) {
                        contadorh++;
                        vis.numeroPost(contadorh);
                        vis.mostrarImagen(allImagen.get(i));

                        boolean salida2 = false;
                        while (salida2 == false) {
                            int opcion3 = 0;
                            do {
                                try {
                                    vis = new Vista();
                                    opcion3 = vis.interactuar(opcion3);
                                    p = true;
                                } catch (InputMismatchException ex) {
                                    System.out.println("\nPor favor, ingresa un numero");
                                    p = false;
                                }
                            } while (!p);

                            switch (opcion3) {
                            case 1: // comentar
                                String comentario = vis.agregarComentario();

                                boolean banderaLimiteT = ac.checarTexto(comentario);

                                while (banderaLimiteT == true) {
                                    vis.textoLargo();
                                    comentario = vis.texto();
                                    banderaLimiteT = ac.checarTexto(comentario);
                                }

                                allImagen.get(i).setComentario(comentario);
                                vis.comentarioAgregado();
                                salida2 = true;
                                break;
                            case 2: // dar like
                                allImagen.get(i).darleLike();
                                vis.likeAgregado();
                                salida2 = true;
                                break;
                            case 3: // ninguna
                                salida2 = true;
                            default:
                                vis.fueraMenu();
                                break;
                            }

                        }
                    }
                }

                for (int i = 0; i < allVideo.size(); i++) {
                    boolean found = ac.buscarHashtag(allVideo.get(i), hashtag);
                    if (found == true) {
                        contadorh++;
                        vis.numeroPost(contadorh);
                        vis.mostrarVideo(allVideo.get(i));

                        boolean salida2 = false;
                        while (salida2 == false) {
                            int opcion3 = 0;
                            do {
                                try {
                                    vis = new Vista();
                                    opcion3 = vis.interactuar(opcion3);
                                    p = true;
                                } catch (InputMismatchException ex) {
                                    System.out.println("\nPor favor, ingresa un numero");
                                    p = false;
                                }
                            } while (!p);

                            switch (opcion3) {
                            case 1: // comentar
                                String comentario = vis.agregarComentario();

                                boolean banderaLimiteT = ac.checarTexto(comentario);

                                while (banderaLimiteT == true) {
                                    vis.textoLargo();
                                    comentario = vis.texto();
                                    banderaLimiteT = ac.checarTexto(comentario);
                                }

                                allVideo.get(i).setComentario(comentario);
                                vis.comentarioAgregado();
                                salida2 = true;
                                break;
                            case 2: // dar like
                                allVideo.get(i).darleLike();
                                vis.likeAgregado();
                                salida2 = true;
                                break;
                            case 3: // ninguna
                                salida2 = true;
                            default:
                                vis.fueraMenu();
                                break;
                            }

                        }
                    }
                }

                for (int i = 0; i < allAudio.size(); i++) {
                    boolean found = ac.buscarHashtag(allAudio.get(i), hashtag);
                    if (found == true) {
                        contadorh++;
                        vis.numeroPost(contadorh);
                        vis.mostrarAudio(allAudio.get(i));

                        boolean salida2 = false;
                        while (salida2 == false) {
                            int opcion3 = 0;
                            do {
                                try {
                                    vis = new Vista();
                                    opcion3 = vis.interactuar(opcion3);
                                    p = true;
                                } catch (InputMismatchException ex) {
                                    System.out.println("\nPor favor, ingresa un numero");
                                    p = false;
                                }
                            } while (!p);

                            switch (opcion3) {
                            case 1: // comentar
                                String comentario = vis.agregarComentario();

                                boolean banderaLimiteT = ac.checarTexto(comentario);

                                while (banderaLimiteT == true) {
                                    vis.textoLargo();
                                    comentario = vis.texto();
                                    banderaLimiteT = ac.checarTexto(comentario);
                                }

                                allAudio.get(i).setComentario(comentario);
                                vis.comentarioAgregado();
                                salida2 = true;
                                break;
                            case 2: // dar like
                                allAudio.get(i).darleLike();
                                vis.likeAgregado();
                                salida2 = true;
                                break;
                            case 3: // ninguna
                                salida2 = true;
                            default:
                                vis.fueraMenu();
                                break;
                            }

                        }
                    }
                }

                for (int i = 0; i < allEmoticono.size(); i++) {
                    boolean found = ac.buscarHashtag(allEmoticono.get(i), hashtag);
                    if (found == true) {
                        contadorh++;
                        vis.numeroPost(contadorh);
                        vis.mostrarEmoticono(allEmoticono.get(i));

                        boolean salida2 = false;
                        while (salida2 == false) {
                            int opcion3 = 0;
                            do {
                                try {
                                    vis = new Vista();
                                    opcion3 = vis.interactuar(opcion3);
                                    p = true;
                                } catch (InputMismatchException ex) {
                                    System.out.println("\nPor favor, ingresa un numero");
                                    p = false;
                                }
                            } while (!p);

                            switch (opcion3) {
                            case 1: // comentar
                                String comentario = vis.agregarComentario();

                                boolean banderaLimiteT = ac.checarTexto(comentario);

                                while (banderaLimiteT == true) {
                                    vis.textoLargo();
                                    comentario = vis.texto();
                                    banderaLimiteT = ac.checarTexto(comentario);
                                }

                                allEmoticono.get(i).setComentario(comentario);
                                vis.comentarioAgregado();
                                salida2 = true;
                                break;
                            case 2: // dar like
                                allEmoticono.get(i).darleLike();
                                vis.likeAgregado();
                                salida2 = true;
                                break;
                            case 3: // ninguna
                                salida2 = true;
                            default:
                                vis.fueraMenu();
                                break;
                            }

                        }
                    }
                }

                if (contadorh == 0) {
                    vis.noPosts();
                }

                break;

            case 4: // Ver todos los post
                int contador2 = 0;
                if (allTexto.size() == 0 && allAudio.size() == 0 && allVideo.size() == 0 && allImagen.size() == 0
                        && allEmoticono.size() == 0) {
                    vis.noPosts();
                } else {
                    for (int i = 0; i < allTexto.size(); i++) {
                        contador2++;
                        vis.numeroPost(contador2);
                        vis.mostrarTexto(allTexto.get(i));
                    }

                    for (int i = 0; i < allEmoticono.size(); i++) {
                        contador2++;
                        vis.numeroPost(contador2);
                        vis.mostrarEmoticono(allEmoticono.get(i));
                    }

                    for (int i = 0; i < allImagen.size(); i++) {
                        contador2++;
                        vis.numeroPost(contador2);
                        vis.mostrarImagen(allImagen.get(i));
                    }

                    for (int i = 0; i < allVideo.size(); i++) {
                        contador2++;
                        vis.numeroPost(contador2);
                        vis.mostrarVideo(allVideo.get(i));
                    }

                    for (int i = 0; i < allAudio.size(); i++) {
                        contador2++;
                        vis.numeroPost(contador2);
                        vis.mostrarAudio(allAudio.get(i));
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