package ca.on.conestogac.assignment_one_scaffold;

import java.util.ArrayList;
import java.util.List;

/**
 * The PlantManager class manages a list of plants.
 * 
 * GRASP Pattern: Creator - This class is responsible for creating and managing instances of the Plants class.
 * GRASP Pattern: Information Expert - This class knows how to add, display, and calculate the total value of plants.
 * GRASP Pattern: Polymorphism - Implements the PlantOperations interface, allowing it to be used polymorphically.
 */
public class PlantManager implements PlantOperations {

    private final List<Plants> plantList = new ArrayList<>();

    /**
     * Adds a plant to the plant list.
     * 
     * This method was generated with the assistance of ChatGPT based on the prompt:
     * "Implement the addPlant method for PlantManager in Java."
     */
    @Override
    public void addPlant(String name, String type, double price, String description) {
        Plants plant = new Plants(name, type, price, description);
        plantList.add(plant);
    }

    /**
     * Displays all plants in the plant list.
     */
    @Override
    public void displayPlants() {
        if (plantList.isEmpty()) {
            System.out.println("No plants available.");
            return;
        }
        for (Plants plant : plantList) {
            System.out.println(plant);
        }
    }

    /**
     * Calculates the total value of all plants in the plant list.
     * 
     * This method was generated with the assistance of ChatGPT based on the prompt:
     * "Implement the calculateTotalValue method for PlantManager in Java."
     */
    @Override
    public double calculateTotalValue() {
        double total = 0;
        for (Plants plant : plantList) {
            total += plant.getPrice();
        }
        return total;
    }
}
