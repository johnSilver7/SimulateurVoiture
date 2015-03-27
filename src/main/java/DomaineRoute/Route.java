package DomaineRoute;

import javafx.beans.InvalidationListener;

import java.util.Observable;

/**
 * Created by julian on 27/03/15.
 */
public class Route extends Observable {
    private int x;
    private int y;
    private int largeur;
    private int longueur;

    public Route(int x, int y, int largeur, int longueur) {
        this.x = x;
        this.y = y;
        this.largeur = largeur;
        this.longueur = longueur;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getLongueur() {
        return longueur;
    }

    public int getLargeur() {
        return largeur;
    }

}
