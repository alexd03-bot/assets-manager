package com.pluralsight;

import java.math.BigDecimal;

public class Home extends Asset{
    private String address;
    private int condition;
    private int squareFoot;
    private int lotSize;

    public Home(String description, String dateAcquired, String price, String address,
                int condition, int squareFoot, int lotSize) {
        super(description, dateAcquired, price);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }


    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }


    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    @Override
    public BigDecimal getValue() {

        BigDecimal addPrice = new BigDecimal("0");
            switch(condition) {
                case 1 -> addPrice = new BigDecimal("180");
                case 2 -> addPrice = new BigDecimal("130");
                case 3 -> addPrice = new BigDecimal("90");
                case 4 -> addPrice = new BigDecimal("80");
            }
        BigDecimal finalPrice = getOriginalCost().add((addPrice.multiply(BigDecimal.valueOf(squareFoot))).add(new BigDecimal("0.25").multiply(BigDecimal.valueOf(lotSize))));

        return finalPrice;
    }

}
