public class Tesla extends Vehicle implements Electric,  GPSNavigable {
    private int batteryCapacity;


    public Tesla(String model, double maxSpeed, int batteryCapacity) {
        super(model, maxSpeed);
        this.setBatteryCapacity(batteryCapacity);
    }


    public int getBatteryCapacity() { return this.batteryCapacity; }


    public void setBatteryCapacity(int batteryCapacity) {
        if(batteryCapacity > 0) {this.batteryCapacity = batteryCapacity; }
        else {System.out.println("Error. Battery Capacity must be > 0.");}
    }


    @Override
    public void printSpecs() {
        System.out.println("=== VEHICLE SPECS ===");
        System.out.println("Model: " + this.getModel() + ", MaxSpeed: " + this.getMaxSpeed() + " km/h, Battery Capacity: " + batteryCapacity + " mAh");
    }


    @Override
    public void move() {
        System.out.println("Tesla " + this.getModel() + " is driving on the autobahn on autopilot at a speed of " + this.getMaxSpeed() + " km/h.");
    }


    @Override
    public void chargeBattery() {
        System.out.println("Tesla " + this.getModel() + " is charging at a Superstation charger. Capacity: " + batteryCapacity + " mah." );
    }


    @Override
    public void navigateTo(String destination) {
        System.out.println("Tesla " + this.getModel() + " is making the most optimal route to the point destination: " + destination);
    }
}
