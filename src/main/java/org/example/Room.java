package org.example;
public class Room {
    private String name;
    private String description;
    private Room west;
    private Room north;
    private Room east;
    private Room south;

    public Room(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Room getNorth() {
        return north;
    }

    public Room getEast() {
        return east;
    }

    public Room getSouth() {
        return south;
    }

    public Room getWest() {
        return west;
    }

    public void setRoom(Room north, Room east, Room south, Room west) {
        this.north = north;
        this.south = east;
        this.east = south;
        this.west = west;
    }

    public Room getRoom(String direction) {
        Room room = null;
        switch (direction.toLowerCase()) {
            case "north" -> room = north;
            case "south" -> room = south;
            case "east" -> room = east;
            case "west" -> room = west;
        }
        return room;
    }

    public String getDirection(Room triedRoom) {
        String direction = "";
        if (north != null && triedRoom.getName().equals(north.getName())) {
            direction = "north";
        } else if (south != null && triedRoom.getName().equals(south.getName())) {
            direction = "south";
        } else if (east != null && triedRoom.getName().equals(east.getName())) {
            direction = "east";
        } else if (west != null && triedRoom.getName().equals(west.getName())) {
            direction = "west";
        }
        return direction;

    }

}