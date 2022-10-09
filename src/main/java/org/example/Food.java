package org.example;

public class Food extends Items {
    private int hpAdd;


    public Food(String itemName, int hpAdd) {
        super(itemName);
        this.hpAdd =  hpAdd;
    }

    public int getHpAdd() {
        return hpAdd;
    }
}
