package animals;

import food.Food;
import food.Meat;
import food.WrongFoodException;

public abstract class Carnivorous extends Animal<Animal> {


    public Carnivorous(String name) {
        super(name);
    }

    @Override
    public void eat(Food food) throws WrongFoodException {
        if (food instanceof Meat) {
            Meat meat = (Meat) food;
            satiety += meat.getEnergy();
            System.out.println(getClass().getName() + " съел " + food.getClass().getName());
        } else {
            throw new WrongFoodException();
        }

    }

}
