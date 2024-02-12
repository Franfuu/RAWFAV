package Interface;

import Model.entity.Favourite;

public interface IView {

    void seeMenu();
    void seeFavs(Favourite[] f);
    void displayFav(Favourite f);
    Favourite displayMenuAddFav();
    Favourite displayMenuRemoveFav();
    void displayResult(String result);
    int readInteger(String msg);
    String readString(String msg);

}