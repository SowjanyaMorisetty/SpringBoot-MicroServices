package com.UST.Flightservices.utils;

import javax.naming.InsufficientResourcesException;
import java.util.HashMap;
import java.util.Map;

public class PaymentUtils {


    private static Map<String,Double> paymentmap=new HashMap<>();
    static
    {
        paymentmap.put("acc1",10000.00);
        paymentmap.put("acc2",20000.00);
        paymentmap.put("acc3",30000.00);
        paymentmap.put("acc4",40000.00);
        paymentmap.put("acc5",50000.00);
        paymentmap.put("acc6",60000.00);
        paymentmap.put("acc7",70000.00);
        paymentmap.put("acc8",80000.00);
        paymentmap.put("acc9",90000.00);
    }
    public static boolean validateCreditLimit(String accountNo, double fare) throws InsufficientResourcesException {
        if(fare>paymentmap.get(accountNo))
        {
            throw new InsufficientResourcesException("insuffiecinet amount better");

        }
        else {
            return true;
        }
    }
}
