package ca.on.conestogac.assignment_one_scaffold;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PartBTest {

    private PartB partB;
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        partB = new PartB(); // Initialize the PartB instance
        System.setOut(new PrintStream(outputStream)); // Redirect System.out to capture the output
    }

    @Test
    public void testAddPlant() {
        // Add a plant and verify its addition
        partB.addPlant("Rose", "Flowering Plant", 10.0, "A type of woody perennial plant of the genus Rosa.");
        assertEquals(1, partB.calculateTotalValue(), "The plant list should have 1 item after adding.");
    }

    @Test
    public void testDisplayPlant() {
        // Add plants and display them
        partB.addPlant("Rose", "Flowering Plant", 10.0, "A type of woody perennial plant of the genus Rosa.");
        partB.addPlant("Bamboo", "Grass", 5.0, "A fast-growing plant in the grass family Poaceae.");

        // Call displayPlant and check the output
        partB.displayPlant();
        String output = outputStream.toString().trim();

        assertTrue(output.contains("Rose (Flowering Plant) - $10.0: A type of woody perennial plant of the genus Rosa."));
        assertTrue(output.contains("Bamboo (Grass) - $5.0: A fast-growing plant in the grass family Poaceae."));
    }

    @Test
    public void testCalculateTotalValue() {
        // Add plants and calculate total value
        partB.addPlant("Rose", "Flowering Plant", 10.0, "A type of woody perennial plant of the genus Rosa.");
        partB.addPlant("Bamboo", "Grass", 5.0, "A fast-growing plant in the grass family Poaceae.");

        double totalValue = partB.calculateTotalValue();
        assertEquals(15.0, totalValue, "The total value should be $15.0 for the two plants added.");
    }
}
