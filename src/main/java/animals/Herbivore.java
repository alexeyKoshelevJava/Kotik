package animals;


import food.Food;
import food.Grass;


public abstract class Herbivore extends Animal {
    public Herbivore(String name, int satiety) {
        super(name, satiety);
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Grass) {
            Grass grass = (Grass) food;
            satiety += grass.getEnergy();
            System.out.println(name + " съел " + food.getClass().getName());
        } else {
            System.out.println("Я не могу есть твою еду, я ем траву. Я же: " + name + " ,а ты мне дал: " + food.getClass().getName());
        }

    }

}
