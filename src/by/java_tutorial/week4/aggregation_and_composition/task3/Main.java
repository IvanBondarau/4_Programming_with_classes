package by.java_tutorial.week4.aggregation_and_composition.task3;

public class Main {

    public static void main(String[] args) {

        City mogilev = new City("Mogilev");
        District mogilevDistrict = new District("Mogilev district", mogilev, 330);

        City bobryisk = new City("Bobryisk");
        District bobryiskDistrict = new District("Bobryisk district", bobryisk, 234);

        Region mogilevRegion = new Region("Mogilev region", mogilev,
                new District[]{mogilevDistrict, bobryiskDistrict});

        City gomel = new City("Gomel");
        District gomelDistrict = new District("Gomel district", gomel, 256);

        City mazyr = new City("Mazyr");
        District mazyrDistrict = new District("Mazyr district", mazyr, 397);

        Region gomelRegion = new Region("Gomel region", gomel,
                new District[]{gomelDistrict, mazyrDistrict});

        City minsk = new City("Minsk");
        Country belarus = new Country("Republic of Belarus", minsk, new Region[]{gomelRegion, mogilevRegion});

        System.out.println("Country: " + belarus.getName());
        System.out.println("Square: " + belarus.getSquare());
        for(int i = 0; i < belarus.getNumOfRegions(); i++) {
            System.out.println("Region: " + belarus.getRegion(i).getName());
            System.out.println("Centre: " + belarus.getRegion(i).getCentre().getName());
        }
    }
}
