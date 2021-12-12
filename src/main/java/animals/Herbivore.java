package animals;


import food.Food;
import food.Grass;
import food.WrongFoodException;


public abstract class Herbivore extends Animal<Animal> {


    public Herbivore(String name) {
        super(name);
    }

    @Override
    public void eat(Food food) throws WrongFoodException {
        if (food instanceof Grass) {
            Grass grass = (Grass) food;
            satiety += grass.getEnergy();
            System.out.println(getClass().getName() + " съел " + food.getClass().getName());
        } else {
            throw new WrongFoodException();

        }

    }
}