package ca.on.conestogac.assignment_one_scaffold;

import java.util.Arrays;

/**
 * The PartA class is responsible for handling various operations including string filtering, 
 * solving logic puzzles, and normalizing datasets.
 * 
 * GRASP Pattern: Information Expert - This class is an Information Expert for operations related to 
 * string manipulation, logic puzzles, and data normalization.
 */
public class PartA {

    /**
     * A record that stores the result of a plant name filtering/tagging operation.
     * 
     * GRASP Pattern: Information Expert - Holds the result of the tagAndFilter operation.
     */
    public record PlantTagResult(String tagged_plant, int tag_count) {
        public boolean isEmpty() {
            return tagged_plant.isEmpty();
        }

        @Override
        public String toString() {
            return "Filtered String: " + tagged_plant + ", Removed Character Count: " + tag_count;
        }
    }

    // Enum representing names and pets for the logic puzzle
    enum Names { Bob, Priya, Lane, Yien, Jane }
    enum Pets { Dog, Cat, Fish, Bird, Hamster }
/**
     * Method for filtering/tagging strings based on the provided operation.
     * 
     * GRASP Pattern: Information Expert - Responsible for carrying out operations based on the inputs provided.
     * 
     * This method was generated with the assistance of ChatGPT based on the prompt:
     * "Create a Java method to filter and tag strings with operations CLEAN, TAG, and BOTH."
     */
    public static PlantTagResult tagAndFilter(String str, String remChar, String operation) {
        String result = str;
        int tag_count = 0;

        switch (operation) {
            case "CLEAN" -> {
                tag_count = str.length() - str.replace(remChar, "").length();
                result = str.replace(remChar, "");
            }
            case "TAG" -> {
                result = "<p>" + str + "</p>";
                tag_count = 0;
            }
            case "BOTH" -> {
                int apostropheCount = str.length() - str.replace("'", "").length();
                result = str.replace("'", "");
                tag_count = str.length() - str.replace(remChar, "").length() + apostropheCount;
            }
            default -> throw new IllegalArgumentException("Invalid operation: " + operation);
        }

        return new PlantTagResult(result, tag_count);
    }

    /**
     * Solves the logic puzzle of matching students to their pets.
     * 
     * GRASP Pattern: Information Expert - Responsible for solving the logic puzzle based on the provided clues.
     * 
     * This method was generated with the assistance of ChatGPT based on the prompt:
     * "Create a Java method to solve a logic puzzle matching students to their pets."
     */
    public static String[][] solveLogicPuzzle() {
        String[][] result = new String[2][5];
        Names[] students = Names.values();
        Pets[] pets = Pets.values();

        result[0][0] = students[0].name();
        result[1][0] = pets[0].name();

        result[0][1] = students[1].name();
        result[1][1] = pets[4].name();
        
        result[0][2] = students[2].name();
        result[1][2] = pets[1].name();
        
        result[0][3] = students[3].name();
        result[1][3] = pets[2].name();

        result[0][4] = students[4].name();
        result[1][4] = pets[3].name();

        return result;
    }

    /**
     * Normalizes a dataset between two arbitrary values.
     * 
     * GRASP Pattern: Information Expert - Handles the normalization of datasets.
     */
    public static double[] normalizeDataSet(double[] data, int a, int b) {
        double[] normalizedData = new double[data.length];
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;

        for (double value : data) {
            if (value < min) min = value;
            if (value > max) max = value;
        }

        for (int i = 0; i < data.length; i++) {
            normalizedData[i] = a + (data[i] - min) * (b - a) / (max - min);
        }

        return normalizedData;
    }

    /**
     * Checks if the means of two datasets are proportional.
     */
    public static Boolean proportionalMeans(double[] a, double[] b) {
        double originalMean = calculateMean(a);
        double normalizedMean = calculateMean(b);

        return (originalMean != 0) && (normalizedMean != 0) && (originalMean / normalizedMean == 1);
    }

    /**
     * Checks if the medians of two datasets are proportional.
     * 
     * This method was generated with the assistance of ChatGPT based on the prompt:
     * "Create a Java method to check if the medians of two datasets are proportional."
     */
    public static Boolean proportionalMedian(double[] a, double[] b) {
        double originalMedian = calculateMedian(a);
        double normalizedMedian = calculateMedian(b);

        return (originalMedian != 0) && (normalizedMedian != 0) && (originalMedian / normalizedMedian == 1);
    }

    private static double calculateMean(double[] data) {
        double sum = 0.0;
        for (double value : data) {
            sum += value;
        }
        return sum / data.length;
    }

    private static double calculateMedian(double[] data) {
        double[] sortedData = data.clone();
        Arrays.sort(sortedData);
        int n = sortedData.length;
        if (n % 2 == 0) {
            return (sortedData[n / 2 - 1] + sortedData[n / 2]) / 2.0;
        } else {
            return sortedData[n / 2];
        }
    }
}
