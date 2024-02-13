package Model.library;

import Interface.ILibrary;
import Model.entity.Favourite;
import java.util.ArrayList;

public class Library implements ILibrary {
    private ArrayList<Favourite> favourites;

    public Library() {
        this.favourites = new ArrayList<>();
    }

    @Override
    public ArrayList<Favourite> showFavs(Favourite[] f) {
        return null;
    }

    @Override
    public Favourite[] displayFavs() {
        return favourites.toArray(new Favourite[0]);
    }

    @Override
    public boolean addFav(Favourite f) {
        if (f != null) {
            if (!favourites.contains(f)) {
                favourites.add(f);
                return true;
            }
        }
        return false;
    }

    @Override
    public Favourite removeFav(String n) {
        for (Favourite fav : favourites) {
            if (fav.getName().equals(n)) {
                favourites.remove(fav);
                return fav;
            }
        }
        return null;
    }




}

