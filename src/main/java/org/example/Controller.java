package org.example;

import java.util.Scanner;

public class Controller {
    public void StartAdventure(){

        Adventure adventure = new Adventure();
        Scanner scanner = new Scanner(System.in);

        System.out.println(" ");
        System.out.println("Welcome to the Adventure. You will be teleported into a labyrinth which consists of 9  rooms!" +
                " The danger of these rooms is unknown, so tread carefully! Your only way out is finding the exit room! ");
        System.out.println(" ");
        System.out.println("You can find help on what do to by the help of these commandos");
        System.out.println("look    - Repeat of room description");
        System.out.println("help   - To get an instruction and overview of possible commandos");
        System.out.println("exit    - Disconntinue the game");

        String brugerValg;

        do {

            brugerValg = scanner.next();
            switch (brugerValg) {
                case "look" -> System.out.println(adventure.look());
                case "help" -> System.out.println("This is an overview of the allowed commandos" + "\n"
                        + "- n, north, go north, walk north" + "\n"
                        + "- w, west, go west, walk west" + "\n"
                        + "- e, east, go east, walk east" + "\n"
                        + "- s, south, go south, walk south" + "\n"
                        + "- Look " + "\n"
                        + "- exit");
                case "n", "north", "go north", "walk north" -> System.out.println("going north!");
                case "w", "west", "go west", "walk west" -> System.out.println("going west!");
                case "e", "east", "go east", "walk east" -> System.out.println("going east!");
                case "s", "south", "go south", "walk south" -> System.out.println("going south!");
                case "afslut", "exit", "quit" -> System.out.println("The game is ending");
                default -> System.out.println(" Indtast valid input");
            }

        } while (brugerValg != "afslut" | brugerValg != "exit" | brugerValg != "quit");

    }
}
