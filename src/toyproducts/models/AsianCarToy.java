package toyproducts.models;

import componentfactories.ComponentFactory;
import componentfactories.regionalcomponentfactories.AsianComponentFactory;
import toyproducts.Toy;
import toyproducts.components.Engine;
import toyproducts.components.Wheel;

public class AsianCarToy implements Toy {
    private final Integer serialNumber;
    private final String type;
    private Wheel[] wheels = new Wheel[4];
    private Engine engine;
    private final ComponentFactory factory;

    public AsianCarToy(Integer serialNumber) {
        this.serialNumber = serialNumber;
        this.type = "Asian Car";
        this.factory = new AsianComponentFactory();
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
        System.out.println("Preparing Asian Car engine...");
        this.engine = this.factory.createEngine();
        System.out.println("Adding Asian wheels ...");
        for (int i = 0; i < this.wheels.length - 1; i++) {
            this.wheels[i] = this.factory.createWheel();
        }
    }

    @Override
    public String toString() {
        return "AsianCarToy{" + "serialNumber=" + serialNumber + '}';
    }
}
