package business;

import factories.SerialNumberGenerator;
import factories.ToyFactory;
import toyproducts.Toy;

import java.util.HashMap;
import java.util.Map;

public class ToyBusiness {
    private final Map<String, ToyFactory> toyFactories = new HashMap<>();

    public void add(String type, ToyFactory toyFactory){
        this.toyFactories.put(type, toyFactory);
    }

    public Toy produceToy(String type){
        return this.toyFactories.get(type).produceToy();
    }
}
