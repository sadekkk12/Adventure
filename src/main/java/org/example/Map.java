package org.example;

public class Map {
    /*Map map = new Map();*/
    private Room endRoom;
    private Room startingRoom;
    Player player;

    public Map() {
        player = new Player();
        createRooms();
    }
    Room room1 = new Room("1st room", "This is your starting point, now go find the exit!");
    Room room2 = new Room("2nd room", "This room has landmines laying around, tread carefully!");
    Room room3 = new Room("3rd room", "This room has no information");
    Room room4 = new Room("4th room", "This room is highly toxic, you have 30 seconds to decide on the next door!");
    Room room5 = new Room("5th room", "This is the exit, you did it!!");
    Room room6 = new Room("6th room", "This room has a big Arachna sleeping, find your way to the next door without waking it up!");
    Room room7 = new Room("7th room", "This room contains food, some of it may be poisoned!");
    Room room8 = new Room("8th room", "This room contains a library, it helps you discover the exit is in the middle!");
    Room room9 = new Room("9th room", "This is icecold, choose a new room to enter before you die from frostbite!");

    public Room getCurrentRoom() {
        return player.getCurrentRoom();
    }

    public Room getEndRoom() {
        return endRoom;
    }

    public Room getStartingRoom() {

        return room1;
    }

    public void createRooms() {  //Creator rooms med hver rooms værdier sat i north, east, south og west

        room1.setRoom(null, room2, room4, null);
        room2.setRoom(null, room3, null, room1);
        room3.setRoom(null, null, room6, room2);
        room4.setRoom(room1, null, room7, null);
        room5.setRoom(null, room8, null, null);
        room6.setRoom(room3, null, room9, null);
        room7.setRoom(room4, room8, null, null);
        room8.setRoom(room5, room9, null, room7);
        room9.setRoom(room6, null, null, room8);

        endRoom = room5;
        startingRoom = room1;
        player.setCurrentRoom(startingRoom);

        room1.createItem("iphone");
        room1.createFoodItem("redbull", 25);
        room2.createItem("coins");
        room3.createItem("sneakers");
        room3.createFoodItem("banana", 30);
        room4.createItem("gasmask");
        room6.createItem("crossbow");
        room7.createItem("hammer");
        room8.createItem("book");
        room9.createItem("torch");
        room9.createItem("lighter");
    }

}




