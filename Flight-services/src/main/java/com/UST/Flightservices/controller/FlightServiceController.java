package com.UST.Flightservices.controller;


import com.UST.Flightservices.dto.BookingRequest;
import com.UST.Flightservices.dto.FlightBookingAcknowledgement;
import com.UST.Flightservices.service.FlightBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.naming.InsufficientResourcesException;

@RestController
public class FlightServiceController {
    @Autowired
    FlightBookingService flightBookingService;


    @PostMapping("/booking")
    public FlightBookingAcknowledgement bookingFlightTicket(@RequestBody BookingRequest request) throws InsufficientResourcesException {
        return flightBookingService.bookingFlightTicket(request);
    }



}
