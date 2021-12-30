package factories;

import toyproducts.Toy;

public abstract class ToyFactory {
    private final SerialNumberGenerator generator = SerialNumberGenerator.getInstance();

    public Toy produceToy(){
        Toy toy = this.createToy(generator.next());
        toy.prepare();
        toy.pack();
        toy.label();
        return toy;
    }

    protected abstract Toy createToy(Integer serialNumber);
}
