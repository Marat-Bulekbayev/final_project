package model.present;

import model.candy.Candy;

import java.util.ArrayList;
import java.util.List;

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

    @Override
    public String toString() {
        return "Present: " + "\n" + candies;
    }
}
