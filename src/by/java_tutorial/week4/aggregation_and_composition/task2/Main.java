package by.java_tutorial.week4.aggregation_and_composition.task2;

public class Main {
    public static void main(String[] args) {

        Car test = new Car("Nissan", new Engine("MVX123", 20),
                new FuelTank(50000), 4);

        test.refuel();
        System.out.println(test.getFuelTank());
        //test.getFuelTank().refuel();
        test.run(1000);

        for (int i = 0; i < 4; i++) {
            Wheel checkWheel = test.getWheel(i);
            if (checkWheel.isBroken()) {
                checkWheel = new Wheel();
            }
            test.setWheel(i, checkWheel);
        }

        test.run(1000);
    }
}
