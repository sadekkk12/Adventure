package org.example;

public class Items {

        private String itemName;
        public Items(String itemName) {
            this.itemName = itemName;
        }

        public String getItemName() {
            return itemName;
        }

        @Override
        public String toString() {
            return itemName;
        }
    }

