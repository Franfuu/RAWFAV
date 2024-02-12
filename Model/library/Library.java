package Model.library;

import Interface.ILibrary;
import Model.entity.Favourite;
import java.util.ArrayList;

public class Library implements ILibrary {
    private ArrayList<Favourite> favourites;

    public Library() {
        this.favourites = new ArrayList<>();
    }

    public ArrayList<Favourite> showFavourites() {
        return favourites;
    }


    @Override
    public Favourite[] displayFavs() {
        // Implement method to display favourites
        return new Favourite[0];
    }

    @Override
    public boolean addFav(Favourite f) {

        return false;
    }

    @Override
    public Favourite removeFav(String n) {
        // Implement method to remove favourite
        return null;
    }
}
