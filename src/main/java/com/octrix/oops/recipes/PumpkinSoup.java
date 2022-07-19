package com.octrix.oops.recipes;

public class PumpkinSoup {
    public PumpkinSoup(){
        System.out.println("Preparing delish pumpkin soup ...");
    }
    public PumpkinSoup heatingSaucepan(String heatLevel){
        System.out.println("Heating saucepan over "+heatLevel+" heat");
        return this;
    }
    public PumpkinSoup addingVegetables(String vegetable){
        System.out.println("Adding "+vegetable+" in the soup");
        return this;
    }
    public PumpkinSoup addingCookingItems(String itemName){
        System.out.println("Adding "+itemName+" for better taste and aroma");
        return this;
    }

    public PumpkinSoup cook(int minutes){
        System.out.println("Cooking the soup for next "+minutes);
        return this;
    }

    public PumpkinSoup finishingUp(){
        System.out.println("Allow to cool slightly, then blend in batches.");
        System.out.println("Stir through cream and reheat gently");
        System.out.println("Season and Serve");
        System.out.println("Enjoy the soup with Breadsticks and Veggies!");
        return this;
    }

    public static void main(String[] args) {
        PumpkinSoup soup = new PumpkinSoup();
        soup
                .heatingSaucepan("low")
                .addingVegetables("onion")
                .addingVegetables("leek")
                .heatingSaucepan("high")
                .cook(3)
                .addingCookingItems("garlic")
                .addingCookingItems("spices")
                .addingVegetables("pumpkin")
                .addingVegetables("potato")
                .addingCookingItems("broth")
                .heatingSaucepan("low")
                .cook(30)
                .finishingUp();
    }


}
