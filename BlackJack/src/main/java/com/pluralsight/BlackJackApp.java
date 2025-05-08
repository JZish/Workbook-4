package com.pluralsight;

import java.util.Scanner;

public class BlackJackApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.print("Name of Player 1: ");
        String name1 = scanner.nextLine().trim();

        System.out.print("Name of Player 2: ");
        String name2 = scanner.nextLine().trim();

        System.out.println("-------------------------");


        //create the deck
        Deck deck = new Deck();
        deck.shuffle();
        //create the hand
        Hand hand1 = new Hand();
        Hand hand2 = new Hand();



        // deal 5 cards from the deck and add them to the hand
        for (int i = 0; i < 5; i++) {
            // get a card from the deck
            Card card = deck.deal();
            Card card2 = deck.deal();
            // deal that card to the hand
            hand1.deal(card);
            hand2.deal(card2);
        }

        //print out the value of all the cards in the hand
        System.out.println(name1 + ":" + "\nThis hand is worth " + hand1.getValue());
        System.out.println("....................");
        System.out.println(name2 + ":" + "\nThis hand is worth " + hand2.getValue() + "\n-------------------------");

        int value1 = hand1.getValue();
        int value2 = hand2.getValue();

        if (value1 > 21) {
            System.out.println (name1 + " busted!\n-------------------------");
        }
        if (value2 > 21) {
            System.out.println (name2 + " busted!\n-------------------------");
        }
            int gap1 = 21 - value1;
            int gap2 = 21 - value2;

            if (gap1 < 21) {
                System.out.println(name1 + " is closer, " + name1 + " wins!");
            } else if (gap2 < 21) {
                System.out.println(name2 + " is closer, " + name2 + " wins!");
            }
        }


    }


