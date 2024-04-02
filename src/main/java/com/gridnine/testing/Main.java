package com.gridnine.testing;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Flight> flights = FlightBuilder.createFlights();

        for (Flight flight : flights) {
            System.out.println(flight);
        }
    }
}