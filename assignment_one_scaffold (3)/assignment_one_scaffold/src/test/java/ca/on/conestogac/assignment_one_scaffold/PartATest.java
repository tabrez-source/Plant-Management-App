package ca.on.conestogac.assignment_one_scaffold;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Test class for PartA.
 * 
 * This class contains tests to ensure that the methods in PartA behave as expected.
 */
public class PartATest {

    @Test
    public void testTagAndFilterClean() {
        PartA.PlantTagResult result = PartA.tagAndFilter("Aloe Vera", "a", "CLEAN");
        assertEquals("Aloe Ver", result.tagged_plant());
        assertEquals(1, result.tag_count());
    }

    @Test
    public void testTagAndFilterTag() {
        PartA.PlantTagResult result = PartA.tagAndFilter("This is a plant", "", "TAG");
        assertEquals("<p>This is a plant</p>", result.tagged_plant());
        assertEquals(0, result.tag_count());
    }

    @Test
    public void testTagAndFilterBoth() {
        PartA.PlantTagResult result = PartA.tagAndFilter("It's a plant", "p", "BOTH");
        assertEquals("Its a lant", result.tagged_plant());  // Removed 'p' and apostrophe
        assertEquals(1, result.tag_count()); // Count of removed 'p'
    }

    @Test
    public void testSolveLogicPuzzle() {
        String[][] result = PartA.solveLogicPuzzle();
        assertEquals("Bob", result[0][0]);
        assertEquals("Dog", result[1][0]);
        assertEquals("Priya", result[0][2]);
        assertEquals("Cat", result[1][2]);
    }

    @Test
    public void testNormalizeDataSet() {
        double[] dataSet = {0.0, 0.25, 0.5, 0.75, 1.0};
        double[] expectedNormalized = {0.0, 0.25, 0.5, 0.75, 1.0};

        double[] result = PartA.normalizeDataSet(dataSet, 0, 1);
        assertArrayEquals(expectedNormalized, result);
    }

    @Test
    public void testProportionalMeans() {
        double[] originalData = {0.0, 0.25, 0.5, 0.75, 1.0};
        double[] normalizedData = {0.0, 0.25, 0.5, 0.75, 1.0};

        assertTrue(PartA.proportionalMeans(originalData, normalizedData));
    }

    @Test
    public void testProportionalMedian() {
        double[] originalData = {0.0, 0.25, 0.5, 0.75, 1.0};
        double[] normalizedData = {0.0, 0.25, 0.5, 0.75, 1.0};

        assertTrue(PartA.proportionalMedian(originalData, normalizedData));
    }
}
