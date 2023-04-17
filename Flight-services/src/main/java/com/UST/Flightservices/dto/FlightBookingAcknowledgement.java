package com.UST.Flightservices.dto;


import com.UST.Flightservices.entity.PassengerInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor
public class FlightBookingAcknowledgement {

    private String status;
    private double amount;
    private String pnrNo;
    private PassengerInfo passengerInfo;



}
