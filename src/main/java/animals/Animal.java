package animals;

import food.Food;


public abstract class Animal {

   protected int satiety;

    public Animal(int satiety) {

        this.satiety = satiety;
    }


    public int getSatiety() {
        return satiety;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public abstract void eat(Food food);


}
