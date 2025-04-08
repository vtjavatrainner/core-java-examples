package com.pcstraining.core.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TomatoOperationsTest {
    public static void main(String[] args) {
        Tomato redTomato = new Tomato(Color.RED, 100);
        Tomato greenTomato1 = new Tomato(Color.GREEN, 60);
        Tomato greenTomato2 = new Tomato(Color.GREEN, 110);

        List<Tomato> tomatoList = Arrays.asList(redTomato, greenTomato1, greenTomato2);

        //create a method to filter Green tomatoes
        List<Tomato> greenTomatoList = filterGreenTomatoes(tomatoList);
        System.out.println("greenTomatoList :-" + greenTomatoList);

        //create a method to filter Red tomatoes
        List<Tomato> redColorTomatoList = filterRedTomatoes(tomatoList);
        System.out.println("redColorTomatoList :-" + redColorTomatoList);

        System.out.println("Green tomatoes :-"+filterTomatoesByColor(tomatoList, Color.GREEN));

        System.out.println("Red tomatoes :-"+filterTomatoesByColor(tomatoList, Color.RED));


    }
    //Red and Heavy
    //if(tomato.getColor().equals(Color.RED) && tomato.getWeight() > 100){

    //Red and light tomatoes (weight < 50)
    //if(tomato.getColor().equals(Color.RED) && tomato.getWeight() < 50){

    //heavy means - weight > 100
    public static List<Tomato> filterGreenAndHeavyTomatoes(List<Tomato> tomatoList){
        List<Tomato> filteredTomatoList = new ArrayList<>();
        for(Tomato tomato: tomatoList){
            if(tomato.getColor().equals(Color.GREEN) && tomato.getWeight() > 100){
                filteredTomatoList.add(tomato);
            }
        }
        return filteredTomatoList;
    }

    public static List<Tomato> filterTomatoesByColor(List<Tomato> tomatoList, Color color){
        List<Tomato> filteredTomatoList = new ArrayList<>();
        for(Tomato tomato: tomatoList){
            if(tomato.getColor().equals(color)){
                filteredTomatoList.add(tomato);
            }
        }
        return filteredTomatoList;
    }

    public static List<Tomato> filterGreenTomatoes(List<Tomato> tomatoList) {
        List<Tomato> filteredGreenTomatoList = new ArrayList<>();
        //iterate tomatoList and check if color is green, add green color tomato to filteredGreenTomatoList
        for (Tomato tomato : tomatoList) {
            if (tomato.getColor().equals(Color.GREEN)) {
                filteredGreenTomatoList.add(tomato);
            }
        }
        return filteredGreenTomatoList;
    }

    public static List<Tomato> filterRedTomatoes(List<Tomato> tomatoList) {
        List<Tomato> filteredRedTomatoList = new ArrayList<>();
        for (Tomato tomato : tomatoList) {
            if (tomato.getColor().equals(Color.RED)) {
                filteredRedTomatoList.add(tomato);
            }
        }
        return filteredRedTomatoList;
    }


}
