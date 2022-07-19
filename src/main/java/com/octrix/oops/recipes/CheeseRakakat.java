package com.octrix.oops.recipes;

public class CheeseRakakat {
    public CheeseRakakat(){
        System.out.println("Get the following ingredients 1.Cheese 2.Oregano 3.Sesame seeds 4.Coriander leaves");
    }

    public CheeseRakakat addIngredients(String ingredientName){
        System.out.println("Adding "+ingredientName+" for better taste and consistency.");
        return this;
    }
    public CheeseRakakat mixItUp(){
        System.out.println("Mixing the above mentioned ingredients");
        return this;
    }
    public CheeseRakakat rollAndFoldSheets(){
        System.out.println("Spread the filling on a sheet roll it over to form a log and seal the edges using some water");
        System.out.println("Repeat the process for all the rolls");
        return this;
    }

    public CheeseRakakat heatingPot(String heatLevel){
        System.out.println("Heating saucepan over "+heatLevel+" heat");
        return this;
    }
    public CheeseRakakat cooking(){
        System.out.println("Deep fry the prepared cheese rolls until golden");
        return this;
    }
    public CheeseRakakat serveWithDip(String dip){
        System.out.println("Enjoy your Cheese Spring rolls with "+dip+"!");
        return this;
    }

    public static void main(String[] args) {
        CheeseRakakat rolls = new CheeseRakakat();
        rolls
                .addIngredients("mozarella cheese")
                .addIngredients("oregano")
                .addIngredients("toasted sesame seeds")
                .addIngredients("coriander leaves")
                .mixItUp()
                .rollAndFoldSheets()
                .heatingPot("medium")
                .cooking()
                .serveWithDip("Mayo");
    }
}