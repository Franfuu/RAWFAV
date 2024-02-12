package Model.library;

import Interface.ILibrary;
import Model.entity.Favourite;

import java.util.ArrayList;

public class Library implements ILibrary {
    private ArrayList<Favourite> favourites;

    public Library() {
        ArrayList<Favourite> favourites = new ArrayList<>();
    }

    public ArrayList<> showFavourite() {
        return favourites;
    }

    public boolean addFavourite(Favourite f) {
        boolean result = false;
        if (getPosFavourite(f) == -1) {
            for (int i = 0; i < ArrayList <favourites> f && !result; i++) {
                if (favourites[i] == null) {
                    favourites[i] = f;
                    result = true;
                }
            }
        }
    }

    private int getPosFavourite(Favourite f) {
        int result = -1;
    }
    return result;
}