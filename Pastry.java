package Bread;

public class Pastry extends Bread {
    // Unique instance variables for pastry
    private double butter;
    private int eggs;

    // Default
    public Pastry() {
        // Call to the superclass Bread constructor with default values for a pastry
        super(3.0, 1.0, 1.0, 2.0, 1.0, 0.5, "Pastry", new String[] {
                "1. Mix flour, butter, sugar, and water to form a dough.",
                "2. Chill the dough in the fridge for 30 minutes.",
                "3. Roll out the dough and shape as desired.",
                "4. Bake at 375°F for 15 minutes until golden brown."
        });
        this.butter = 1.5; // cups of butter
        this.eggs = 2;      // number of eggs
    }

    // Parameterized constructor
    public Pastry(double flour, double water, double sugar, double butter, int eggs) {
        // Call the superclass Bread constructor
        super(flour, water, 1.0, sugar, 1.0, 0, "Pastry", new String[] {
                "1. Mix flour, butter, sugar, and water to form a dough.",
                "2. Chill the dough in the fridge for 30 minutes.",
                "3. Roll out the dough and shape as desired.",
                "4. Bake at 375°F for 15 minutes until golden brown."
        });
        this.butter = butter;
        this.eggs = eggs;
    }

    // Getters and Setters for unique variables (butter and eggs)
    public double getButter() { return butter; }
    public void setButter(double butter) { this.butter = butter; }

    public int getEggs() { return eggs; }
    public void setEggs(int eggs) { this.eggs = eggs; }

    //  toString method to include unique pastry details
    public String toString() {
        return super.toString() + "\nButter: " + butter + " cups\nEggs: " + eggs;
    }


}
