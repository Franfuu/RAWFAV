package View;
import Interface.IView;
import Model.entity.Favourite;
import Model.entity.Movie;
import Model.entity.Song;
import Model.entity.VGame;

import java.util.Scanner;

public class View implements IView {

    @Override
    public void seeMenu() {
        System.out.println("Menú Principal");
        System.out.println("1. Listar Favoritos");
        System.out.println("2. Añadir Favorito");
        System.out.println("3. Quitar Favorito");
        System.out.println("4. Salir");
    }

    @Override
    public void seeFavs(Favourite[] f) {
        System.out.println("**** Favoritos ****");
        for (Favourite fav : f) {
            displayFav(fav);
        }
        System.out.println("*******************");
    }

    @Override
    public void displayFav(Favourite f) {
        if (f != null) {
            System.out.println("****************");
            System.out.println(f);
            System.out.println("****************");
        } else {
            System.out.println("No hay favoritos disponibles");
        }
    }

    @Override
    public Favourite displayMenuAddFav() {
        System.out.println("¿Qué tipo de favorito desea añadir?");
        System.out.println("1. Videojuego");
        System.out.println("2. Película");
        System.out.println("3. Música");
        int opcion = readInteger("Ingrese una opción");

        Favourite result = null;
        switch (opcion) {
            case 1:
                result = new VGame();
                break;
            case 2:
                result = new Movie();
                break;
            case 3:
                result = new Song();
                break;
            default:
                System.out.println("Opción no válida");
        }
        if (result != null) {
            result.setName(readString("Ingrese el nombre del favorito"));
            result.setId(readString("Ingrese el género del favorito"));
            result.setDuration(readInteger("Ingrese el año de lanzamiento"));
        }
        return result;
    }

    @Override
    public Favourite displayMenuRemoveFav() {
        String nombre = readString("Ingrese el nombre del favorito que desea quitar");
        Favourite result = new Favourite();
        result.setName(nombre);
        return result;
    }

    @Override
    public void displayResult(String result) {
        System.out.println("********************");
        System.out.println(result);
        System.out.println("*********************");
    }

    @Override
    public int readInteger(String msg) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(msg + ": ");
        return scanner.nextInt();
    }

    @Override
    public String readString(String msg) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(msg + ": ");
        return scanner.nextLine();
    }
}
