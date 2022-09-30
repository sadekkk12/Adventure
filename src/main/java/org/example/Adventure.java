package org.example;

public class Adventure {
    private Room currentRoom;
    private Room endRoom;
    private Room startingRoom;

    public Adventure() {
        createRooms();
    }
// forstår ikke hvorfor der er behov for at skabe public adventure for at fixe fejlen
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
        return currentRoom;
    }

    public Room getEndRoom() {
        return endRoom;
    }

    public Room getStartingRoom() {
        return room1;
    }

    public String look() {
        String currentRoomDescirption = currentRoom.getName() + "\n" + currentRoom.getDescription();
        return currentRoomDescirption;
    }

    public void createRooms() {  //Creator rooms med hver rooms værdier sat i north, west, east og south

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
        currentRoom = room1;
        startingRoom = room1;
    }
public boolean goNorth() {
    if (currentRoom.getNorth() == null) {
        return false;
    } else {
        currentRoom = currentRoom.getNorth();
        return true;
    }
}
    public boolean goWest() {
        if (currentRoom.getWest() == null) {
            return false;
        } else {
            currentRoom = currentRoom.getWest();
            return true;
        }
    }
    public boolean goEast() {
        if (currentRoom.getEast() == null) {
            return false;
        } else {
            currentRoom = currentRoom.getEast();
            return true;
        }
    }
    public boolean goSouth() {
        if (currentRoom.getSouth() == null) {
            return false;
        } else {
            currentRoom = currentRoom.getSouth();
            return true;
        }
    }
}

