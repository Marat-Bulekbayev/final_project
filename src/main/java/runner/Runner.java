package runner;

import enums.SortingParameter;
import exception.NegativePercentageRangeException;
import exception.ParameterNotFoundException;
import model.candy.*;
import model.present.Present;

import static util.PresentManager.*;

public class Runner {

    public static void main(String[] args) {
        Candy caramel = new Caramel("Rachki", 125.15, 70);
        Candy chocolate = new Chocolate("Milka", 225.75, 85);
        Candy jellybean = new Jellybean("Starburst", 200.5, 40);
        Candy lollipop = new Lollipop("Chupa Chups", 85, 80);

        Present newYearPresent = new Present();

        packCandyInThePresent(newYearPresent, caramel, chocolate, jellybean, lollipop);

        newYearPresent.printWeight();

        try {
            sortPresentByParameter(newYearPresent, SortingParameter.WEIGHT);
            newYearPresent.printPresentContent();
            sortPresentByParameter(newYearPresent, SortingParameter.SUGAR_PERCENTAGE);
            newYearPresent.printPresentContent();
            findCandyBySugarPercentage(newYearPresent, 30, 75);
        } catch (ParameterNotFoundException | NegativePercentageRangeException e) {
            e.printStackTrace();
        }
    }
}
