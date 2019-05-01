package com.aca.carfabric;

import com.aca.carfabric.engine.HasPrice;

public class PriceCalculator {
    public static Double getPrice(HasPrice product){
        return product.getPrice();
    }
}
