package ru.vsu.sample.flowershop.model;

import java.math.BigDecimal;

public class Cactus extends Flower {

    private String type;

    public Cactus(String type) {
        this.type = type;
    }

    public Cactus(String name, BigDecimal price, String type) {
        super(name, price);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Cactus: "+type+" "+getName();
    }
}
