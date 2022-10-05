package org.example;

import java.util.Scanner;

public class UserInterface {
    Map map = new Map();
    Player player;
    Adventure adventure;
    boolean gameRunning = true;
    Scanner scanner = new Scanner(System.in);

    public void StartAdventure() {

        Scanner scanner = new Scanner(System.in);
        player = map.player;

        introduction();

        String input;
        input = scanner.next().toLowerCase();
        String [] inputs = input.split(" ");
        String brugerValg = inputs[0];
        String itemValg = "";
        if (inputs.length > 1) {
            itemValg = inputs[1];
        }



        do {

            switch (brugerValg) {
                case "look":
                    System.out.println(map.look());
                    break;
                case "help":
                    help();
                    break;
                case "n", "north", "go north", "walk north":
                    if (player.goNorth()) {
                        System.out.println("Going north!" + "\n"
                                + "You are now in the " + map.getCurrentRoom().getName() + "\n"
                                + map.getCurrentRoom().getDescription());
                    }
                    if (map.getCurrentRoom() == map.getEndRoom()) {
                        gameRunning = false;
                        System.out.println("Congratulations, you have completed the game!");
                    } else System.out.println("There is no door that way");
                    break;
                case "w", "west", "go west", "walk west":
                    if (player.goWest()) {
                        System.out.println("Going west!" + "\n"
                                + "You are now in the " + map.getCurrentRoom().getName() + "\n"
                                + map.getCurrentRoom().getDescription());
                    } else
                        System.out.println(" There is no door that way");
                    break;
                case "e", "east", "go east", "walk east":
                    if (player.goEast()) {
                        System.out.println("Going east!" + "\n"
                                + "You are now in the " + map.getCurrentRoom().getName() + "\n"
                                + map.getCurrentRoom().getDescription());
                    } else
                        System.out.println("there is no door that way");


                    break;
                case "s", "south", "go south", "walk south":
                    if (player.goSouth()) {
                        System.out.println("Going south!" + "\n"
                                + "You are now in the " + map.getCurrentRoom().getName() + "\n"
                                + map.getCurrentRoom().getDescription());
                    } else System.out.println("there is no door that way");
                    break;
                case "take","add":
                    String itemName = itemValg;
                    Items itemPickUp = adventure.takeItem(itemName);

                    if (itemPickUp == null) {
                        System.out.println("No item like that in this room");
                    } else {
                        System.out.println("You have picked up the " + itemPickUp.getItemName());
                        player.getInventory().add(itemPickUp);
                        adventure.getCurrentRoom().roomItems.remove(itemPickUp);
                    }
                    break;


                case "drop", "d", "leave":
                    String droppedItem = itemValg;
                    Items itemToDrop = player.removeItem(droppedItem);

                    if (itemToDrop == null) {
                        System.out.println("No such item in Inventory");
                    } else {
                        System.out.println("you have dropped " + itemToDrop.getItemName());
                        player.getCurrentRoom().addItem(itemToDrop);
                    }
                    break;

                case "exit", "quit", "q":
                    System.out.println("The game is ending");
                    gameRunning = false;
                    break;
                default:
                    System.out.println(" There is no path that way");
            }
        } while (gameRunning);

    }
        public void introduction () {
            System.out.println(" ");
            System.out.println("Welcome to the Adventure. You will be teleported into a labyrinth which consists of 9  rooms!" +
                    " The danger of these rooms is unknown, so tread carefully! Your only way out is finding the exit room! ");
            System.out.println(" ");
            System.out.println("You can find help on what do to by the help of these commandos");
            System.out.println("look    - Repeat of room description");
            System.out.println("help   - To get an instruction and overview of possible commandos");
            System.out.println("exit/quit    - Disconntinue the game");

        }
        public void help () {
            System.out.println("This is an overview of the allowed commandos" + "\n"
                    + "- n, north, go north, walk north" + "\n"
                    + "- w, west, go west, walk west" + "\n"
                    + "- e, east, go east, walk east" + "\n"
                    + "- s, south, go south, walk south" + "\n"
                    + "- Look " + "\n"
                    + "- exit");

        }
        public void userInput() {
        // String direction = scanner.nextLine();
           // switch (direction) {

        }


        }


