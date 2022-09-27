package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(" ");
        System.out.println("Welcome to the Adventure. You will be teleported into a labyrinth which consists of 9  rooms!" +
                " The danger of these rooms is unknown, so tread carefully! Your only way out is finding the exit room! ");

        Scanner scanner = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("You can find help on what do to by the help of these commandos");
        System.out.println("look    - Repeat of room description");
        System.out.println("help   - To get an instruction and overview of possible commandos");
        System.out.println("exit    - Disconntinue the game");
        String brugerValg;

        do {

            brugerValg = scanner.next();
            switch (brugerValg) {
                case "look":
                    System.out.println(" ...");
                    break;
                case "help":
                    System.out.println("This is an overview of the allowed commandos"  + "\n"
                            + "- n, north, go north, walk north" + "\n"
                            + "- w, west, go west, walk west" + "\n"
                            + "- e, east, go east, walk east" + "\n"
                            + "- s, south, go south, walk south" + "\n"
                            + "- Look " + "\n"
                            + "- exit" );
                    break;
                case "n":
                case "north":
                case "go north":
                case "walk north":
                    System.out.println("going north!");
                    break;
                case "w":
                case "west":
                case "go west":
                case "walk west":
                    System.out.println("going west!");
                    break;
                case "e":
                case "east":
                case "go east":
                case "walk east":
                    System.out.println("going east!");
                    break;
                case "s":
                case "south":
                case "go south":
                case "walk south":
                    System.out.println("going south!");
                    break;
                case "afslut":
                case "exit":
                case "quit":
                    System.out.println("The game is ending");
                    break;
                default:
                    System.out.println(" Indtast valid input");
                    break;
            }

        } while (brugerValg != "afslut" | brugerValg != "exit" | brugerValg != "quit");

    }
}