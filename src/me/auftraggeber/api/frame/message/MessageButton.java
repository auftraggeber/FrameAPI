package me.auftraggeber.api.frame.message;

public enum MessageButton {

    CANCEL("Abbrechen"),
    OK("OK"),

    NO("Nein"),
    YES("Ja"),

    BACK("Zurück");

    private String text;

    private MessageButton(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }

}
