package com.pcstraining.core.java8;

public class Tomato {
    private final Color color;
    private final int weight;


    public Tomato(Color color, int weight){
        this.color = color;
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Tomato{" +
                "color=" + color +
                ", weight=" + weight +
                '}';
    }
}
