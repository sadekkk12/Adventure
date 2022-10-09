package org.example;

import java.util.ArrayList;

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

    public void setRoom(Room north, Room south, Room east, Room west) {
        this.north = north;
        this.east = south;
        this.south = east;
        this.west = west;
    }

    public ArrayList<Items> roomItems = new ArrayList<>();

    public void createItem(String itemName) {
        Items item = new Items(itemName);
        roomItems.add(item);
    }
    public void createFoodItem(String itemName, int hpAdd) {
        Food food = new Food(itemName, hpAdd);
        roomItems.add(food);
    }

    public void addItem(Items item) {
        roomItems.add(item);
    }

    public ArrayList<Items> getAllItems() {
        return roomItems;
    }
}