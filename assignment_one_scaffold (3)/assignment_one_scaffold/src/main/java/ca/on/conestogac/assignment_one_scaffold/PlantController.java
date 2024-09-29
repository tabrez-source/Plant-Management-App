package ca.on.conestogac.assignment_one_scaffold;

/**
 * The PlantController class serves as a controller that interacts with PlantManager.
 * 
 * GRASP Pattern: Indirection - This class mediates between the main application and the PlantManager, reducing direct dependency.
 * GRASP Pattern: Low Coupling - The controller interacts with PlantManager through the PlantOperations interface, reducing coupling.
 */
public class PlantController {
    private final PlantOperations plantManager;

    public PlantController(PlantOperations plantManager) { // Use the interface type
        this.plantManager = plantManager;
    }

    /**
     * Adds a plant using the PlantManager.
     * 
     * This method was generated with the assistance of ChatGPT based on the prompt:
     * "Write a Java method in a controller to add a plant using PlantManager."
     */
    public void addPlant(String name, String type, double price, String description) {
        plantManager.addPlant(name, type, price, description);
    }

    /**
     * Displays all plants using the PlantManager.
     */
    public void displayPlants() {
        plantManager.displayPlants();
    }

    /**
     * Displays the total value of all plants using the PlantManager.
     */
    public void displayTotalValue() {
        double totalValue = plantManager.calculateTotalValue();
        System.out.println("Total Value of Plants: $" + totalValue);
    }
}
