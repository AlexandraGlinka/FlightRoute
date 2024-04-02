package com.gridnine.testing;

import com.gridnine.testing.entity.Flight;
import com.gridnine.testing.testingData.FlightBuilder;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Flight> flights = FlightBuilder.createFlights();

        for (Flight flight : flights) {
            System.out.println(flight);
        }
    }
}