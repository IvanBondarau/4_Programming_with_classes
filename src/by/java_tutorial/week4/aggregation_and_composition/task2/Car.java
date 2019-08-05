package by.java_tutorial.week4.aggregation_and_composition.task2;

public class Car {

    String model;
    Engine engine;
    FuelTank fuelTank;
    Wheel[] wheels;

    public Car(String model, Engine engine, FuelTank fuelTank, int numOfWheels) {
        this.model = model;
        this.engine = engine;
        this.fuelTank = fuelTank;
        System.out.println(this.fuelTank);
        this.wheels = new Wheel[numOfWheels];
        for (int i = 0; i < numOfWheels; i++) {
            wheels[i] = new Wheel();
        }
    }

    public void printMode() {
        System.out.println(model);
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public FuelTank getFuelTank() {
        return fuelTank;
    }

    public void setFuelTank(FuelTank fuelTank) {
        this.fuelTank = fuelTank;
    }

    public Wheel getWheel(int index)
        throws IndexOutOfBoundsException
    {
        if (index < 0 || index > wheels.length) {
            throw new IndexOutOfBoundsException("Invalid wheel index");
        }
        Wheel res = wheels[index];
        wheels[index] = null;
        return res;
    }

    public void setWheel(int index, Wheel wheel)
       throws IndexOutOfBoundsException
    {

       if (index < 0 || index > wheels.length) {
           throw new IndexOutOfBoundsException("Invalid wheel index");
       }

       wheels[index] = wheel;
    }

    public void replaceWheel(int index)
        throws IndexOutOfBoundsException
    {
       if (index < 0 || index > wheels.length) {
           throw new IndexOutOfBoundsException("Invalid wheel index");
       }

       setWheel(index, new Wheel());
    }

    public void refuel() {
        this.getFuelTank().refuel();
    }

    public void run(int kms) {
        try {
            for (int km = 0; km < kms; km++) {
                for (int wheel = 0; wheel < wheels.length; wheel++) {
                    if (wheels[wheel] == null) {
                        throw new Exception("No wheel #" + wheel);
                    }
                    if (wheels[wheel].isBroken()) {
                        throw new Exception("Km " + km + ": Wheel #" + wheel + " is broken");
                    }
                }

                if (engine.getPower() > fuelTank.getFuelResidue()) {
                    throw new Exception("Km " + km + ": Not enough fuel");
                }

                for (int wheel = 0; wheel < wheels.length; wheel++) {
                    wheels[wheel].run();
                }

                fuelTank.spend(engine.getPower());
            }
        } catch(Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}
