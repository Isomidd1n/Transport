package vehicle;

public class Vehicle {
    int passengers;
    long length;
    long oilSize;
    String name;

    public Vehicle() {
    }

    public Vehicle(int passengers, long length, long oilSize, String name) {
        this.passengers = passengers;
        this.length = length;
        this.oilSize = oilSize;
        this.name = name;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    public long getOilSize() {
        return oilSize;
    }

    public void setOilSize(long oilSize) {
        this.oilSize = oilSize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "passengers=" + passengers +
                ", length=" + length +
                ", oilSize=" + oilSize +
                ", name='" + name + '\'' +
                '}';
    }
}
