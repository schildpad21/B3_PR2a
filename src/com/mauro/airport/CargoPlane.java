package com.mauro.airport;

public class CargoPlane extends Airplane{

    private String lading;

    public CargoPlane(String lading) {
        this.lading = lading;
    }


    public void loadUp(String cargo) {
        this.lading = cargo;
    }

    public void showCargo() {
        System.out.println("Lading bevat: " + lading);
    }

}
