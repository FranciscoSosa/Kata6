package componentfactories.regionalcomponentfactories;

import componentfactories.ComponentFactory;
import toyproducts.components.Engine;
import toyproducts.components.RotorBlade;
import toyproducts.components.Wheel;
import toyproducts.components.american.AmericanEngine;
import toyproducts.components.american.AmericanRotorBlade;
import toyproducts.components.american.AmericanWheel;
import toyproducts.components.asian.AsianEngine;

public class AmericanComponentFactory extends ComponentFactory {
    @Override
    public Wheel createWheel() {
        return new AmericanWheel();
    }

    @Override
    public Engine createEngine() {
        return new AmericanEngine();
    }

    @Override
    public RotorBlade createRotorBLade() {
        return new AmericanRotorBlade();
    }
}
