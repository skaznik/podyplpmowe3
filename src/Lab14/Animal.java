package Lab14;

public abstract class Animal {
    private String type;
    static private int instanceNumber;


    public Animal() {
        instanceNumber++;
    }
    abstract  public String getType();

    public void setType(String type) {
        this.type = type;
    }

    abstract public int getInstanceNumber();

    public void setInstanceNumber(int instanceNumber) {
        this.instanceNumber = instanceNumber;
    }
}
