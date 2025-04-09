package com.pcstraining.core.java8;

public class GreenAndHeavyTomato implements TomatoPredicate{
    @Override
    public boolean test(Tomato tomato) {
        return tomato.getColor().equals(Color.GREEN) && tomato.getWeight() > 100;
    }
}
