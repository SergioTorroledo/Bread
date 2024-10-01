package Bread;

public class SourdoughBread extends Bread {
    // Unique instance variable for sourdough

    private double sourdoughStarter;
    // Default
    public SourdoughBread() {
        super(5.0, 1.5, 2.5, 0, 0, 1.0, "Sourdough Bread", new String[] {
                "1. Mix flour, water, salt, yeast, and sourdough starter.",
                "2. Make the dough.",
                "3. Bulk rise.",
                "4. Stretch and fold the dough.",
                "5. Shape the dough.",
                "6. Second rise.",
                "7. Bake at 450°F for 20 minutes."
        });
        this.sourdoughStarter = 1.0;
    }
    // Parameterized constructor
    public SourdoughBread(double flour, double water, double salt, double sourdoughStarter) {
        super(flour, water, salt, 0, 0, 1.0, "Sourdough Bread", new String[] {
                "1. Mix flour, water, salt, yeast, and sourdough starter.",
                "2. Make the dough.",
                "3. Bulk rise.",
                "4. Stretch and fold the dough.",
                "5. Shape the dough.",
                "6. Second rise.",
                "7. Bake at 450°F for 20 minutes."
        });
        this.sourdoughStarter = sourdoughStarter;
    }
    // Getter and setter for sourdoughStarter
    public double getSourdoughStarter() { return sourdoughStarter; }
    public void setSourdoughStarter(double sourdoughStarter) { this.sourdoughStarter = sourdoughStarter; }
// toString method
public String toString() {
    return super.toString() + "\nSourdough Starter: " + sourdoughStarter + " cups";
}


}
