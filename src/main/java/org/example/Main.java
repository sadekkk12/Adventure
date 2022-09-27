package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Adventure");
        Scanner scanner = new Scanner(System.in);
        System.out.println("menu:");
        System.out.println("VIS     - vis alle brugere");
        System.out.println("OPRET   - opret ny bruger");
        System.out.println("FIND    - find bruger");
        System.out.println("REDIGER eller EDIT");
        System.out.println("        - rediger bruger");
        System.out.println("        - slet bruger");
        System.out.println(" AFSLUT eller EXIT eller QUIT");
        System.out.println("        - afslut program");


        String menuvalg;
        menuvalg = scanner.next();
        do {


            switch (menuvalg) {
                case "VIS":
                    System.out.println(" Vis alle brugere");
                    break;
                case "OPRET":
                    System.out.println("opret ny bruger");
                    break;

                case " FIND":
                    System.out.println("find bruger");
                    break;
                case "REDIGER":
                case "EDIT":
                    System.out.println("Rediger eller slet bruger");
                    break;
                case "AFSLUT":
                case "EXIT":
                case "QUIT":
                    System.out.println("Programmet afsluttes");
                    break;
                default:
                    System.out.println(" Indtast valid input");
                    break; }

        } while (menuvalg != "AFSLUT" | menuvalg != "EXIT" | menuvalg != "QUIT") ;

    }
}