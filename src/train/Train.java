package train;

public class Train {
    int carriages;
    int drivers;
    int passengers;
    long length;
    String name;

    public Train() {
    }

    public Train(int carriages, int drivers, int passengers, long length, String name) {
        this.carriages = carriages;
        this.drivers = drivers;
        this.passengers = passengers;
        this.length = length;
        this.name = name;
    }

    public int getCarriages() {
        return carriages;
    }

    public void setCarriages(int carriages) {
        this.carriages = carriages;
    }

    public int getDrivers() {
        return drivers;
    }

    public void setDrivers(int drivers) {
        this.drivers = drivers;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Train{" +
                "carriages=" + carriages +
                ", drivers=" + drivers +
                ", passengers=" + passengers +
                ", length=" + length +
                ", name='" + name + '\'' +
                '}';
    }
}
