package animals;

import model.Size;

public class Rabbit extends Herbivore implements Run {


    public Rabbit(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Кролик прыгает");
    }

    @Override
    public Size getSize() {
        return Size.SMALL;
    }
}
