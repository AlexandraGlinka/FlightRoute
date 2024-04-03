package com.gridnine.testing.service;

import com.gridnine.testing.entity.Flight;

import java.util.List;
import java.util.stream.Collectors;

public class FlightFilterImpl implements FlightFilter {

    @Override
    public List<Flight> filterBeforeNow(List<Flight> flights) {
        List<Flight> filteredFlights = flights.stream()
                .filter(flight -> flight.getSegments().stream()
                        .allMatch(segment -> segment.getDepartureDate().isBefore(segment.getArrivalDate())))
                .collect(Collectors.toList());
        return filteredFlights;
    }

    @Override
    public List<Flight> filterArrivalBeforeDeparture() {
        return null;
    }

    @Override
    public List<Flight> filterSumTransferExceedsTwoHours() {
        return null;
    }
}
