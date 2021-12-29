package business;

import toyproducts.Toy;

public abstract class ToyBusiness {
    protected final SerialNumberGenerator generator = new SerialNumberGenerator();

    public abstract Toy createToy(String type);
}
