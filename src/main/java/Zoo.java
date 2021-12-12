import animals.*;

import model.Aviary;
import model.Size;


public class Zoo {
    private static Aviary<Carnivorous> carnivorousAviary = new Aviary<>(Size.LARGE);
    private static Aviary<Herbivore> herbivoreAviary = new Aviary<>(Size.SMALL);


    public static void fillCarnivorousAviary() {

        carnivorousAviary.addAnimal(new Bear("Белый медведь"));
        carnivorousAviary.addAnimal(new Kotik("Персидский котик"));
        carnivorousAviary.addAnimal(new Fish("Щука"));


    }

    public static void fillHerbivoreAviary() {

        herbivoreAviary.addAnimal(new Duck("утка восточноевропейская"));
        herbivoreAviary.addAnimal(new Rabbit("Белый кролик"));

    }

    public static Carnivorous getCarnivorous(String name) {
        return carnivorousAviary.getAnimal(name);


    }

    public static Herbivore getHerbivore(String name) {
        return herbivoreAviary.getAnimal(name);

    }


}
