package com.mauro.airport;

public class TransportPlane extends Airplane{


    private int passagiers;


    public TransportPlane(int passagiers) {
        this.passagiers = passagiers;
    }


    public void board(int aantal) {
        this.passagiers += aantal;
    }


    public void showPassengerAmount() {
        System.out.println("Het vliegtuig bevat " + this.passagiers + " aantal passagiers");
    }
}
