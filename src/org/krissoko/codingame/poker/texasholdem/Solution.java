package org.krissoko.codingame.poker.texasholdem;

import java.util.*;
import java.io.*;
import java.math.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static final Map<Integer, String> orderedCardValues = new HashMap<Integer, String>();
    public static final List<String> unorderedCardSuits = new ArrayList<String>(4);
    public static final List<String> cardsDeck = new ArrayList<String>(52);


    static {
        orderedCardValues.put(14, "A");
        orderedCardValues.put(13, "K");
        orderedCardValues.put(12 ,"Q");
        orderedCardValues.put(11 ,"J");
        orderedCardValues.put(10 ,"T");
        orderedCardValues.put(9 ,"9");
        orderedCardValues.put(8 ,"8");
        orderedCardValues.put(7 ,"7");
        orderedCardValues.put(6 ,"6");
        orderedCardValues.put(5 ,"5");
        orderedCardValues.put(4 ,"4");
        orderedCardValues.put(3 ,"3");
        orderedCardValues.put(2 ,"2");

        unorderedCardSuits.add("H");
        unorderedCardSuits.add("D");
        unorderedCardSuits.add("C");
        unorderedCardSuits.add("S");

        // TODO: reverse order of the values.
/*        Map<Integer,String> newMap = orderedCardValues.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue)).map(Map.Entry::getKey)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));*/

        for (String suit : unorderedCardSuits){
            //for (String cardValue : newMap.values()){
            for (String cardValue : orderedCardValues.values()){
                cardsDeck.add(cardValue + suit);
            }
        }

        System.out.println("Deck size: " + cardsDeck.size());
        System.out.println("Cards in deck: " + cardsDeck);


    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String holeCardsPlayer1 = in.nextLine();
        String holeCardsPlayer2 = in.nextLine();
        String communityCards = in.nextLine();

        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");
        String answer = "1 HIGH_CARD K9875";

        System.out.println(answer);
    }
}