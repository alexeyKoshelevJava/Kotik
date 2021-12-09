package animals;

public class Rabbit extends Herbivore implements Run {
    public Rabbit(String name, int satiety) {
        super(name, satiety);
    }

    @Override
    public void run() {
        System.out.println("Кролик прыгает");
    }
}
