package org.example;

public class Room {
    private String name;
    private String description;
    private Room west;
    private Room north;
    private Room east;
    private Room south;

    public Room (String name, String description){
        this.name = name;
        this.description = description;

    }
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public Room getWest(){
        return west;
    }
    public Room getNorth(){
        return north;
    }
    public Room getEast(){
        return east;
    }
    public Room getSouth(){
        return south;
    }
}