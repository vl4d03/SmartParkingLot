public class EScooter extends Vehicle implements Electric {

    public EScooter(String model, double maxSpeed) {
        super(model, maxSpeed);
    }

    @Override
    public void move() {
        System.out.println("E-Scooter " + this.getModel() + " is driving at a speed of: " + this.getMaxSpeed() + " km/h");
    }


    @Override
    public void chargeBattery() {
        System.out.println("E-Scooter " + this.getModel() + " is charging from a standart 220-V outlet");
    }

}
