package com.pcstraining.core.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExamples {
    public static void main(String[] args) {
        Tomato redTomato = new Tomato(Color.RED, 100);
        Tomato greenTomato1 = new Tomato(Color.GREEN, 60);
        Tomato greenTomato2 = new Tomato(Color.GREEN, 110);
        List<Tomato> tomatoList = Arrays.asList(redTomato, greenTomato1, greenTomato2);

        Stream<Tomato> tomatoStream = Stream.of(redTomato, greenTomato1, greenTomato2);

        //Filter tomatoes of Green colour and wight > 50
        List<Tomato> greenAndHeavyTomatoes = tomatoStream
                .filter(t -> t.getColor().equals(Color.GREEN))
                .filter(t -> t.getWeight() > 50)
                .collect(Collectors.toList());

        System.out.println("greenAndHeavyTomatoes :- " + greenAndHeavyTomatoes);

        List<Tomato> tomatoListLimitTwo = tomatoList.stream()
                .limit(2)
                .collect(Collectors.toList());

        System.out.println("tomatoListLimitTwo :- " + tomatoListLimitTwo);

        List<Tomato> tomatoListSkipOne = tomatoList.stream()
                .skip(1)
                .collect(Collectors.toList());
        System.out.println("tomatoListSkipOne :- " + tomatoListSkipOne);

        //Give me color of tomatoes
        List<Color> tomatoColorList = tomatoList.stream()
                .map(t -> t.getColor())
                .collect(Collectors.toList());
        System.out.println("tomatoColorList :- " + tomatoColorList);

        //Give me distinct colour of tomatoes using distinct
        List<Color> distinctTomatoColours = tomatoList.stream()
                .map(t -> t.getColor())
                .distinct()
                .collect(Collectors.toList());

        System.out.println("distinctTomatoColours :-" + distinctTomatoColours);

        //Give me distinct colours of tomatoes using Set
        Set<Color> distinctTomatoColourSet = tomatoList.stream()
                .map(t -> t.getColor())
                .collect(Collectors.toSet());

        System.out.println("distinctTomatoColourSet :-" + distinctTomatoColourSet);

    }
}
