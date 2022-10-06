package org.example;

import java.util.ArrayList;

public class Player {
    private Room currentRoom;
    private ArrayList<Items> inventory = new ArrayList<>();
    private Items newItem;

    public ArrayList<Items> getInventory() {
        return inventory;
    }

    public Items getItemFromInventory(String itemName) {
        for (Items itemFromInventory : inventory) {
            if (itemFromInventory.getItemName().contains(itemName)) {
                return itemFromInventory;
            }
        }
        return null;
    }

    public Items getItem(String searchTerm) {
        newItem = null;
        ArrayList<Items> searchResult = getCurrentRoom().getAllItems();
        for (Items item : searchResult) {
            if (item.getItemName().equals(searchTerm.toLowerCase())) {
                newItem = item;
            }
        }
        return newItem;
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

    public Items removeItem(String name) {
        for (Items item : inventory) {
            if (item.getItemName().equals(name)) {
                inventory.remove(item);
                return item;
            }
        }
        return null;
    }
}

