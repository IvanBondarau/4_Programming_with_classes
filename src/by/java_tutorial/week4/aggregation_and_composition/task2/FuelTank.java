package by.java_tutorial.week4.aggregation_and_composition.task2;

public class FuelTank {
    private int fuelResidue;
    private int maximumStock;

    public FuelTank(int maximumStock) {
        this.maximumStock = maximumStock;
        this.fuelResidue = 0;
    }

    public int getMaximumStock() {
        return maximumStock;
    }

    public int getFuelResidue() {
        return this.fuelResidue;
    }

    public void spend(int fuel) {
        this.fuelResidue -= fuel;
    }

    public void refuel() {
        this.fuelResidue = this.maximumStock;
    }
}
