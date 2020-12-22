package me.auftraggeber.api.frame.message;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Knopf, mit Klick-aktion.
 * @author Jonas Langner
 * @version 1.0
 * @since Alpha
 */
public class MessageAction {

    private JButton jButton;
    private ActionListener actionListener;

    /**
     * Constructor.
     * @param button Die Erscheinung des Buttons.
     * @param listener Der Listener, der nach einem Klick ausgeführt wird.
     */
    public MessageAction(MessageButton button, ActionListener listener) {
        this(button.getText(), listener);
    }

    /**
     * Constructor.
     * @param text Der Text des Buttons.
     * @param listener Der Listener, der nach einem Klick ausgeführt wird.
     */
    public MessageAction(String text, ActionListener listener) {
        this.jButton = new JButton(text);
        this.actionListener = listener;

        /* Listener hinzufügen */
        registerListener();
    }

    /**
     * Registriert den Listener
     */
    private void registerListener() {
        jButton.addActionListener(actionListener);
    }

    public ActionListener getActionListener() {
        return actionListener;
    }

    public JButton getJButton() {
        return jButton;
    }


    /*
    Vorschläge
     */

    /**
     * Schließt das Programm.
     */
    public static final MessageAction EXIT = new MessageAction("BEENDEN", new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    });

}
