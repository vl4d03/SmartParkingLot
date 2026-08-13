public abstract class Vehicle {
    private String model;
    private double maxSpeed;


    public Vehicle(String model, double maxSpeed){
        this.setModel(model);
        this.setMaxSpeed(maxSpeed);
    }


    public String getModel() { return this.model;}
    public double getMaxSpeed() { return this.maxSpeed;}


    public void setModel(String model) {
        if(model != null && !model.isEmpty()) {this.model = model;}
        else { System.out.println("Error: The model field cannot be empty . Write a model.");}
    }


    public void setMaxSpeed(double maxSpeed) {
        if(maxSpeed > 0.1) {this.maxSpeed = maxSpeed;}
        else {System.out.println("Error: Invalid speed. Speed must be > 0");
        }
    }

    public void printSpecs() {
        System.out.println("=== VEHICLE SPECS ===");
        System.out.println("Model: " + model + ", MaxSpeed: " + maxSpeed + " km/h.");
    }


    public abstract void move();
}

