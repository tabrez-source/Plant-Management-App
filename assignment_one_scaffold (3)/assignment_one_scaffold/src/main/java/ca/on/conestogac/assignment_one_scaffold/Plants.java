package ca.on.conestogac.assignment_one_scaffold;

/**
 * The Plants class represents an individual plant.
 * 
 * GRASP Pattern: Information Expert - Holds the details about the plant, including name, type, price, and description.
 */
public class Plants {
    private final String name;
    private final String type;
    private final double price;  
    private final String description;

    // Constructor with all four parameters
    public Plants(String name, String type, double price, String description) {
        this.name = name;
        this.type = type;
        this.price = price;  
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return name + " (" + type + ") - $" + price + ": " + description;
    }
}
