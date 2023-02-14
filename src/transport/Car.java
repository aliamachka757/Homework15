
package transport;

public class Car {
    private final String brand;
    private final String model;
    private final int year;
    private final String country;
    private final String bodyType;
    private final int seats;

    private String transmission;
    private String regNumber;
    private int engineVolume;
    private String color;
    private boolean summerTires;

    public Car(String brand, String model, int year, String country, String bodyType, int seats) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.country = country;
        this.bodyType = bodyType;
        this.seats = seats;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getSeats() {
        return seats;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission != null && (transmission.equalsIgnoreCase("automatic") || transmission.equalsIgnoreCase("manual"))) {
            this.transmission = transmission;
        } else {
            System.out.println("INvalid transmission type. Allowed types: Automatic, Manual.");
        }
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        if (regNumber != null && regNumber.matches("[A-Z]{2}\\d{4}[A-Z]{2}")) {
            this.regNumber = regNumber;
        } else {
            System.out.println("Invalid registration number. The format should be: XX1234XX.");
        }
    }

    public int getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(int engineVolume) {
        if (engineVolume > 0) {
            this.engineVolume = engineVolume;
        } else {
            System.out.println("Invalid engine volume. The value should be greater than 0.");
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color != null && !color.isBlank()) {
            this.color = color;
        } else {
            System.out.println("Invalid color value.");
        }
    }

    public boolean hasSummerTires() {
        return summerTires;
    }

    public void setSummerTires(boolean summerTires) {
        this.summerTires = summerTires;
    }

    public void changeTires(boolean summerTires) {
        setSummerTires(summerTires);
        System.out.println("Tires changed to " + (summerTires ? "summer" : "winter") + " tires.");
    }
}






