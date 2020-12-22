package me.auftraggeber.api.frame.message;

import me.auftraggeber.api.frame.Frame;

import javax.swing.*;
import java.awt.*;

/**
 * Fenster für eine Nachricht.
 * @author Jonas Langner
 * @version 1.0
 * @since Alpha
 */
public class MessageFrame extends Frame {

    private JLabel text;
    private MessageAction[] actions;

    /**
     * Constructor. Erstellt eine Nachricht.
     * @param title Der Titel der Nachricht.
     * @param message Die Nachricht.
     * @param actions Aktionen.
     */
    public MessageFrame(String title, String message, MessageAction ... actions) {
        /* Frame erstellen */
        super(title, 0, 0, 500, 190, JFrame.DISPOSE_ON_CLOSE);
        this.actions = actions;
        centre();

        /* Text hinzufügen */
        text = new JLabel(message, JLabel.LEFT);
        text.setBounds(5,0,490,90);
        add(text);

        /* Jede Aktion hinzufügen */
        for (int i = 0; i < this.actions.length; i++) {
            addAction(i);
        }
    }

    /**
     * Fügt eine Aktion hinzu.
     * @param actionIndex Der Index der Aktion
     */
    private void addAction(int actionIndex) {
        /* Position ermitteln */
        int x = ((getWidth() / (actions.length + 1)) * (actionIndex + 1)) - 75;
        int y = 100;

        /* Aktion auslesen */
        MessageAction action = actions[actionIndex];
        JButton button = action.getJButton();

        /* Aktion bearbeiten */
        button.setBounds(x,y, 150, 25);

        /* hinzufügen */
        add(button);
    }

    public String getMessage() {
        return text.getText();
    }

    public MessageAction[] getActions() {
        return actions;
    }
}
