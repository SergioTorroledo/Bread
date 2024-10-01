The program will display the ingredients and recipes for various types of bread. It will also simulate the baking process by attempting to bake the bread.
Project Structure
Bread.java: The Bread class serves as the superclass, encompassing fundamental attributes and methods applicable to all bread types, including ingredients, state (baked or unbaked), and recipe procedures.

SourdoughBread.java: This subclass extends the Bread superclass and is dedicated to the sourdough bread recipe. It incorporates specific properties such as sourdough starter and features a distinct recipe.

Pastry.java: Also extending the Bread superclass, this subclass is tailored for pastry recipes, introducing unique components like butter and eggs and featuring a recipe specific to pastries.

Main.java: The Main class houses the main method, responsible for instantiating various bread types, presenting their ingredients, and undertaking the baking process. It emulates the preparation and baking of bread while verifying the baking status.
