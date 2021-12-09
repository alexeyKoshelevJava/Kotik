package animals;

import food.Food;
import food.Meat;

public abstract class Carnivorous extends Animal {


    public Carnivorous(int satiety) {
        super(satiety);
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Meat) {
            Meat meat = (Meat) food;
            satiety += meat.getEnergy();
            System.out.println(getClass().getName() + " съел " + food.getClass().getName());
        } else {
            System.out.println("Я не могу есть твою еду, я ем мясо. Я же: " + getClass().getName() + " ,а ты мне дал: " + food.getClass().getName());
        }

    }

}
