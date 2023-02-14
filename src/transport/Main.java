package transport;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla", 2022, "Japan", "Sedan", 5);
        car.setColor("Red");
        car.setEngineVolume((int) 1.8);
        car.setRegNumber("AB1234CD");
        car.setTransmission("Automatic");
        car.setSummerTires(false);

        System.out.println(car.getBrand() + " " + car.getModel());
        System.out.println("Year: " + car.getYear());
        System.out.println("Country: " + car.getCountry());
        System.out.println("Body type: " + car.getBodyType());
        System.out.println("Seats: " + car.getSeats());
        System.out.println("Color: " + car.getColor());
        System.out.println("Engine volume: " + car.getEngineVolume() + " L");
        System.out.println("Registration number: " + car.getRegNumber());
        System.out.println("Transmission: " + car.getTransmission());
        System.out.println("Summer tires: " + (car.hasSummerTires() ? "Yes" : "No"));

        car.changeTires(true);
    }
}




