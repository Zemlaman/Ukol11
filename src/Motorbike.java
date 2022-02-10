public class Motorbike extends Car{
    final int cubicCapacity;
    final String type;

    public Motorbike(String name, int power, int cubicCapacity, String type){
        super(name, power);
        this.cubicCapacity = cubicCapacity;
        this.type = type;
    }

    public int getCubicCapacity() {
        return cubicCapacity;
    }

    public String getType() {
        return type;
    }

    @Override
    public void description() {
        System.out.println("skoro jako auto, ale jakoby půlka chápeš ne");
    }
}
