public class Plane extends  Car{
    final String country;
    final int capacity;

    public Plane(String name, int power, String country, int capacity) {
        super(name, power);
        this.country = country;
        this.capacity = capacity;
    }

    public String getCountry() {
        return country;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public void description() {
        System.out.println("týbrďo, je to hrozně velký, dlouhý a vejde se do něj strašně moc, to bys neveřil");
    }
}
