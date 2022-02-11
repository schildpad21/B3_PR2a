package com.mauro.airport;

import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {

        Airport schiphol = new Airport(new ArrayList<>());

        Airplane cargoOne = new CargoPlane("Flowers");
        Airplane passengerOne = new TransportPlane(5);

        schiphol.addPlane(cargoOne);
        schiphol.addPlane(passengerOne);

        CargoPlane cp;
        cp = (CargoPlane) schiphol.getPlane(0);
        cp.showCargo();

        schiphol.addPlane(new CargoPlane("Gold"));
        schiphol.addPlane(new TransportPlane(1000));

        System.out.println("==============================================");
        schiphol.showAllContents();
    }


    /*
    Dit is zeker wat ik had verwacht! Het is wel een beetje gevaarlijk om zo te casten, maar in dit geval kan je er
    zeker van zijn dat de cast goed gaat, aangezien er nooit een ander type aan de list wordt toegevoegd.
     */
}
