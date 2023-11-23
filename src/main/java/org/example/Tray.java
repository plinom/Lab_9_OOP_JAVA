package org.example;

public class Tray {
    private Tray next;
    public int denomination;
    public Tray(int i) {
        this.denomination = i;
    }
    public Tray setNext(Tray next) {
        this.next = next;
        return next;
    }
    public void process(int amount) {
        if(next != null) {
            next.process(amount % denomination);
        } else if(amount % denomination != 0) {
            throw new IllegalArgumentException();
        }
        System.out.format("Please take %d od denomination %d\n", amount / denomination, denomination);
    }
}
