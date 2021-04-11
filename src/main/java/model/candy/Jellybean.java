package model.candy;

public class Jellybean extends Candy {

    public Jellybean(String name, double weight, double sugarPercentage) {
        this.name = name;
        this.weight = weight;
        this.sugarPercentage = sugarPercentage;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public double getSugarPercentage() {
        return sugarPercentage;
    }

    @Override
    public String toString() {
        return "\"" + name + "\"" +
               " weight: " + weight +
               " sugar percentage: " + sugarPercentage + "%";
    }
}
