package factories.regionalfactories;

import factories.ToyFactory;
import toyproducts.Toy;
import toyproducts.models.AsianCarToy;

public class AsianCarToyFactory extends ToyFactory {
    @Override
    public Toy createToy(Integer serialNumber){
        return new AsianCarToy(serialNumber);
    }
}
