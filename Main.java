package Bread;

public class Main {
    public static void main(String[] args) {
        //instance of SourdoughBread
        SourdoughBread sourdough = new SourdoughBread();
        System.out.println(sourdough.getIngredients());
        System.out.println(sourdough.toString());

        sourdough.bake(); // This will show that it's already baked

        //  instance of Pastry
        Pastry pastry = new Pastry();
        System.out.println(pastry.getIngredients());
        System.out.println(pastry.toString());
        pastry.bake(); // Baking the pastry
    }

}
