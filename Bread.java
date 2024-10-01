package Bread;

public class Bread  {
    //Instance variable
    private double flour;
    private double water;
    private double salt;
    private double sugar;
    private double bakingPowder;
    private double yeast;
    private String breadName;
    private String state;
    private String[] recipe;
 //Default
    public Bread() {
        this.flour = 0;
        this.water = 0;
        this.salt = 0;
        this.sugar = 0;
        this.bakingPowder = 0;
        this.yeast = 0;
        this.breadName = "Bread";
        this.state = "not ready";
        this.recipe = new String[0];
    }
    //parameters for the constructor
    public Bread(double flour, double water, double salt, double sugar, double bakingPowder, double yeast, String breadName, String[] recipe) {
        this.flour = flour;
        this.water = water;
        this.salt = salt;
        this.sugar = sugar;
        this.bakingPowder = bakingPowder;
        this.yeast = yeast;
        this.breadName = breadName;
        this.state = "not ready";
        this.recipe = recipe;
    }
    //Getters
    public double getFlour() {
        return flour;
    }
    public double getWater() {
        return water;
    }
    public double getSalt() {
        return salt;
    }
    public double getSugar() {
        return sugar;
    }
    public double getBakingPowder() {
        return bakingPowder;
    }
    public double getYeast() {
        return yeast;
    }
    public String getBreadName() {
        return breadName;
    }
    public String getState() {
        return state;
    }
    public String[] getRecipe() {
        return recipe;
    }
    //setters
    public void setFlour(double flour) {
        this.flour = flour;
    }
    public void setWater(double water) {
        this.water = water;
    }
    public void setSalt(double salt) {
        this.salt = salt;
    }
    public void setSugar(double sugar) {
        this.sugar = sugar;
    }
    public void setBakingPowder(double bakingPowder) {
        this.bakingPowder = bakingPowder;
    }
    public void setYeast(double yeast) {
        this.yeast = yeast;
    }
    public void setBreadName(String breadName) {
        this.breadName = breadName;
    }
    public void setState(String state) {
        this.state = state;
    }
    public void setRecipe(String[] recipe) {
        this.recipe = recipe;
    }

    //toString method
    public String toString() {
        return breadName + " - " + state + "\n" + "Recipe: " + String.join("\n", recipe);
    }
    //bake method
    public void bake() {
        if (state.equals("not baked")) {
            state = "baked";
            System.out.println(breadName + " is now baked.");
        } else {
            System.out.println(breadName + " is already baked.");
        }
    }
    //getIngredients method
    public String getIngredients() {
        return "Ingredients:\nFlour: " + flour + " cups\nWater: " + water + " cups\nSalt: " + salt + " tsp\nSugar: " + sugar +
                " tbsp\nBaking Powder: " + bakingPowder + " tsp\nYeast: " + yeast + " tsp";
    }



}
