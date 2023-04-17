package com.UST.Flightservices.dto;


import com.UST.Flightservices.entity.PassengerInfo;
import com.UST.Flightservices.entity.PaymentInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookingRequest {

    private PassengerInfo passengerInfo;
    private PaymentInfo paymentInfo;


}
