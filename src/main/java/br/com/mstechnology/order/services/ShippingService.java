package br.com.mstechnology.order.services;

import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment(double basic) {

        double shipment = 0;

        if(basic < 100.00) {
            shipment = 20.00;
        } else if (basic >= 100.00 && basic <= 200.00 ) {
            shipment = 12.00;
        } else {
            shipment = 0.00;
        }
        return shipment;
    }
}
