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
        brugerValg = scanner.next();
        do {


            switch (brugerValg) {
                case "look":
                    System.out.println(" ...");
                    break;
                case "help":
                    System.out.println("...");
                    break;

                case "afslut":
                case "exit":
                case "quit":
                    System.out.println("The game is closing");
                    break;
                default:
                    System.out.println(" Indtast valid input");
                    break;
            }

        } while (brugerValg != "AFSLUT" | brugerValg != "EXIT" | brugerValg != "QUIT");

    }

}