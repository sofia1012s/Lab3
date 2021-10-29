import java.util.*;

public class Controlador {

    public static void main(String[] args) {
        Vista vis = new Vista();

        int opcionMenu = 0;
        int tipoPost = 0;
        boolean p = false;

        vis.Inicio();

        while (opcionMenu != 4) {
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

        }

        switch (opcionMenu) {
        case 1:
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


            break;

        default:
            break;
        }

    }
}
