package by.java_tutorial.week4.simple_class_and_object.task10;

public class Airline {
    private String destination;
    private String number;
    private String aircraftType;
    private String departureTime;

    public Airline(String destination, String number, String aircraftType, String departureTime, String weekday) {
        this.destination = destination;
        this.number = number;
        this.aircraftType = aircraftType;
        this.departureTime = departureTime;
        this.weekday = weekday;
    }

    private String weekday;

    @Override
    public String toString() {
        return "Airline{" +
                "destination='" + destination + '\'' +
                ", number='" + number + '\'' +
                ", aircraftType='" + aircraftType + '\'' +
                ", departureTime='" + departureTime + '\'' +
                ", weekday='" + weekday + '\'' +
                '}';
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getWeekday() {
        return weekday;
    }

    public void setWeekday(String weekday) {
        this.weekday = weekday;
    }

}
