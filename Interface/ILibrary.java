package Interface;

import Model.entity.Favourite;

import java.util.ArrayList;

public interface ILibrary {

    Favourite[] displayFavs();
    boolean addFav(Favourite f);
    Favourite removeFav(String n);

    ArrayList<Favourite> showFavs(Favourite[] f);
}