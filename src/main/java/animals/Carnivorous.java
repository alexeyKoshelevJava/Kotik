package animals;

import food.Food;
import food.Meat;

public abstract class Carnivorous extends Animal {

    public Carnivorous(String name, int satiety) {
        super(name, satiety);
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Meat) {
            Meat meat = (Meat) food;
            satiety += meat.getEnergy();
            System.out.println(name + " съел " + food.getClass().getName());
        } else {
            System.out.println("Я не могу есть твою еду, я ем мясо. Я же: " + name + " ,а ты мне дал: " + food.getClass().getName());
        }

    }

}
