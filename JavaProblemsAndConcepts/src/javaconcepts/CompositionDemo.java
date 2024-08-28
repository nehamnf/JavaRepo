package javaconcepts;

// Engine class
class Engine {
    private String type;

    public Engine(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

// Car class with strict composition
class Car {
    private String model;
    private Engine engine; // Car "has an" Engine

    // Constructor initializes the Engine internally
    public Car(String model) {
        this.model = model;
        this.engine = new Engine("V8"); // Car creates its own Engine
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void displayInfo() {
        System.out.println("Car Model: " + model);
        System.out.println("Engine Type: " + engine.getType());
    }
}

public class CompositionDemo {
    public static void main(String[] args) {
        Car car = new Car("Mustang");
//        Engine en = new Engine("diesel"); //even here engine can exist independently but in case of car if car object dies then engine object created with respect to it dies
//        System.out.println(en.getType()); //i.e car owns engine as instance of car is created inside the engine
        car.displayInfo();
    }
}
