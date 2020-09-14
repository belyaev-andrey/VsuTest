package ru.vsu.sample.flowershop.model;

import java.math.BigDecimal;

public class Rose extends Flower {

    private String colour;

    public Rose(String colour) {
        this.colour = colour;
    }

    public Rose(String name, BigDecimal price, String colour) {
        super(name, price);
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Rose: "+colour+": "+getName();
    }
}
