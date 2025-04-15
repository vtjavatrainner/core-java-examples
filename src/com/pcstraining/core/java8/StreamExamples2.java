package com.pcstraining.core.java8;

import java.util.*;
import java.util.stream.Collectors;

public class StreamExamples2 {
    public static void main(String[] args) {
        List<String> batsmen = Arrays.asList("Rohit", "Shubhaman", "Virat", "Shreyash", "Rahul");
        List<String> keepers = Arrays.asList("Rishabh");
        List<String> bowlers = Arrays.asList("Jasprit", "Shami");

        List<List<String>> players = new ArrayList<>();
        players.add(batsmen);
        players.add(keepers);
        players.add(bowlers);

        System.out.println("players " + players);
        //convert this into a single list using streams
        List<String> playersList = players.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        System.out.println("playersList " + playersList);
        //[Rohit, Shubhaman, Virat, Shreyash, Rahul, Rishabh, Jasprit, Shami]

        Tomato redTomato = new Tomato(Color.RED, 100);
        Tomato greenTomato1 = new Tomato(Color.GREEN, 60);
        Tomato greenTomato2 = new Tomato(Color.GREEN, 110);
        List<Tomato> tomatoList = Arrays.asList(redTomato, greenTomato1, greenTomato2);

        //count green colour tomatoes
        long greenColourTomatoes = tomatoList.stream()
                .filter(t -> t.getColor().equals(Color.GREEN))
                .count();
        System.out.println("greenColourTomatoes " + greenColourTomatoes);

        //first Green colour tomato
        Optional<Tomato> firstGreenTomato = tomatoList.stream()
                .filter(t -> t.getColor().equals(Color.GREEN))
                .findFirst();

        System.out.println("firstGreenTomato " + firstGreenTomato);

        //find any Green colour tomato
        Optional<Tomato> findAnyGreenColourTomato = tomatoList.stream()
                .filter(t -> t.getColor().equals(Color.GREEN))
                .findAny();
        System.out.println("findAnyGreenColourTomato " + findAnyGreenColourTomato);

        boolean isAllGreenTomatoes = tomatoList.stream()
                .allMatch(t -> t.getColor().equals(Color.GREEN));

        System.out.println("isAllGreenTomatoes " + isAllGreenTomatoes);

        boolean isNoneMatchingWithYellow = tomatoList.stream()
                .noneMatch(t -> t.getColor().equals(Color.YELLOW));
        System.out.println("isNoneMatchingWithYellow " + isNoneMatchingWithYellow);


    }
}
