package model.candy;

public abstract class Candy {

    protected String name;
    protected double weight;
    protected double sugarPercentage;

    protected Candy(){}

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getSugarPercentage() {
        return sugarPercentage;
    }

    @Override
    public String toString() {
        return "Candy{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", sugarPercentage=" + sugarPercentage +
                '}';
    }
}
