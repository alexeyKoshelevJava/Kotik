import animals.*;
import employee.Worker;
import food.Food;
import food.Grass;
import food.Meat;
import model.Aviary;
import model.Size;


public class Zoo {
    Aviary<Carnivorous> carnivorousAviary = new Aviary<>(Size.LARGE);
    Aviary<Herbivore> herbivoreAviary = new Aviary<>(Size.SMALL);


    public static void fillCarnivorousAviary(Aviary<Carnivorous> aviary) {
       
        aviary.addAnimal(new Bear("Белый медведь"));
        aviary.addAnimal(new Kotik("Персидский котик"));
        aviary.addAnimal(new Fish("Щука"));


    }

    public static void fillHerbivoreAviary(Aviary<Herbivore> aviary) {

        aviary.addAnimal(new Duck("утка восточноевропейская"));
        aviary.addAnimal(new Rabbit("Белый кролик"));

    }

    public static Carnivorous getCarnivorous(Aviary<Carnivorous> aviary, String name) {
        return aviary.getAnimal(name);


    }

    public static Herbivore getHerbivore(Aviary<Herbivore> aviary, String name) {
        return aviary.getAnimal(name);

    }


}
