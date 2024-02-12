package Interface;

import Model.entity.Favourite;

public interface ILibrary {

    Favourite[] displayFavs();
    boolean addFav(Favourite f);
    Favourite removeFav(String n);
}