package org.example;

public class ATM {
    public Tray firstTray;
    public ATM() {
        firstTray = new Tray100();
        firstTray.setNext(new Tray50()).setNext(new Tray2());
    }
    public void process(int amount) {
        firstTray.process(amount);
    }
}
