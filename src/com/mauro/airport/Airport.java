package com.mauro.airport;

import java.util.ArrayList;
import java.util.List;

public class Airport {

    public List<Airplane> airplanes;

    public Airport(List<Airplane> airplanes) {
        this.airplanes = airplanes;
    }

    public void addPlane(Airplane plane) {
        this.airplanes.add(plane);
    }

    public Airplane getPlane(int index) {
        return airplanes.get(index);
    }

    public void showAllContents() {

        airplanes.forEach(airplane -> {
            if (airplane instanceof TransportPlane) {
                ((TransportPlane) airplane).showPassengerAmount();
            } else {
                ((CargoPlane)airplane).showCargo();
            }
        });
    }
}
