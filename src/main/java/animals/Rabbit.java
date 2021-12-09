package animals;

public class Rabbit extends Herbivore implements Run {
    public Rabbit(int satiety) {
        super(satiety);
    }

    @Override
    public void run() {
        System.out.println("Кролик прыгает");
    }
}
