package com.pcstraining.core.java8;

public class RedAndLightTomato implements TomatoPredicate{
    @Override
    public boolean test(Tomato tomato) {
        return tomato.getColor().equals(Color.RED) && tomato.getWeight() < 50;
    }
}
