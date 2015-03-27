package AppliSimu;

import DomaineRoute.Route;

import javax.swing.*;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by julian on 27/03/15.
 */
public class IHMRoute extends JFrame implements Observer {

    private Route maRoute;
    private int x;
    private int y;
    private double paramatreConversionMetresPixels = 0.5;

    private void initGraphique() {
        this.setTitle("Simulateur de Route");
        this.setSize(x, y);
        this.setVisible(true);
    }

    public IHMRoute(Route maRoute, int x, int y) {
        this.maRoute = maRoute;
        maRoute.addObserver(this);
        this.x = x;
        this.y = y;
        initGraphique();
    }

    @Override
    public void update(Observable o, Object arg) {
        this.repaint();
    }

    public int calculerPositionPixels(int xMetres) {
        return (int) (paramatreConversionMetresPixels * xMetres);
    }

    @Override
    public void paint(Graphics contexteGraphique) {
        super.paint(contexteGraphique);
        contexteGraphique.setColor(Color.red);
        dessinerRoute(contexteGraphique);
    }


    private void dessinerRoute(Graphics contexteGraphique) {
        final int origineX = maRoute.getX();
        final int origineYPremierBord = maRoute.getY();
        final int arriveeX = origineX + maRoute.getLongueur();
        final int arriveeY = maRoute.getY();
        final int origineYDeuxiemeBord = maRoute.getY() + maRoute.getLargeur();
        contexteGraphique.drawLine(origineX, origineYPremierBord, arriveeX, arriveeY);
        contexteGraphique.drawLine(origineX, origineYDeuxiemeBord, arriveeX, arriveeY);
    }

}
