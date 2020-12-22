package me.auftraggeber.api.frame;

import javax.swing.*;
import java.awt.*;

/**
 * Fenster, ähnlich wie {@link JFrame}
 * @author Jonas Langner
 * @version 1.0
 * @since Alpha
 */
public class Frame extends JFrame {

    /**
     * Constructor. Erstellt ein Standardfenster.
     */
    public Frame() {
        this(null, 0, 0, 500, 300, JFrame.HIDE_ON_CLOSE);

        /* zentrieren */
        center();
    }

    /**
     * Constructor. Erstellt ein neues Fenster.
     * @param title Der Titel des Fensters.
     * @param x Position.
     * @param y Position.
     * @param width Breite des Fensters.
     * @param height Höhe des Fensters.
     * @param defaultClose Standardschließung.
     */
    public Frame(String title, int x, int y, int width, int height, int defaultClose) {
        /* erstellen */
        super(title);

        /* Eigenschaften setzen */
        setBounds(x,y,width,height);
        setDefaultCloseOperation(defaultClose);

        /* Sichtbar machen */
        setVisible(true);
        setLayout(null);
    }

    /**
     * Zentriert das Fenster
     */
    public void center() {
        /* Größe des Bildes ermitteln */
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

        double width = dim.getWidth();
        double height = dim.getHeight();

        double newX = (width / 2) - (getWidth() / 2);
        double newY = (height / 2) - (getHeight() / 2);

        setLocation((int) newX, (int) newY);
    }

}
