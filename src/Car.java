public class Car {
    final String name;
    final int power;

    public Car(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public void description() {
        System.out.println("4 kola, jeden volant a v případě báwa taky pořádnej motor, to je jasný mněhehehehe");
    }
}
