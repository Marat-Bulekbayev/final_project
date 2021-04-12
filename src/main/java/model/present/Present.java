package model.present;

import model.candy.Candy;

import java.util.ArrayList;
import java.util.List;

import static util.PresentManager.calculatePresentWeight;

public class Present {

    private List<Candy> candies;
    private double totalWeight;

    public Present() {
        this.candies = new ArrayList<>();
        this.totalWeight = 0;
    }

    public List<Candy> getCandies() {
        return this.candies;
    }

    public double getTotalWeight() {
        return this.totalWeight;
    }

    public void printPresentContent() {
        System.out.println("Present:");
        for (Candy candy : this.candies) {
            System.out.println("\t" + candy.toString());
        }
        System.out.println();
    }

    public void printWeight() {
        System.out.println("Present's total weight is " + calculatePresentWeight(this) + " grams.\n");
    }

    @Override
    public String toString() {
        return "Present: " + "\n" + candies;
    }
}
