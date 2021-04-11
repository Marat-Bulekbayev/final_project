package util;

import enums.SortingParameter;
import exception.NegativePercentageRangeException;
import exception.ParameterNotFoundException;
import model.candy.Candy;
import model.present.Present;

public class PresentManager {

    private PresentManager(){}

    public static void packCandyInThePresent(Present present, Candy... candies){
        for (Candy candy : candies) {
            present.getCandies().add(candy);
        }
    }

    public static double calculatePresentWeight(Present present) {
        double totalWeight = 0.0;
        for (Candy candy : present.getCandies()) {
            totalWeight += candy.getWeight();
        }
        return totalWeight;
    }

    public static void sortPresentByParameter(Present present, SortingParameter parameter) throws ParameterNotFoundException {
        switch (parameter) {
            case WEIGHT :
                System.out.println("Sorting present's content by " + parameter.getParameterName() + "...");
                present.getCandies().sort((o1, o2) -> (int) (o1.getWeight() - o2.getWeight()));
                break;
            case SUGAR_PERCENTAGE :
                System.out.println("Sorting present's content by " + parameter.getParameterName() + "...");
                present.getCandies().sort((o1, o2) -> (int) (o1.getSugarPercentage() - o2.getSugarPercentage()));
                break;
            default :
                throw new ParameterNotFoundException(parameter.name() + " not found. Try again");
        }
    }

    public static void findCandyBySugarPercentage(Present present, double lowerSugarPercentageIndicator, double upperSugarPercentageIndicator) throws NegativePercentageRangeException {
        if (lowerSugarPercentageIndicator < upperSugarPercentageIndicator) {
            System.out.println("Candies found by sugar percentage range " + (int)lowerSugarPercentageIndicator + "-" + (int)upperSugarPercentageIndicator + "%:");
            for (Candy candy : present.getCandies()) {
                if (candy.getSugarPercentage() >= lowerSugarPercentageIndicator && candy.getSugarPercentage() <= upperSugarPercentageIndicator) {
                    System.out.println("\t" + candy.toString() + ";");
                }
            }
        } else {
            throw new NegativePercentageRangeException(upperSugarPercentageIndicator + " must be greater than " + lowerSugarPercentageIndicator);
        }
    }
}
