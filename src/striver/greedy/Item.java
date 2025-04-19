package striver.greedy;

public class Item {

    private double weight;
    private double value;
    private double unitValue;


    public Item(double weight, double value, double unitValue) {
        this.weight = weight;
        this.value = value;
        this.unitValue = unitValue;
    }
    public Item(double weight, double value){
        this.weight = weight;
        this.value = value;
        this.unitValue = value/weight;
    }

    public double getUnitValue() {
        return unitValue;
    }

    public double getWeight() {
        return weight;
    }

    public double getValue() {
        return value;
    }
}
