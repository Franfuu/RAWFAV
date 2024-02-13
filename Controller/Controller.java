package Controller;

import Interface.IController;
import Interface.ILibrary;
import Interface.IView;
import Model.library.Library;
import View.View;
import Model.entity.Favourite;


public class Controller implements IController {
    IView View = new View();
    ILibrary Library = new Library();

    public void comeOn() {
        int option;
        do {
            View.seeMenu();
            option = View.readInteger("Elige una opción");
            controllerMainMenu(option);
        } while (option != 4);
    }

    @Override
    public void controllerMainMenu(int o) {
        switch (o) {
            case 1:
                Favourite[] favorite = Library.displayFavs();
                View.seeFavs(favorite);
                break;
            case 2:
                Favourite favToAdd = View.displayMenuAddFav();
                if (Library.addFav(favToAdd)) {
                    View.displayResult("Favorito añadido");
                } else {
                    View.displayResult("Error añadiendo el favorito");
                }
                break;
            case 3:
                Favourite favToRemove = View.displayMenuRemoveFav();
                Favourite removedFav = Library.removeFav(favToRemove.getName());
                if (removedFav != null) {
                    View.displayResult("Favorito eliminado");
                } else {
                    View.displayResult("Error eliminando el favorito");
                }
                break;
            case 4:
                end();
                break;
            default:
                System.out.println("Opción inválida");
        }
    }

    @Override
    public void end() {
        System.out.println("Fin del programa");
    }
}