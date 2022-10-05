package org.example;

public class Adventure {
    Map map = new Map();
    Player player = new Player();
    public Items getItemFromRoom(String itemName){
        for(Items itemFromRoom : getCurrentRoom().getAllItems()){
            if (itemFromRoom.getItemName().contains(itemName)){
                return itemFromRoom;
            }
        }
        return null;
    }



    public Room getCurrentRoom() {
        return player.getCurrentRoom();
    }
    public Items takeItem(String itemName) {
        player.getItem(itemName);
        return player.getItem(itemName);
    }

    public Items removeItem(String name) {
        for (Items item : getCurrentRoom().getAllItems()) {
            if (item.getItemName().equals(name)) {
                getCurrentRoom().getAllItems().remove(item);
                return item;
            }
        }
        return null;
    }
}
