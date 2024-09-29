package ca.on.conestogac.assignment_one_scaffold;

/**
 * Interface that defines the operations related to plants.
 * 
 * GRASP Pattern: Polymorphism - This interface allows different implementations (like PlantManager) to perform plant-related operations.
 */
public interface PlantOperations {
    void addPlant(String name, String type, double price, String description);
    void displayPlants();
    double calculateTotalValue();
}
