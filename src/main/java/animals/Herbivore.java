package animals;


import food.Food;
import food.Grass;


public abstract class Herbivore extends Animal {



    @Override
    public void eat(Food food) {
        if (food instanceof Grass) {
            Grass grass = (Grass) food;
            satiety += grass.getEnergy();
            System.out.println(getClass().getName() + " съел " + food.getClass().getName());
        } else {
            System.out.println("Я не могу есть твою еду, я ем траву. Я же: " + getClass().getName() + " ,а ты мне дал: " + food.getClass().getName());
        }

    }

}
