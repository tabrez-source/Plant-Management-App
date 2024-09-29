package ca.on.conestogac.assignment_one_scaffold;

import java.util.ArrayList;
import java.util.List;

/**
 * The PartB class manages a list of plants.
 * 
 * GRASP Pattern: Creator - This class is responsible for creating and managing instances of the Plants class.
 * GRASP Pattern: Information Expert - This class knows how to add, display, and calculate the total value of plants.
 */
public class PartB {
    
    private final List<Plants> plantList = new ArrayList<>(); // List to hold plant items

    /**
     * Adds a new plant to the plant list.
     * 
     * This method was generated with the assistance of ChatGPT based on the prompt:
     * "Write a Java method to add a plant with name, type, price, and description to a list."
     */
    public void addPlant(String name, String type, double price, String description) {
        // Creator: Creates a new plant and adds it to the list.
        Plants plant = new Plants(name, type, price, description); 
        plantList.add(plant);
    }

    /**
     * Displays all plants in the plant list.
     */
    public void displayPlant() {
        // Information Expert: Displays all the plants in the list.
        if (plantList.isEmpty()) {
            System.out.println("No plant items available.");
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
     * "Write a Java method to calculate the total price of all plants in a list."
     */
    public double calculateTotalValue() {
        // Information Expert: Calculates the total value of all plants.
        double total = 0;
        for (Plants plant : plantList) {
            total += plant.getPrice();
        }
        return total;
    }
}
