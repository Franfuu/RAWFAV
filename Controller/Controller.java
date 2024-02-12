package Controller;

import Interface.IController;
import Interface.ILibrary;
import Interface.IView;
import Model.library.Library;
import View.View;
import Model.entity.Favourite;


public class Controller implements IController {
    IView View = new View();
    ILibrary Library = (ILibrary) new Library();

    public void comeOn() {
        int option;
        do {
            View.seeMenu();
            option = View.readInteger("Choose an option");
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
                    View.displayResult("Favorito Añadido");
                } else {
                    View.displayResult("Error Añadiendo el Favorito");
                }
                break;
            case 3:
                Favourite favToRemove = View.displayMenuRemoveFav();
                Favourite removedFav = Library.removeFav(favToRemove.getName());
                if (removedFav != null) {
                    View.displayResult("Favorito Eliminado");
                } else {
                    View.displayResult("Error Eliminando el Favorito");
                }
                break;
            case 4:
                break;
            default:
                System.out.println("Invalid option");
        }
    }

@Override
    public void ended() {
        System.out.println("Adios");
    }
}