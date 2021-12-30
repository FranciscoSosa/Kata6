package factories;

public class SerialNumberGenerator {
    private static SerialNumberGenerator serialNumberGenerator = null;
    private Integer serialNumber = 0;

    private SerialNumberGenerator(){}

    public static SerialNumberGenerator getInstance(){
        return serialNumberGenerator == null ?
                serialNumberGenerator = new SerialNumberGenerator(): serialNumberGenerator;
    }

    public Integer next(){ return this.serialNumber++; }

}
