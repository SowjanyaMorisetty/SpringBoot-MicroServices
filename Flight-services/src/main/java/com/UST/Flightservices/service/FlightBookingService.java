package com.UST.Flightservices.service;

import com.UST.Flightservices.dto.BookingRequest;
import com.UST.Flightservices.dto.FlightBookingAcknowledgement;
import com.UST.Flightservices.entity.PassengerInfo;
import com.UST.Flightservices.entity.PaymentInfo;
import com.UST.Flightservices.repo.PassengerRepository;
import com.UST.Flightservices.repo.PaymentRepository;
import com.UST.Flightservices.utils.PaymentUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.naming.InsufficientResourcesException;
import java.util.UUID;

@Service
public class FlightBookingService {

    @Autowired
    private PassengerRepository passengerRepository;

    @Autowired
    private PaymentRepository paymentRepository;
    public FlightBookingAcknowledgement bookingFlightTicket(BookingRequest request) throws InsufficientResourcesException {

        PassengerInfo passengerInfo=request.getPassengerInfo();
        passengerInfo=passengerRepository.save(passengerInfo);
        PaymentInfo paymentInfo=request.getPaymentInfo();
        paymentInfo=paymentRepository.save(paymentInfo);
       PaymentUtils.validateCreditLimit(paymentInfo.getAccountNo(),passengerInfo.getFare());
       paymentInfo.setPassengerID(passengerInfo.getPId());
       paymentInfo.setAmount(passengerInfo.getFare());
       paymentRepository.save(paymentInfo);
        return new FlightBookingAcknowledgement("success",passengerInfo.getFare(),
                UUID.randomUUID().toString().split("-")[0],passengerInfo);
    }
}
