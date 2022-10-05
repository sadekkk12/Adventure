package org.example;

import java.util.ArrayList;

public class Player {
    private Room currentRoom;
    private ArrayList<Items> inventory = new ArrayList<>();
    private Items newitem;

    public ArrayList<Items> getInventory(){
        return inventory;
    }
    public Items getItemFromInvetory(String itemName){
        for(Items itemFromInventory : inventory) {
            if (itemFromInventory.getItemName().contains(itemName)) {
                return itemFromInventory;
            }
        }
        return null;
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

    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }
}

/*  public boolean goNorth() {
        return player.goNorth();
    }

    public boolean goWest() {
        return player.goWest();
    }

    public boolean goEast() {
        return player.goEast();
    }
    public boolean goSouth() {
        return player.goSouth();

    */
