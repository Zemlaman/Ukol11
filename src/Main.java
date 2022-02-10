public class Main {
    public static void main(String[] args) {
        final Car car = new Car("báwo trojrčka 330xd 😎", 201);
        final Motorbike motorbike = new Motorbike("Kawasakiiiii", 1000000, 600, "závoďák motorka bžum");
        final Plane plane = new Plane("idk prostě letadlo, má 2 křídla nebo tak něco", 498, "CESKOOOOO", 158);

        System.out.println(car.getName());
        System.out.println(motorbike.getPower());
        System.out.println(plane.getCapacity());
        car.description();
        motorbike.description();
        plane.description();
    }
}
