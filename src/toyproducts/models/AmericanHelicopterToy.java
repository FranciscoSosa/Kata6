package toyproducts.models;

import componentfactories.ComponentFactory;
import componentfactories.regionalcomponentfactories.AmericanComponentFactory;
import toyproducts.Toy;
import toyproducts.components.Engine;
import toyproducts.components.RotorBlade;

public class AmericanHelicopterToy implements Toy {
    private final Integer serialNumber;
    private final String type;
    private Engine engine;
    private RotorBlade rotorBlade;
    private final ComponentFactory factory;

    public AmericanHelicopterToy(Integer serialNumber){
        this.serialNumber = serialNumber;
        this.type = "American Helicopter";
        this.factory = new AmericanComponentFactory();
    }

    @Override
    public Integer getSerialNumber() {
        return this.serialNumber;
    }

    public String getType() {
        return this.type;
    }

    @Override
    public void pack(){
        System.out.printf("Packing '%s' with S/N '%s'\n", this.getType(), this.getSerialNumber());
    }

    @Override
    public void label(){
        System.out.printf("Labelling '%s' with S/N '%s'\n", this.getType(), this.getSerialNumber());
    }

    @Override
    public void prepare(){
        System.out.println("Preparing American Helicopter engine...");
        this.engine = this.factory.createEngine();
        System.out.println("Adding American rotor blade...");
        this.rotorBlade = this.factory.createRotorBLade();
    }

    @Override
    public String toString() {
        return "AmericanHelicopterToy{" + "serialNumber=" + serialNumber + '}';
    }
}
