package entities;

public class Product {

    public int number;
    public String holder;
    public char opc;
    public double initialValue;

    public void addMoney(double initialValue) {
        this.initialValue += initialValue;
    }

    public void removeMoney(double initialValue) {
        this.initialValue -= initialValue + 5.0;
    }


    public String toString() {
        return "Account " + number +
                ", Holder: " + holder +
                ", Balance: $ " + String.format("%.2f", initialValue);
    }

}
