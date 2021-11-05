import java.util.Objects;

public class Car {

    private int maxSpeed;
    private int weight;
    private double volume;
    private String VIN;
    private String name;

    public Car(int maxSpeed, int weight, double volume, String VIN, String name) {
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.volume = volume;
        this.VIN = VIN;
        this.name = name;
    }



    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return VIN.equals(car.VIN);
    }

    @Override
    public int hashCode() {
        return Objects.hash(VIN);
    }
}

