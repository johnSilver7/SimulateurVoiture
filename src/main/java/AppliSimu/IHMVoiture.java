package AppliSimu;

import DomaineRoute.Route;
import DomaineVoiture.Voiture;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class IHMVoiture extends JFrame implements Observer {

    private double paramatreConversionMetresPixels = 0.5;
    private Voiture maVoiture;
    private List<Route> reseau;
    private CommandeVoiture maCommandeVoiture;

    private void initGraphique() {
        this.setTitle("Simulateur de Voiture");
        this.setSize(505, 505);

        this.maCommandeVoiture = new CommandeVoiture(this, maVoiture);

        this.setVisible(true);
    }

    public IHMVoiture(Voiture maVoiture) {
        super();
        this.maVoiture = maVoiture;
        this.reseau = new ArrayList<Route>();
        maVoiture.addObserver(this);
        initGraphique();
    }

    public IHMVoiture() {
        super();
        initGraphique();
        this.maVoiture = null;
        this.reseau = new ArrayList<Route>();
    }

    public int calculerPositionPixels(int xMetres) {
        return (int) (paramatreConversionMetresPixels * xMetres);
    }

    public void addRoute(Route route) {
       this.reseau.add(route);
    }

    public List<Route> getReseau() {
        return this.reseau;
    }

    @Override
    public void update(Observable arg0, Object arg1) {
        this.repaint();
    }

    @Override
    public void paint(Graphics contexteGraphique) {
        super.paint(contexteGraphique);
        dessinerVoiture(contexteGraphique);
        dessinerRoute(contexteGraphique);
    }


    private void dessinerVoiture(Graphics contexteGraphique) {
        int xMetres = maVoiture.getX();
        int positionXPixel = calculerPositionPixels(xMetres);
        /*
        int positionYPixel = calculerPositionPixels(route.getY()) - 20;
        contexteGraphique.setColor(Color.red);
        contexteGraphique.fillRect(positionXPixel, positionYPixel, 30, 15);
        */
    }

    private void dessinerRoute(Graphics contexteGraphique) {
        /*
        final int origineX = calculerPositionPixels(route.getX());
        final int origineYPremierBord = calculerPositionPixels(route.getY());
        final int arriveeX = calculerPositionPixels(origineX + route.getLongueur());
        final int arriveeY = calculerPositionPixels(route.getY());
        final int origineYDeuxiemeBord = calculerPositionPixels(route.getY() - route.getLargeur());

        contexteGraphique.setColor(Color.black);

        contexteGraphique.drawLine(origineX, origineYPremierBord, arriveeX, arriveeY);

        contexteGraphique.drawLine(origineX, origineYDeuxiemeBord, arriveeX, origineYDeuxiemeBord);
        */

    }

}
